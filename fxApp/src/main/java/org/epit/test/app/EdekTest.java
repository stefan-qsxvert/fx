package org.epit.test.app;

import java.io.File;

import javax.swing.table.TableColumn;

import org.fx.app.Person;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class EdekTest extends Application {
	
	public void run() {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Stage stage = new Stage();
		Group group = new Group();
		Scene scene = new Scene(group);
		TableView<File> tableView = new TableView();
		ObservableList<File> files = FXCollections.observableArrayList();
		files.add(new File("/home/tee/refIds/"));
		
		tableView.setItems(files);
		
		TableColumn<File, String> coll0 = new TableColumn();
		TableColumn<File, String> col0 = new TableColumn();
		
		group.getChildren().addAll(tableView);
		
		primaryStage.setScene(scene);
		primaryStage.setHeight(460);
		primaryStage.setWidth(920);
		primaryStage.show();		
	}
	

}
