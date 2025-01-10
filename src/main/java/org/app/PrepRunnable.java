package org.app;

public class PrepRunnable implements Runnable{
	
	public AppObjects appObjects;
	public String arcType;
	public EventActionMethods eventActionMethods;
	
	public PrepRunnable(AppObjects appObjects) {
		this.appObjects = appObjects;
		eventActionMethods = appObjects.getEventActionMethods();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		switch (arcType) {
		case "testAction":
			System.out.println("test action");
			break;
		case "downloadUpos":
			System.out.println("downloadUpos");
			break;
		case "sentPits":
			System.out.println("sentPits");
			break;
		default:
			System.out.println("Brak zdefiniowanego działania!");
		}
	}

	public AppObjects getAppObjects() {
		return appObjects;
	}

	public void setAppObjects(AppObjects appObjects) {
		this.appObjects = appObjects;
	}

	public String getArcType() {
		return arcType;
	}

	public void setArcType(String arcType) {
		this.arcType = arcType;
	}	
						
	
}
