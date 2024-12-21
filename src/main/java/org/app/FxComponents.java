package org.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

public class FxComponents {
	
	private Gui gui;
	private AppObjects appObjects;
	
	public FxComponents(AppObjects appObjects) {
		this.appObjects = appObjects;
		
	}	
	
	public TableView<File> getTableView(int x, int y, String text, String arcType) {
		EventAction eventAction = new EventAction(appObjects, arcType);
		TableView<File> tableView = new TableView();
		tableView.setLayoutX(x);
		tableView.setLayoutY(y);
		tableView.prefWidth(270);
		tableView.setOnMousePressed(eventAction);
		return tableView;
	}
	public TableColumn<File, String> getTableColumn(int wdth, String text, String arcType) {
		EventAction eventAction = new EventAction(appObjects, arcType);
		TableColumn<File, String> tableColumn = new TableColumn();
		tableColumn.setText(text);
		tableColumn.setPrefWidth(wdth);
		tableColumn.setEditable(true);
		return tableColumn;
	}
	public Button getButton(int x, int y, String text, String arcType) {
		EventAction eventAction = new EventAction(appObjects, arcType);
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
	public FileChooser getFileChooser(AppObjects appObjects) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("filter", "*.txt", "*.xml"));
		return fileChooser;
	}
	public CheckBox getCheckBox(int x, int y, String text, String arcType) {
		EventAction eventAction = new EventAction(appObjects, arcType);
		CheckBox checkBox = new CheckBox();
		checkBox.setText(text);
		checkBox.setLayoutX(x);
		checkBox.setLayoutY(y);
		checkBox.setSelected(true);
		checkBox.setOnMousePressed(eventAction);
		
		return checkBox;
	}
	
	public Gui getGui() {
		return gui;
	}
	public void setGui(Gui gui) {
		this.gui = gui;
	}
}
