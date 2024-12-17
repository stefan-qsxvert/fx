package org.app;

import java.io.File;
import java.util.List;

import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class EventAction implements EventHandler<Event>{
	
	String arcType;
	Edeklaracje edeklaracje;
	FxComponents fxComponents;
	Gui gui;
	Stage stage;
	AppObjects appObjects;
	
	public EventAction(String arcType, AppObjects appObjects) {
		this.arcType = arcType;
		this.appObjects = appObjects;
//		this.stage = stage;
		setUp();
	}
	public EventAction(String arcType) {
		this.arcType = arcType;
		setUp();
	}
	public EventAction() {
		setUp();
	}
	
	private void setUp() {
		edeklaracje = new Edeklaracje();
		fxComponents = new FxComponents(appObjects);
	}
		
	
	@Override
	public void handle(Event arg0) {
		// TODO Auto-generated method stub
		
//		String typ = arg0.getEventType().getName(); // toString();
//		String source = arg0.getSource().toString();
//		String target = arg0.getTarget().toString();
		
//		if (typ == "MOUSE_PRESSED")
		{ 
			switch(arcType) {
			case "prd":
				System.out.println("case produkcja");
				break;
			case "pobierz UPO":
				File file = new File("/home/tee/refIds/");
				String[] fileList = file.list();
				for (int i = 0; i < fileList.length; i++) {
				edeklaracje.getUPO(fileList[i]);
				}
				System.out.println("case test");
				break;
			case "generuj wsdl":
				String wsdl = "https://test-bramka.edeklaracje.gov.pl/uslugi/dokumenty?wsdl";
				WsdlToJavaGenerator wsdlToJavaGenerator = new WsdlToJavaGenerator();
				wsdlToJavaGenerator.generateTestWsdlSource("test", wsdl);
				break;
			case "wybierz pliki":
				List<File>  pliki = fxComponents.fileChooser(stage);
				
				File[] files = new File[pliki.size()];
				
				int i = 0;
				for (File f : pliki) {
					files[i] = new File(f.getAbsolutePath());
					System.out.println(files[i].getName());
					i++;
				}
				
				ObservableList<File> files0 = appObjects.getFiles0();
				files0.clear();
				files0.addAll(files);
				TableView<File> tableView = appObjects.getTableView();
				tableView.setItems(files0);
				
				break;
			case "test":
				ProgressBar progressBar = appObjects.getProgressBar();
				break;
			default:
				System.out.println("brak zdefiniiowanego działania");
				break;
			}
		}
		
//		return arg0;
	}
	
}
