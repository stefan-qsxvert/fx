package org.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import org.apache.cxf.common.util.ClasspathScanner;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FxComponents {
	
	private Gui gui;
	private FileChooser fileChooser;
	
	public FxComponents() {
		fileChooser = new FileChooser();
	}	
	
	public TableView<File> getTableView(int x, int y, String text) {
		EventAction eventAction = new EventAction(text);
		TableView<File> tableView = new TableView();
		tableView.setLayoutX(x);
		tableView.setLayoutY(y);
		tableView.prefWidth(270);
//		tableView.setEventDispatcher(eventAction);
		tableView.setOnMousePressed(new EventAction(text));
		return tableView;
	}
	public TableColumn<File, String> getTableColumn(int wdth, String text) {
		TableColumn<File, String> tableColumn = new TableColumn();
		tableColumn.setText(text);
		tableColumn.setPrefWidth(wdth);
		return tableColumn;
	}
	public Button getButton(int x, int y, String text, Stage stage) {
		EventAction eventAction = new EventAction(text, stage);
		ExtFxButton button = new ExtFxButton();
		button.setStage(stage);
		button.setText(text);
		button.setLayoutX(x);
		button.setLayoutY(y);
		button.setPrefWidth(156);
		button.setPrefHeight(32);
		button.setOnMousePressed(eventAction);
		return button;
	}
	public ImageView getImageView(int x, int y, int w, int h) throws IOException {
//		System.out.println(getClass().getClassLoader().getResource("org"));
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
//			fileInputStream = File("0101010");
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
	public List<File> fileChooser(Stage stage) {
		List<File> listOfFiles = fileChooser.showOpenMultipleDialog(stage);
		return listOfFiles;
	}
	
	public Gui getGui() {
		return gui;
	}
	public void setGui(Gui gui) {
		this.gui = gui;
	}
}
