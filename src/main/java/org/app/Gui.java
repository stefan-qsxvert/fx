package org.app;

import java.io.File;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Gui extends Application {
	
	
	public Gui() {
		
	}
	
	public void run() throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		AppObjects appObjects= new AppObjects();
		
		FxComponents fxComponents = new FxComponents(appObjects);

		Group group = new Group();
		Scene scene = new Scene(group);
		
		TableView<File> tableView0 = fxComponents.getTableView(10, 10, "tab1");
		TableView<File> tableView1 = fxComponents.getTableView(290, 10,"tab2");
//		tableView.setPrefWidth(320);
		
		TableColumn<File, String> coll10 = fxComponents.getTableColumn(265, "refId");
		TableColumn<File, String> coll11 = fxComponents.getTableColumn(265, "refId");
//		coll10.setPrefWidth(270);
		
		tableView0.getColumns().addAll(coll10);
		tableView1.getColumns().addAll(coll11);
		
		coll10.setCellValueFactory(new PropertyValueFactory("name"));
		coll11.setCellValueFactory(new PropertyValueFactory("name"));
		
		File refIds = new File("/home/tee/refIds/");
		
		ObservableList<File> files0 = FXCollections.observableArrayList();
		
		ObservableList<File> files = FXCollections.observableArrayList();
		files.addAll(refIds.listFiles());
		files.addAll(refIds.listFiles());
		files.addAll(refIds.listFiles());
		files.addAll(refIds.listFiles());
		files.addAll(refIds.listFiles());
		files.addAll(refIds.listFiles());
		
		tableView0.setItems(files);
		tableView1.setItems(files0);
		
		Button bt0 =fxComponents.getButton(580, 380, "Wyślij!");
		Button bt1 =fxComponents.getButton(750, 380, "prd");
		Button bt2 =fxComponents.getButton(750, 340, "generuj wsdl");
		Button bt3 =fxComponents.getButton(580, 340, "Pobierz UPO");
		Button bt4 =fxComponents.getButton(580, 240, "Wybierz pliki");
		
//		ImageView imageView = fxComponents.getImageView(580,14, 320, 280);
		ProgressBar progressBar = fxComponents.getProgressBar(580, 300);
		progressBar.setProgress(0);
		
		CheckBox checkBox = fxComponents.getCheckBox(580, 180, "tryb testowy");
		
		appObjects.setProgressBar(progressBar);
		appObjects.setFiles0(files0);
		appObjects.setTableView(tableView1);
		appObjects.setStage(primaryStage);
		appObjects.setCheckBox(checkBox);
		System.out.println(checkBox);
		
		group.getChildren().addAll(tableView0, tableView1, bt0, bt1);
		group.getChildren().addAll(bt2, bt3, bt4, progressBar, checkBox);
		primaryStage.setScene(scene);
		primaryStage.setHeight(460);
		primaryStage.setWidth(920);
		primaryStage.show();

	}
	
}
