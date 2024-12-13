package org.epit.test.app;

import java.io.File;

import org.app.FxComponents;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BackgroundImage;
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
		
		FxComponents fxComponents = new FxComponents(3,3);
		
		TableView<File> tableView0 = fxComponents.getTableView(10, 10);
		TableView<File> tableView1 = fxComponents.getTableView(290, 10);
//		tableView.setPrefWidth(320);
		
		TableColumn<File, String> coll10 = fxComponents.getTableColumn(1, 265, "refId");
		TableColumn<File, String> coll11 = fxComponents.getTableColumn(1, 265, "refId");
//		coll10.setPrefWidth(270);
		
		tableView0.getColumns().addAll(coll10);
		tableView1.getColumns().addAll(coll11);
		
		coll10.setCellValueFactory(new PropertyValueFactory("name"));
		coll11.setCellValueFactory(new PropertyValueFactory("name"));
		
		File refIds = new File("/home/tee/refIds/");
		
		ObservableList<File> files = FXCollections.observableArrayList();
		files.addAll(refIds.listFiles());
		
		tableView0.setItems(files);
		tableView1.setItems(files);
		
		group.getChildren().addAll(tableView0, tableView1);
		
		primaryStage.setScene(scene);
		primaryStage.setHeight(460);
		primaryStage.setWidth(920);
		primaryStage.show();		
	}
}
