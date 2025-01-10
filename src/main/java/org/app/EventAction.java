package org.app;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLException;
import javafx.event.Event;
import javafx.event.EventHandler;


public class EventAction implements EventHandler<Event>{
	
	private AppObjects appObjects;
	
	public EventAction(AppObjects appObjects) {
		this.appObjects = appObjects;
	}
	
	@Override
	public void handle(Event arg0) {

		EventActionMethods eventActionMethods = appObjects.getEventActionMethods();
		
		
		if (arg0.getSource() == appObjects.getSelectPitsButton()) {
			eventActionMethods.setPitObservableList();
		} else if (arg0.getSource() == appObjects.getSelectUposButton()) {
			eventActionMethods.setUpoObservableList();
		}else if (arg0.getSource() == appObjects.getLoadCertButton()) {
			
			try {
				eventActionMethods.loadCertToJks();
			} catch (CertificateException | KeyStoreException | NoSuchAlgorithmException | IOException e) {
				e.printStackTrace();
			}
		}else if (arg0.getSource() == appObjects.getCertLocationPathField()) {
			eventActionMethods.setCertsJksPathField();
		}else if (arg0.getSource() == appObjects.getTestButton()) {
			appObjects.getPrepRunnable().setArcType("testAction");
			appObjects.getPrepRunnable().run();
		}else if (arg0.getSource() == appObjects.getDownloadUposButton()) {
			appObjects.getPrepRunnable().setArcType("downloadUpos");
			Thread.startVirtualThread(appObjects.getPrepRunnable());
		}else if (arg0.getSource() == appObjects.getSendPitsButton()) {
			appObjects.getPrepRunnable().setArcType("sentPits");
			Thread.startVirtualThread(appObjects.getPrepRunnable());
		}
	}
	
}
