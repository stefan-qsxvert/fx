package org.app;

import java.io.File;

import javax.net.ssl.SSLContext;

import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class AppObjects {

	private FxComponents fxComponents;
	private TextField certLocationPathField;
	private ProgressBar progressBar;
	private ProgressIndicator progressIndicator;
	private ComboBox<String> comboBox;
	private Button selectPitsButton;
	private Button selectUposButton;
	private Button sendPitsButton;
	private Button downloadUposButton;
	private Button testButton;
	private Button loadCertButton;
	private ObservableList<ExtFile> observableListOfFiles;
	private File[] pitFiles;
	private File[] upoFiles;
	private TableView<ExtFile> tableView;
	private Stage stage;
	private CheckBox checkBox;
	private Uris uris;
	private FileChooser fileChooser;
	private Edeklaracje edeklaracje;
	private File certJks;
	private SSLContext sslContext;
	private EventActionMethods eventActionMethods;
	private PrepRunnable prepRunnable;

	public FxComponents getFxComponents() {
		return fxComponents;
	}

	public void setFxComponents(FxComponents fxComponents) {
		this.fxComponents = fxComponents;
	}


	public TextField getCertLocationPathField() {
		return certLocationPathField;
	}


	public void setCertLocationPathField(TextField certLocationPathField) {
		this.certLocationPathField = certLocationPathField;
	}


	public ProgressBar getProgressBar() {
		return progressBar;
	}


	public void setProgressBar(ProgressBar progressBar) {
		this.progressBar = progressBar;
	}


	public ProgressIndicator getProgressIndicator() {
		return progressIndicator;
	}


	public void setProgressIndicator(ProgressIndicator progressIndicator) {
		this.progressIndicator = progressIndicator;
	}


	public ComboBox<String> getComboBox() {
		return comboBox;
	}


	public void setComboBox(ComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}


	public Button getSelectPitsButton() {
		return selectPitsButton;
	}


	public void setSelectPitsButton(Button selectPitsButton) {
		this.selectPitsButton = selectPitsButton;
	}


	public Button getSelectUposButton() {
		return selectUposButton;
	}


	public void setSelectUposButton(Button selectUposButton) {
		this.selectUposButton = selectUposButton;
	}


	public Button getSendPitsButton() {
		return sendPitsButton;
	}


	public void setSendPitsButton(Button sendPitsButton) {
		this.sendPitsButton = sendPitsButton;
	}


	public Button getDownloadUposButton() {
		return downloadUposButton;
	}


	public void setDownloadUposButton(Button downloadUposButton) {
		this.downloadUposButton = downloadUposButton;
	}


	public Button getTestButton() {
		return testButton;
	}


	public void setTestButton(Button testButton) {
		this.testButton = testButton;
	}


	public Button getLoadCertButton() {
		return loadCertButton;
	}


	public void setLoadCertButton(Button loadCertButton) {
		this.loadCertButton = loadCertButton;
	}


	public ObservableList<ExtFile> getObservableListOfFiles() {
		return observableListOfFiles;
	}


	public void setObservableListOfFiles(ObservableList<ExtFile> observableListOfFiles) {
		this.observableListOfFiles = observableListOfFiles;
	}


	public File[] getPitFiles() {
		return pitFiles;
	}


	public void setPitFiles(File[] pitFiles) {
		this.pitFiles = pitFiles;
	}


	public File[] getUpoFiles() {
		return upoFiles;
	}


	public void setUpoFiles(File[] upoFiles) {
		this.upoFiles = upoFiles;
	}


	public TableView<ExtFile> getTableView() {
		return tableView;
	}


	public void setTableView(TableView<ExtFile> tableView) {
		this.tableView = tableView;
	}


	public Stage getStage() {
		return stage;
	}


	public void setStage(Stage stage) {
		this.stage = stage;
	}


	public CheckBox getCheckBox() {
		return checkBox;
	}


	public void setCheckBox(CheckBox checkBox) {
		this.checkBox = checkBox;
	}


	public Uris getUris() {
		return uris;
	}

	
	public void setUris(Uris uris) {
		this.uris = uris;
	}

	public FileChooser getFileChooser() {
		return fileChooser;
	}

	public void setFileChooser(FileChooser fileChooser) {
		this.fileChooser = fileChooser;
	}

	public Edeklaracje getEdeklaracje() {
		return edeklaracje;
	}

	public void setEdeklaracje(Edeklaracje edeklaracje) {
		this.edeklaracje = edeklaracje;
	}

	public File getCertJks() {
		return certJks;
	}

	public void setCertJks(File certJks) {
		this.certJks = certJks;
	}

	public SSLContext getSslContext() {
		return sslContext;
	}

	public void setSslContext(SSLContext sslContext) {
		this.sslContext = sslContext;
	}


	public EventActionMethods getEventActionMethods() {
		return eventActionMethods;
	}


	public void setEventActionMethods(EventActionMethods eventActionMethods) {
		this.eventActionMethods = eventActionMethods;
	}

	public PrepRunnable getPrepRunnable() {
		return prepRunnable;
	}

	public void setPrepRunnable(PrepRunnable prepRunnable) {
		this.prepRunnable = prepRunnable;
	}
	
	

}
