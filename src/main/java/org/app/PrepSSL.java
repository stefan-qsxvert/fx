package org.app;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.SecureRandom;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

public class PrepSSL {
	
	private AppObjects appObjects;
	
	public PrepSSL(AppObjects appObjects) {
		this.appObjects = appObjects;
	}

	public SSLContext getSSLContext() { 
		
		
		SSLContext sslContext = null;
	try {
//		
		KeyStore keyStore = KeyStore.getInstance("JKS"); 
		keyStore.load(new FileInputStream(new File(appObjects.getCertLocationPathField().getText())), "qqq111".toCharArray()); 
		sslContext = SSLContext.getInstance("TLS");
		// Inicjalizuj SSLContext z trustManager i keyManager
		
		KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		keyManagerFactory.init(keyStore, "qqq111".toCharArray());
		 
		TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		trustManagerFactory.init(keyStore);
		 
//	      SecureRandom random = new SecureRandom();
//	      byte bytes[] = new byte[20];
//	      random.nextBytes(bytes);
		 
		KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
	    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
		 
		sslContext.init(keyManagers,trustManagers,new SecureRandom());
		 
//		SSLEngine sslEngine = sslContext.createSSLEngine();
//		sslEngine.setUseClientMode(true);
//		sslEngine.beginHandshake();
		
//		System.setProperty("javax.net.ssl.keyStore",appObjects.getCertLocationPath().getText());
//		System.setProperty("javax.net.ssl.keyStorePassword", "qqq111");
//		System.setProperty("javax.net.ssl.keyStoreType", "JKS");
		
		System.out.println("Kontekst SSL stwożony i zainicjowany!");
		
	} catch (Exception e) { 
		e.printStackTrace(); 
	}
	
	return sslContext;
	}
}

