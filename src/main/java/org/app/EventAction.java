package org.app;

import javafx.event.Event;
import javafx.event.EventHandler;


public class EventAction implements EventHandler<Event>{
	
	private AppObjects appObjects;
	
	public EventAction(AppObjects appObjects) {
		this.appObjects = appObjects;
	}
	
	@Override
	public void handle(Event arg0) {

//		EventActionMethods eventActionMethods = appObjects.getEventActionMethods();
		
		
		if (arg0.getSource() == appObjects.getSelectPitsButton()) {
//			eventActionMethods.setPitObservableList();
			appObjects.getPrepRunnable().setArcType("selectPitFiles");
			appObjects.getPrepRunnable().run();
		} else if (arg0.getSource() == appObjects.getSelectUposButton()) {	
			appObjects.getPrepRunnable().setArcType("selectUpoFiles");
			appObjects.getPrepRunnable().run();
		}else if (arg0.getSource() == appObjects.getLoadCertButton()) {
			appObjects.getPrepRunnable().setArcType("loadCert");
			appObjects.getPrepRunnable().run();
		}else if (arg0.getSource() == appObjects.getCertLocationPathField()) {
			appObjects.getPrepRunnable().setArcType("selectJKS");
			appObjects.getPrepRunnable().run();
		}else if (arg0.getSource() == appObjects.getDownloadUposButton()) {
			appObjects.getProgressBar().setProgress(0);
			appObjects.getProgressIndicator().setProgress(0);
			appObjects.getPrepRunnable().setArcType("downloadUPOs");
			new Thread(appObjects.getPrepRunnable()).start();
		}else if (arg0.getSource() == appObjects.getSendPitsButton()) {
			appObjects.getProgressIndicator().setProgress(0);
			appObjects.getProgressBar().setProgress(0);
			
			appObjects.getPrepRunnable().setArcType("sentPits");
			Thread.startVirtualThread(appObjects.getPrepRunnable());
		}else if (arg0.getSource() == appObjects.getTestButton()) {
			appObjects.getProgressIndicator().setProgress(0);
			appObjects.getProgressBar().setProgress(0);
			appObjects.getPrepRunnable().setArcType("testAction");
			new Thread(appObjects.getPrepRunnable()).start();;
	}
	
}
	}
