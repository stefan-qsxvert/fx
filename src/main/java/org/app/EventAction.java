package org.app;

import java.io.File;
import java.util.List;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;


public class EventAction implements EventHandler<Event>{
	
	String arcType;
	AppObjects appObjects;
	File file;
//	
	public EventAction(AppObjects appObjects, String arcType) {
		this.arcType = arcType;
		this.appObjects = appObjects;
	}
	
	@Override
	public void handle(Event arg0) {
		// TODO Auto-generated method stub
		Uris uris = appObjects.getUris();
		ProgressBar progressBar = appObjects.getProgressBar();
		FileChooser fileChooser = null;
//		progressBar.setProgress(0.1);
		{ 
			switch(arcType.toLowerCase()) {
			case "7":
				fileChooser = appObjects.getFileChooser();
				fileChooser.getExtensionFilters().clear();
				fileChooser.getExtensionFilters().add(new ExtensionFilter("jks", "*.jks"));
				
				File cacert = fileChooser.showOpenDialog(appObjects.getStage());
				appObjects.getCertLocationPath().setText(cacert.getPath());
				break;
			case "prd":
				System.out.println("case produkcja");
				break;
			case "2":
				file = new File("/home/tee/refIds/");
				String[] fileList = file.list();
//				Double e = (double) ((1/Double.valueOf( fileList.length))/1);
//				System.out.println(e);
				for (int i = 0; i < fileList.length; i++) {
					appObjects.getEdeklaracje().getUPO(fileList[i]);
//					progressBar.setProgress(progressBar.getProgress() + e);
				}
				
				break;
			case "1":
				System.out.println("wyślij");
			
			case "generuj wsdl":
				String wsdl = "https://test-bramka.edeklaracje.gov.pl/uslugi/dokumenty?wsdl";
//				WsdlToJavaGenerator wsdlToJavaGenerator = new WsdlToJavaGenerator();
//				wsdlToJavaGenerator.generateTestWsdlSource("test", wsdl);
				
				break;
			case "0":
				fileChooser = appObjects.getFileChooser();
				fileChooser.getExtensionFilters().clear();
				fileChooser.getExtensionFilters().add(new ExtensionFilter("PIT", "*.xml"));
				
				List<File> pliki = fileChooser.showOpenMultipleDialog(appObjects.getStage());
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
