package org.app;

import java.io.File;
import java.util.List;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableView;


public class EventAction implements EventHandler<Event>{
	
	String arcType;
	AppObjects appObjects;
//	
	public EventAction(String arcType, AppObjects appObjects) {
		this.arcType = arcType;
		this.appObjects = appObjects;
	}
	
	@Override
	public void handle(Event arg0) {
		// TODO Auto-generated method stub
		Uris uris = appObjects.getUris();
		ProgressBar progressBar = appObjects.getProgressBar();
//		progressBar.setProgress(0.1);
		{ 
			switch(arcType.toLowerCase()) {
			case "prd":
				System.out.println("case produkcja");
				break;
			case "pobierz upo":
				File file = new File("/home/tee/refIds/");
				String[] fileList = file.list();
				Double e = (double) ((1/Double.valueOf( fileList.length))/1);
				System.out.println(e);
				for (int i = 0; i < fileList.length; i++) {
					appObjects.getEdeklaracje().getUPO(fileList[i]);
					progressBar.setProgress(progressBar.getProgress() + e);
				}
				
				break;
			case "generuj wsdl":
				String wsdl = "https://test-bramka.edeklaracje.gov.pl/uslugi/dokumenty?wsdl";
//				WsdlToJavaGenerator wsdlToJavaGenerator = new WsdlToJavaGenerator();
//				wsdlToJavaGenerator.generateTestWsdlSource("test", wsdl);
				
				break;
			case "wybierz pliki":
				List<File>  pliki = appObjects.getFileChooser().showOpenMultipleDialog(appObjects.getStage());
				
				File[] files = new File[pliki.size()];
				
				int i = 0;
				for (File f : pliki) {
					files[i] = new File(f.getAbsolutePath());
					i++;
				}
				
				ObservableList<File> files0 = appObjects.getFiles0();
				files0.clear();
				files0.addAll(files);
				TableView<File> tableView = appObjects.getTableView();
				tableView.setItems(files0);
				
				progressBar.setProgress(0);
				break;
			case "wyślij":
				System.out.println(progressBar.getProgress());
				progressBar.setProgress(progressBar.getProgress() +0.01);
				
				break;
			case "tab1":
				
				uris.setTestMode(appObjects.getCheckBox().isPressed());
				System.out.println(uris.getBramka());
				uris.setTestMode(appObjects.getCheckBox().isPressed());
				System.out.println(uris.getBramka());
				
//				progressBar.setProgress(progressBar.getProgress() +0.01);
				break;
			default:
//				System.out.println("brak zdefiniiowanego działania");
				progressBar.setProgress(0);
				System.out.println(appObjects.getCheckBox() + " " + appObjects.getCheckBox().isSelected());
				break;
			}
		}
	}
	
}
