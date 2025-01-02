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
	private ObservableList<File> observableListOfPit;
	private ObservableList<File> observableListOfUPO;
	private File[] pitFiles;
	private File[] upoFiles;
	private TableView<File> tableView;
	private Stage stage;
	private CheckBox checkBox;
	private Uris uris;
	private FileChooser fileChooser;
	private Edeklaracje edeklaracje;
	private File certJks;
	private SSLContext sslContext;

	
	public AppObjects() {
	}

	public FxComponents getFxComponents() {
		return fxComponents;
	}

	public void setFxComponents(FxComponents fxComponents) {
		this.fxComponents = fxComponents;
	}

	public ProgressBar getProgressBar() {
		return progressBar;
	}

	public void setProgressBar(ProgressBar progressBar) {
		this.progressBar = progressBar;
	}

	public TableView<File> getTableView() {
		return tableView;
	}

	public void setTableView(TableView<File> tableView) {
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
		fileChooser.getExtensionFilters();
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

	public ComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(ComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public TextField getCertLocationPathField() {
		return certLocationPathField;
	}

	public void setCertLocationPathField(TextField certLocationPathField) {
		this.certLocationPathField = certLocationPathField;
	}

	public ObservableList<File> getObservableListOfPit() {
		return observableListOfPit;
	}

	public void setObservableListOfPit(ObservableList<File> observableListOfPit) {
		this.observableListOfPit = observableListOfPit;
	}

	public ObservableList<File> getObservableListOfUPO() {
		return observableListOfUPO;
	}

	public void setObservableListOfUPO(ObservableList<File> observableListOfUPO) {
		this.observableListOfUPO = observableListOfUPO;
	}

	public File getCertJks() {
		return certJks;
	}

	public void setCertJks(File certJks) {
		this.certJks = certJks;
	}

	public File[] getPitFiles() {
		return pitFiles;
	}

	public void setPitFiles(File[] plikiPit) {
		this.pitFiles = plikiPit;
	}

	public File[] getUpoFiles() {
		return upoFiles;
	}

	public void setUpoFiles(File[] upoFiles) {
		this.upoFiles = upoFiles;
	}

	public SSLContext getSslContext() {
		return sslContext;
	}

	public void setSslContext(SSLContext sslContext) {
		this.sslContext = sslContext;
	}

	public ProgressIndicator getProgressIndicator() {
		return progressIndicator;
	}

	public void setProgressIndicator(ProgressIndicator progressIndicator) {
		this.progressIndicator = progressIndicator;
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
	
}
