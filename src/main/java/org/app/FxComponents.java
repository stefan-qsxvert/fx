package org.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

public class FxComponents {
	
	private Gui gui;
	private AppObjects appObjects;
	EventAction eventAction;
	
	public FxComponents(AppObjects appObjects) {
		this.appObjects = appObjects;
		eventAction = new EventAction(appObjects);
	}	
	
	public TableView<File> getTableView(int x, int y, String text, String arcType) {
//		EventAction eventAction = new EventAction(appObjects, arcType);
		TableView<File> tableView = new TableView();
		tableView.setLayoutX(x);
		tableView.setLayoutY(y);
//		tableView.prefWidth(420);
		tableView.setOnMousePressed(eventAction);
		return tableView;
	}
	public TableColumn<File, String> getTableColumn(int wdth, String text, String arcType) {
		TableColumn<File, String> tableColumn = new TableColumn();
		tableColumn.setText(text);
		tableColumn.setPrefWidth(wdth);
		tableColumn.setEditable(true);
		return tableColumn;
	}
	public Button getButton(int x, int y, String text, String arcType) {
//		EventAction eventAction = new EventAction(appObjects, arcType);
		Button button = new Button();
		button.setText(text);
		button.setLayoutX(x);
		button.setLayoutY(y);
		button.setPrefWidth(156);
		button.setPrefHeight(32);
		button.setOnMousePressed(eventAction);
		return button;
	}
	public ImageView getImageView(int x, int y, int w, int h) throws IOException {
		ImageView imageView = null;
		File file = null;
		FileInputStream fileInputStream = null;
		Image image = null;
		try {
			fileInputStream = new FileInputStream( new File("/home/tee/Obrazy/cosmic.jpg"));
			byte[] e = fileInputStream.readAllBytes();
			for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);}
		}catch (Exception e) {
		}
		
		image = new Image(fileInputStream);
		imageView = new ImageView(image);
		imageView.setLayoutX(x);
		imageView.setLayoutY(y);
		imageView.setFitHeight(h);
		imageView.setFitWidth(w);
		
		return imageView;
	}
	public ProgressBar getProgressBar(int x, int y) {
		ProgressBar progressBar = new ProgressBar();
		progressBar.setLayoutX(x);
		progressBar.setLayoutY(y);
		progressBar.setPrefWidth(324);
		progressBar.setPrefHeight(32);

		return progressBar;
	}
	public FileChooser getFileChooser() {
		FileChooser fileChooser = new FileChooser();
		return fileChooser;
	}
	public CheckBox getCheckBox(int x, int y, String text, String arcType) {
//		EventAction eventAction = new EventAction(appObjects, arcType);
		CheckBox checkBox = new CheckBox();
		checkBox.setText(text);
		checkBox.setLayoutX(x);
		checkBox.setLayoutY(y);
		checkBox.setSelected(true);
		checkBox.setOnMousePressed(eventAction);
		
		return checkBox;
	}
	public ComboBox<String> getComboBox(int x, int y, String arcType){
//		EventAction eventAction = new EventAction(appObjects, arcType);
		ComboBox<String> comboBox = new ComboBox<String>();
//		comboBox.setOnMousePressed(eventAction);
		comboBox.setLayoutX(x);
		comboBox.setLayoutY(y);
		comboBox.setPrefSize(324, 24);
//		String[] list = new String[9];
		ObservableList<String> stringObservableList = FXCollections.observableArrayList();
		comboBox.setValue(System.getProperty("os.name").toLowerCase());
		stringObservableList.addAll("windows", "linux", "inny");
		comboBox.setItems(stringObservableList);
		return comboBox;
	}
	public TextField getTextField(int x, int y, String arcType) {
//		EventAction eventAction = new EventAction(appObjects, arcType);
		TextField textField = new TextField();
		textField.setOnMousePressed(eventAction);
		textField.setLayoutX(x);
		textField.setLayoutY(y);
		textField.setPrefWidth(324);
		return textField;
	}
	
	public Gui getGui() {
		return gui;
	}
	public void setGui(Gui gui) {
		this.gui = gui;
	}
}
