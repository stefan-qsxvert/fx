package org.app;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLException;
import javafx.event.Event;
import javafx.event.EventHandler;


public class EventAction implements EventHandler<Event>{
	
//	private String arcType;
	private AppObjects appObjects;
//	private File file;
//	
	public EventAction(AppObjects appObjects) {
//		this.arcType = arcType;
		this.appObjects = appObjects;
	}
	
	@Override
	public void handle(Event arg0) {


//		ProgressBar progressBar = appObjects.getProgressBar();
//		ProgressIndicator progressIndicator = appObjects.getProgressIndicator();
//		
		EventActionMethods eventActionMethods = new EventActionMethods(appObjects);
			
//--------------------------------	
			if (arg0.getSource() == appObjects.getSelectPitsButton()) {
				eventActionMethods.setPitObservableList();
			} else if (arg0.getSource() == appObjects.getSelectUposButton()) {
				eventActionMethods.setUpoObservableList();
			}else if (arg0.getSource() == appObjects.getSendPitsButton()) {
				eventActionMethods.sendAllPits();
			}else if (arg0.getSource() == appObjects.getDownloadUposButton()) {
			
				try {
					eventActionMethods.getAllUPOs();
				} catch (SSLException e) {
					e.printStackTrace();
				}
			}else if (arg0.getSource() == appObjects.getLoadCertButton()) {
				
				try {
					eventActionMethods.loadCertToJks();
				} catch (CertificateException | KeyStoreException | NoSuchAlgorithmException | IOException e) {
					e.printStackTrace();
				}
				
			}else if (arg0.getSource() == appObjects.getCertLocationPathField()) {
				eventActionMethods.setCertsJksPathField();
			}else if (arg0.getSource() == appObjects.getTestButton()) {
				System.out.println(arg0);
			}else if (true) {
				System.out.println("else action");
			}
			
			
			
//		switch(arcType) {
//			case "0" :
////				eventActionMethods.setPitObservableList();
//				break;
//			case "1":
//				eventActionMethods.sendAllPits();
//				break;
//			case "2":
//			try {
//				eventActionMethods.getAllUPOs();
//			} catch (SSLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//				break;
//			case "3":
//				eventActionMethods.setUpoObservableList();
//				break;
//			case "4":
//			try {
//				eventActionMethods.loadCertToJks();
//			} catch (CertificateException | KeyStoreException | NoSuchAlgorithmException | IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//				break;
//			case "5":
//				eventActionMethods.setCertsJks();
//				break;
//				
//			case "generuj wsdl":
//				String wsdl = "https://test-bramka.edeklaracje.gov.pl/uslugi/dokumenty?wsdl";
////				WsdlToJavaGenerator wsdlToJavaGenerator = new WsdlToJavaGenerator();
////				wsdlToJavaGenerator.generateTestWsdlSource("test", wsdl);
//				
//				break;
//
//			default:
//				eventActionMethods.setDefaultAction();
//				progressBar.setProgress(0);
//				progressIndicator.setProgress(0);
//				
////				Task<Void> task = new Task<Void>() {
////					
//					@Override
//					protected Void call() throws Exception {
//						// TODO Auto-generated method stub
//						Platform.runLater(new Runnable() {
//							
//							@Override
//							public void run() {
//								// TODO Auto-generated method stub
//								for (int i = 0; i <= 1; i+=0.1) {
//									try {
//									Thread.sleep(100);
//								progressBar.setProgress(i/100); 
//								}catch(Exception e) {
//									
//								}
//								}
//							}
//						});
//						
//					return null;
////					}
//					
//					public void str() {
//						try {
//							call();
//						} catch (Exception e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//				};
//				
//
//				task.;
				
//				try {
//				for (double i = 0; i <= 1; i += 0.1) {
//					
//					progressBar.setProgress(i);
//					progressIndicator.setProgress(i);
//					Thread.sleep(100);
//				}
//				} catch( Exception e) {
//					
//				}
//				break;
//			}
		}
	
}
