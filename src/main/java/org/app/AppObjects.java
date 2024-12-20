package org.app;

import java.io.File;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class AppObjects {

	private FxComponents fxComponents;
	private ProgressBar progressBar;
	private ObservableList<File> files0;
	private TableView<File> tableView;
	private Stage stage;
	private CheckBox checkBox;
	private Uris uris;
	private FileChooser fileChooser;
	private Edeklaracje edeklaracje;
	
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

	public ObservableList<File> getFiles0() {
		return files0;
	}

	public void setFiles0(ObservableList<File> files0) {
		this.files0 = files0;
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

	
}
