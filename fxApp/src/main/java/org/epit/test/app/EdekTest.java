package org.epit.test.app;

import java.io.File;
import org.fx.app.Person;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
		tableView.setPrefWidth(320);
		

		TableColumn<File, String> coll10 = new TableColumn("refId");
		coll10.setPrefWidth(320);
		
		tableView.getColumns().add(coll10);
		
		coll10.setCellValueFactory(new PropertyValueFactory("name"));
		
		File refIds = new File("/home/tee/refIds/");
		
		ObservableList<File> files = FXCollections.observableArrayList();
		
		files.addAll(refIds.listFiles());
		
		tableView.setItems(files);
		
		group.getChildren().addAll(tableView);
		
		primaryStage.setScene(scene);
		primaryStage.setHeight(460);
		primaryStage.setWidth(920);
		primaryStage.show();		
	}
	

}
