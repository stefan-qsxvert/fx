package org.app;

import java.io.File;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class EventActionMethods {
	
	AppObjects appObjects;
	
	public EventActionMethods(AppObjects appObjects) {
		this.appObjects = appObjects;
	}
	
	public void getPitObservableList() {
		
		FileChooser fileChooser = appObjects.getFileChooser();
		fileChooser.getExtensionFilters().clear();
		fileChooser.getExtensionFilters().add(new ExtensionFilter("PIT", "*.xml"));
		
		List<File> listaPit = fileChooser.showOpenMultipleDialog(appObjects.getStage());
		File[] plikiPit = new File[listaPit.size()];
		
		int i = 0;
		for (File f : listaPit) {
			plikiPit[i] = new File(f.getAbsolutePath());
			i++;
		}
		
		ObservableList<File> files = FXCollections.observableArrayList();
		files.addAll(plikiPit);
		appObjects.setObservableListOfPit(files);

		TableView<File> tableView = appObjects.getTableView();
		tableView.setItems(files);
		
//		progressBar.setProgress(0);
	}
	
	public void getDefaultAction() {
		System.out.println("brak zdefiniiowanego działania");
		
		appObjects.getProgressBar().setProgress(0);
		System.out.println(appObjects.getCheckBox() + " " + appObjects.getCheckBox().isSelected());
	}
	
	public void getAllUPOs() {
		File file = new File("/home/tee/refIds/");
		String[] fileList = file.list();
//		Double e = (double) ((1/Double.valueOf( fileList.length))/1);
//		System.out.println(e);
		for (int i = 0; i < fileList.length; i++) {
			appObjects.getEdeklaracje().getUPO(fileList[i]);
//			progressBar.setProgress(progressBar.getProgress() + e);
		}
	}
	public void getCaCertsTest() {
		FileChooser fileChooser = appObjects.getFileChooser();
		fileChooser.getExtensionFilters().clear();
		fileChooser.getExtensionFilters().add(new ExtensionFilter("jks", "*.jks"));
		
		File cacert = fileChooser.showOpenDialog(appObjects.getStage());
		appObjects.setCaCertJksTest(cacert);
		appObjects.getCertLocationPath().setText(cacert.getPath());
	}

}
