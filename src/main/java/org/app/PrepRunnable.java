package org.app;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import javax.net.ssl.SSLException;

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
		case "loadCert":
			System.out.println("loadCert");
			try {
				eventActionMethods.loadCertToJks();
			} catch (CertificateException | KeyStoreException | NoSuchAlgorithmException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "selectJKS":
			System.out.println("selectJKS");
			eventActionMethods.setCertsJksPathField();
			break;
		case "sentPits":
			System.out.println("sentPits");
			eventActionMethods.sendAllPits();
			break;
		case "downloadUPOs":
			System.out.println("downloadUPOs");
			try {
				eventActionMethods.getAllUPOs();
			} catch (SSLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
