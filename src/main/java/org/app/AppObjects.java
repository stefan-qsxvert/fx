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
	
	//JavaFX components
	private TableView<ExtFile> tableView;
	private Stage stage;
	
	//App classes
	private FxComponents fxComponents;
	private PrepRunnable prepRunnable;
	private Uris uris;
	private Edeklaracje edeklaracje;
	private EventActionMethods eventActionMethods;
	private Paths paths;
	
	//Gui elements
	private ComboBox<String> comboBox;
	private Button selectPitsButton;
	private Button selectUposButton;
	private Button sendPitsButton;
	private Button downloadUposButton;
	private Button testButton;
	private Button loadCertButton;
	private ProgressBar progressBar;
	private ProgressIndicator progressIndicator;
	private TextField certLocationPathField;
	
	//Other objects  
	private ObservableList<ExtFile> observableListOfFiles;
	private File[] pitFiles;
	private File[] upoFiles;
	private CheckBox checkBox;
	private FileChooser fileChooser;
	private File certJks;
	private SSLContext sslContext;
	
	//Getters and setters
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
	public FxComponents getFxComponents() {
		return fxComponents;
	}
	public void setFxComponents(FxComponents fxComponents) {
		this.fxComponents = fxComponents;
	}
	public PrepRunnable getPrepRunnable() {
		return prepRunnable;
	}
	public void setPrepRunnable(PrepRunnable prepRunnable) {
		this.prepRunnable = prepRunnable;
	}
	public Uris getUris() {
		return uris;
	}
	public void setUris(Uris uris) {
		this.uris = uris;
	}
	public Edeklaracje getEdeklaracje() {
		return edeklaracje;
	}
	public void setEdeklaracje(Edeklaracje edeklaracje) {
		this.edeklaracje = edeklaracje;
	}
	public EventActionMethods getEventActionMethods() {
		return eventActionMethods;
	}
	public void setEventActionMethods(EventActionMethods eventActionMethods) {
		this.eventActionMethods = eventActionMethods;
	}
	public Paths getPaths() {
		return paths;
	}
	public void setPaths(Paths paths) {
		this.paths = paths;
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
	public TextField getCertLocationPathField() {
		return certLocationPathField;
	}
	public void setCertLocationPathField(TextField certLocationPathField) {
		this.certLocationPathField = certLocationPathField;
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
	public CheckBox getCheckBox() {
		return checkBox;
	}
	public void setCheckBox(CheckBox checkBox) {
		this.checkBox = checkBox;
	}
	public FileChooser getFileChooser() {
		return fileChooser;
	}
	public void setFileChooser(FileChooser fileChooser) {
		this.fileChooser = fileChooser;
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
	
}
