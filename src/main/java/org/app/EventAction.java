package org.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.stream.Stream;

import javax.net.ssl.SSLException;

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
//		Uris uris = appObjects.getUris();
//		ProgressBar progressBar = appObjects.getProgressBar();
//		FileChooser fileChooser;
//		progressBar.setProgress(0.1);
		{ 
			EventActionMethods eventActionMethods = new EventActionMethods(appObjects);
			
		switch(arcType.toLowerCase()) {
			case "0":
				eventActionMethods.setPitObservableList();
				break;
			case "1":
				eventActionMethods.sendAllPits();
				break;
			case "2":
			try {
				eventActionMethods.getAllUPOs();
			} catch (SSLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
			case "3":
				eventActionMethods.setUpoObservableList();
				break;
			case "4":
			try {
				eventActionMethods.loadCertToJks();
			} catch (CertificateException | KeyStoreException | NoSuchAlgorithmException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
			case "5":
				eventActionMethods.setCertsJks();
				break;
				
			case "generuj wsdl":
				String wsdl = "https://test-bramka.edeklaracje.gov.pl/uslugi/dokumenty?wsdl";
//				WsdlToJavaGenerator wsdlToJavaGenerator = new WsdlToJavaGenerator();
//				wsdlToJavaGenerator.generateTestWsdlSource("test", wsdl);
				
				break;

			default:
				eventActionMethods.setDefaultAction();
				break;
			}
		}
	}
	
}
