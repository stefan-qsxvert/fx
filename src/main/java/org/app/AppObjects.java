package org.app;

import java.io.File;

import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class AppObjects {

	private FxComponents fxComponents;
	private TextField certLocationPath;
	private ProgressBar progressBar;
	private ComboBox<String> comboBox;
	private ObservableList<File> observableListOfPit;
	private ObservableList<File> observableListOfUPO;
	private File[] pitFiles;
	private TableView<File> tableView;
	private Stage stage;
	private CheckBox checkBox;
	private Uris uris;
	private FileChooser fileChooser;
	private Edeklaracje edeklaracje;
	private File certJks;

	
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

	public TextField getCertLocationPath() {
		return certLocationPath;
	}

	public void setCertLocationPath(TextField certLocationPath) {
		this.certLocationPath = certLocationPath;
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

	
	
}
