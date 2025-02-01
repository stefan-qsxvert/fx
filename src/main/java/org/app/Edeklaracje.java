package org.app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.ZonedDateTime;
import javax.net.ssl.SSLException;
import com.test.edeklaracje.GateService;
import com.test.edeklaracje.GateServicePortType;
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
				
				appObjects.getSslContext();
//				appObjects.getSslContext().createSSLEngine(). beginHandshake();
//				
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
					
					File file = new File(appObjects.getPaths().getUpoFilesPath() + refId.value + ".xml");
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
		
		public void getUPO(String refId) throws SSLException {
			
			appObjects.getSslContext();
//			appObjects.getSslContext().createSSLEngine().beginHandshake();
			
			try {
				
//				// Utwórz instancję usługi 
				GateService service = new GateService(); 
				GateServicePortType port = service.getGateServiceSOAP11Port(); 
				// Utwórz żądanie UPO 
//				RequestUPO requestUPO = new RequestUPO(); 
				
				upo = new Holder<String>();
				status = new Holder<Integer>();
				statusOpis = new Holder<String>();
				
				
				// Wywołaj metodę requestUPO 
				port.requestUPO(refId.replace(".xml",""), "pl", upo, status, statusOpis);
								
				System.out.println("UPO status: " + upo.value + " " + status.value + " " + statusOpis.value);
				BufferedWriter bfw = new BufferedWriter(new FileWriter(appObjects.getPaths().getSentPitFilesPath() + refId));
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
