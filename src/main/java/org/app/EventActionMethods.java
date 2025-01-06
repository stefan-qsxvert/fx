package org.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class EventActionMethods {
	
	AppObjects appObjects;
	PrepSSL prepSSL;
	ObservableList<ExtFile> files;
	TableView<ExtFile> tableView;
	
	public EventActionMethods(AppObjects appObjects) {
		this.appObjects = appObjects;
		prepSSL = new PrepSSL(appObjects);
		tableView  = appObjects.getTableView();
	}
	//--------------------------------	
	public void setPitObservableList() {
		try {
			FileChooser fileChooser = appObjects.getFileChooser();
			fileChooser.getExtensionFilters().clear();
			fileChooser.getExtensionFilters().add(new ExtensionFilter("XML", "*.xml"));
			fileChooser.getExtensionFilters().add(new ExtensionFilter("*", "*.*"));
			
			List<File> listaPit = fileChooser.showOpenMultipleDialog(appObjects.getStage());
			
			ExtFile[] plikiPit = new ExtFile[listaPit.size()];
			
		int i = 0;
		for (File f : listaPit) {
			plikiPit[i] = new ExtFile(f.getAbsolutePath());
			plikiPit[i].setType("PIT");
			plikiPit[i].setLp(i + 1);
			i++;
		}
			
		ObservableList<ExtFile> files = appObjects.getObservableListOfFiles();
		files.clear();
		files.addAll(plikiPit);
		appObjects.setPitFiles(plikiPit);

		appObjects.getTableView().setItems(files);
		
//		progressBar.setProgress(0);
		}catch(Exception e) {
			System.out.println("Nie wybrano plików");
		}
		}
	//--------------------------------	
	public void setUpoObservableList() {
	try {	
		FileChooser fileChooser = appObjects.getFileChooser();
		fileChooser.getExtensionFilters().clear();
		fileChooser.getExtensionFilters().add(new ExtensionFilter("XML", "*.xml"));
		fileChooser.getExtensionFilters().add(new ExtensionFilter("*", "*.*"));
		
		List<File> listaUPO = fileChooser.showOpenMultipleDialog(appObjects.getStage());
		
		ExtFile[] plikiUPO = new ExtFile[listaUPO.size()];
		
		int i = 0;
		for (File f : listaUPO) {
			plikiUPO[i] = new ExtFile(f.getAbsolutePath());
			plikiUPO[i].setType("UPO");
			plikiUPO[i].setLp(i + 1);
			i++;
		}
		
		ObservableList<ExtFile> files = appObjects.getObservableListOfFiles();
		files.clear();
		files.addAll(plikiUPO);
		appObjects.setPitFiles(plikiUPO);

		appObjects.getTableView().setItems(files);
	}catch(Exception e) {
		System.out.println("Nie wybrano plików");
	}
//		progressBar.setProgress(0);
	}
	//--------------------------------	
	public void setDefaultAction() {
		System.out.println("brak zdefiniiowanego działania");
		
		appObjects.getProgressBar().setProgress(0);
		System.out.println(appObjects.getCheckBox() + " " + appObjects.getCheckBox().isSelected());
	}
	//--------------------------------	
	public void getAllUPOs() throws SSLException {
		File[] file = appObjects.getUpoFiles(); 
		
		for (int i = 0; i < file.length; i++) {
			appObjects.getEdeklaracje().getUPO(file[i].getName().toString());
//			progressBar.setProgress(progressBar.getProgress() + e);
		}
	}
	//--------------------------------	
	public void setCertsJksPathField() {
		try {
			FileChooser fileChooser = appObjects.getFileChooser();
			fileChooser.getExtensionFilters().clear();
			fileChooser.getExtensionFilters().add(new ExtensionFilter("JKS", "*.jks"));
			fileChooser.getExtensionFilters().add(new ExtensionFilter("*", "*.*"));
		
			File cacert = fileChooser.showOpenDialog(appObjects.getStage());
			appObjects.setCertJks(cacert);
			appObjects.getCertLocationPathField().setText(cacert.getPath());
			
			appObjects.setSslContext(prepSSL.getSSLContext());
			
		}catch (Exception e) {
			System.out.println("brak magazynu");
		}
	}
	//--------------------------------	
	public void loadCertToJks() throws CertificateException, IOException, KeyStoreException, NoSuchAlgorithmException {
		try {
			File magazyn = appObjects.getCertJks();
			FileChooser fileChooser = appObjects.getFileChooser();
			fileChooser.getExtensionFilters().clear();
			fileChooser.getExtensionFilters().add(new ExtensionFilter("CERT", "*.crt"));
			fileChooser.getExtensionFilters().add(new ExtensionFilter("*", "*.*"));
			File certFile = fileChooser.showOpenDialog(appObjects.getStage());
		
			CertificateFactory cf = CertificateFactory.getInstance("X.509");
			FileInputStream fileInputStream = new FileInputStream(certFile);	
			X509Certificate x509Certificate = (X509Certificate) cf.generateCertificate(fileInputStream);
			fileInputStream.close();
		
			KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
			keyStore.setCertificateEntry(certFile.getName(), x509Certificate);
		
			FileOutputStream fileOutputStream = new FileOutputStream(magazyn);
			keyStore.store(fileOutputStream, "qqq111".toCharArray());
			fileOutputStream.flush();
			fileOutputStream.close();
			
			appObjects.setSslContext(prepSSL.getSSLContext());
			
		}catch (Exception e) {
			System.out.println("Nie ma certyfikatu");
		}
	}
	//--------------------------------	
	public void sendAllPits() {
		File[] pitFiles = appObjects.getPitFiles();
		
		try {
			for (int i = 0; i < pitFiles.length; i++) {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(pitFiles[i]));
//				StringBuilder stringBuilder = new StringBuilder();
			
				String s = null;
				String content = bufferedReader.readLine();
				while ((s = bufferedReader.readLine()) != null) {
					content = content + s + "\n";
				}
				bufferedReader.close();

				System.out.println(content);
				
	// wywołanie metowy sendDoc z wsdl z warunkiem content.getBytes()
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
