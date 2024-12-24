package org.app;

import java.io.File;
import java.util.List;

import javafx.collections.FXCollections;
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
			EventActionMethods eventActionMethods = new EventActionMethods(appObjects);
			
		switch(arcType.toLowerCase()) {
			case "0":
				eventActionMethods.setPitObservableList();
				break;
			case "1":
				System.out.println("wyślij");
				break;
			case "2":
				eventActionMethods.getAllUPOs();
				break;
			case "3":
				eventActionMethods.setUpoObservableList();
				break;
			case "9":
				eventActionMethods.setCaCertsTest();
				break;	
				
			case "generuj wsdl":
				String wsdl = "https://test-bramka.edeklaracje.gov.pl/uslugi/dokumenty?wsdl";
//				WsdlToJavaGenerator wsdlToJavaGenerator = new WsdlToJavaGenerator();
//				wsdlToJavaGenerator.generateTestWsdlSource("test", wsdl);
				
				break;

			case "tab1":
				
				uris.setTestMode(appObjects.getCheckBox().isPressed());
				System.out.println(uris.getBramka());
				uris.setTestMode(appObjects.getCheckBox().isPressed());
				System.out.println(uris.getBramka());
				
//				progressBar.setProgress(progressBar.getProgress() +0.01);
				break;
			default:
				eventActionMethods.setDefaultAction();
				break;
			}
		}
	}
	
}
