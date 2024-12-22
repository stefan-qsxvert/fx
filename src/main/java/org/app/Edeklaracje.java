package org.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.time.ZonedDateTime;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import com.test.edeklaracje.GateService;
import com.test.edeklaracje.GateServicePortType;
import com.test.edeklaracje.RequestUPO;

import jakarta.xml.ws.Holder; 

public class Edeklaracje {
	
	Holder<String> refId;
	Holder<Integer> status;
	Holder<String> statusOpis;
	Holder<String> upo;
//	byte[] document;
	String id;
	AppObjects appObjects;
	
	public Edeklaracje(byte[] document, Holder<String> refId, Holder<Integer> status, Holder<String> statusOpis, AppObjects appObjects) {
//		this.document = document;
		this.refId = refId;
		this.status = status;
		this.statusOpis = statusOpis;
		this.appObjects = appObjects;
	}
	
	public Edeklaracje(Holder<String> refId, Holder<Integer> status, Holder<String> statusOpis, AppObjects appObjects) {
		this.refId = refId;
		this.status = status;
		this.statusOpis = statusOpis;
		this.appObjects = appObjects;
	}
	
	public Edeklaracje(AppObjects appObjects) {
		this.appObjects = appObjects;
	}
	
		public void sendDoc(byte[] document) {
			try { 

//				
				KeyStore keyStore = KeyStore.getInstance("JKS"); 
				keyStore.load(new FileInputStream(new File(appObjects.getCertLocationPath().getText())), "qqq111".toCharArray()); 
				SSLContext sslContext = SSLContext.getInstance("TLS");
				// Inicjalizuj SSLContext z trustManager i keyManager
				
				 KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
				 keyManagerFactory.init(keyStore, "qqq111".toCharArray());
				 
				 TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
				 trustManagerFactory.init(keyStore);
				 
//			      SecureRandom random = new SecureRandom();
//			      byte bytes[] = new byte[20];
//			      random.nextBytes(bytes);
				 
			      KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
			      TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
				 
				 sslContext.init(keyManagers,trustManagers,new SecureRandom());
				 
				 SSLEngine sslEngine = sslContext.createSSLEngine();
				 sslEngine.beginHandshake();
				 
//				System.setProperty("javax.net.ssl.keyStore",appObjects.getCertLocationPath().getText());
//				System.setProperty("javax.net.ssl.keyStorePassword", "qqq111");
//				System.setProperty("javax.net.ssl.keyStoreType", "JKS");
				
					GateService service = new GateService(); 
					GateServicePortType port = service.getGateServiceSOAP11Port(); // Przykładowe wywołanie operacji 
					
					//document = new Byte{0,1,0,1};
					
					refId = new Holder<String>();
					status = new Holder<Integer>();
					statusOpis = new Holder<String>();
					
//					refId = new Holder("88a60f9d03045f163e10790ace36ebc3");
					
					port.sendDocument(document, refId, status, statusOpis); 
					System.out.println("Response: " + refId.value );
					System.out.println("Response: " + status.value );
					System.out.println("Response: " + statusOpis.value );
					
					File file = new File("/home/tee/refIds/" + refId.value);
					file.createNewFile();
					System.out.println(file.exists());
					BufferedWriter bfw = new BufferedWriter(new FileWriter(file));
					bfw.newLine();
					bfw.write(ZonedDateTime.now().toString() + "_" + refId.value + "_" + status.value + "_" + statusOpis.value);
					bfw.flush();
					bfw.close();
					
				} catch (Exception e) { 
						e.printStackTrace();
				} 

		}
		
		public void listOfDocument(String list) throws IOException {
			File file = new File(list);
			BufferedReader bfReader = new BufferedReader(new FileReader(file));
//			String listOfRfIds = bfReader.lines().toArray().toString();
//			List<String> listOfRfIds = bfReader.lines().toList();
			String[] listOfRfIds = bfReader.lines().toList().toString().split(";");
			bfReader.close();
			for (int i =0; i < listOfRfIds.length; i++) {
				System.out.println(listOfRfIds[i]);
		    }
			
			
			System.out.println(file.exists());
			
//			}
			
		}
		
		public void getUPO(String refId) {
			
			try { 
//				
				KeyStore keyStore = KeyStore.getInstance("JKS"); 
				keyStore.load(new FileInputStream(new File(appObjects.getCertLocationPath().getText())), "qqq111".toCharArray()); 
				SSLContext sslContext = SSLContext.getInstance("TLS");
				// Inicjalizuj SSLContext z trustManager i keyManager
				
				 KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
				 keyManagerFactory.init(keyStore, "qqq111".toCharArray());
				 
				 TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
				 trustManagerFactory.init(keyStore);
				 
//			      SecureRandom random = new SecureRandom();
//			      byte bytes[] = new byte[20];
//			      random.nextBytes(bytes);
				 
				 KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
			      TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
				 
				 sslContext.init(keyManagers,trustManagers,new SecureRandom());
				 
				 SSLEngine sslEngine = sslContext.createSSLEngine();
				 sslEngine.setUseClientMode(true);
				 sslEngine.beginHandshake();
				
//				System.setProperty("javax.net.ssl.keyStore",appObjects.getCertLocationPath().getText());
//				System.setProperty("javax.net.ssl.keyStorePassword", "qqq111");
//				System.setProperty("javax.net.ssl.keyStoreType", "JKS");
				
//				// Utwórz instancję usługi 
				GateService service = new GateService(); 
				GateServicePortType port = service.getGateServiceSOAP11Port(); 
				// Utwórz żądanie UPO 
				RequestUPO requestUPO = new RequestUPO(); 
				
				upo = new Holder<String>();
				status = new Holder<Integer>();
				statusOpis = new Holder<String>();
				
				
				// Wywołaj metodę requestUPO 
				port.requestUPO(refId.replace(".xml",""), "pl", upo, status, statusOpis);
								
				System.out.println("UPO status: " + upo.value + " " + status.value + " " + statusOpis.value);
				BufferedWriter bfw = new BufferedWriter(new FileWriter("/home/tee/refIds/" + refId));
				bfw.newLine();
				if (upo.value == null) {
					upo = new Holder<String>("0");
				}
				bfw.write(ZonedDateTime.now().toString() + "_" + refId + "_" + status.value + "_" + statusOpis.value);
				bfw.newLine();
				bfw.write(upo.value);
				bfw.flush();
				bfw.close();
			
			} catch (Exception e) { 
				e.printStackTrace(); 
				}
			}

		public Holder<String> getRefId() {
			return refId;
		}

		public void setRefId(Holder<String> refId) {
			this.refId = refId;
		}

		public Holder<Integer> getStatus() {
			return status;
		}

		public void setStatus(Holder<Integer> status) {
			this.status = status;
		}

		public Holder<String> getStatusOpis() {
			return statusOpis;
		}

		public void setStatusOpis(Holder<String> statusOpis) {
			this.statusOpis = statusOpis;
		}

		public Holder<String> getUpo() {
			return upo;
		}

		public void setUpo(Holder<String> upo) {
			this.upo = upo;
		}

//		public byte[] getDocument() {
//			return document;
//		}
//
//		public void setDocument(byte[] document) {
//			this.document = document;
//		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

	}
