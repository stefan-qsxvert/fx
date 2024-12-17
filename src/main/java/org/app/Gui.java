package org.app;

import java.io.File;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Gui extends Application {
	Gui gui;
	AppObjects appObjects;
	FxComponents fxComponents;
	Stage stage;
	ProgressBar progressBar;
	
	public Gui(AppObjects appObjects) {
		this.appObjects = appObjects;
		System.out.println(appObjects);
	}
	
	public Gui() {
		
	}
	
	public void run(AppObjects appObjects) throws Exception {
		this.appObjects = appObjects;
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		AppObjects appObjects= new AppObjects();
		
		fxComponents = new FxComponents(appObjects);

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
		
		ObservableList<File> files = FXCollections.observableArrayList();
		files.addAll(refIds.listFiles());
		files.addAll(refIds.listFiles());
		files.addAll(refIds.listFiles());
		files.addAll(refIds.listFiles());
		files.addAll(refIds.listFiles());
		files.addAll(refIds.listFiles());
		
		tableView0.setItems(files);
		tableView1.setItems(files);
		
		Button bt0 =fxComponents.getButton(580, 380, "test", appObjects);
		Button bt1 =fxComponents.getButton(750, 380, "prd", appObjects);
		Button bt2 =fxComponents.getButton(750, 340, "generuj wsdl", appObjects);
		Button bt3 =fxComponents.getButton(580, 340, "pobierz UPO", appObjects);
		Button bt4 =fxComponents.getButton(580, 240, "wybierz pliki", appObjects);
		
		
		
		
		
//		ImageView imageView = fxComponents.getImageView(580,14, 320, 280);
		progressBar = fxComponents.getProgressBar(580, 300);
//		System.out.println(progressBar);
		appObjects.setProgressBar(progressBar);
		System.out.println(progressBar);
//		primaryStage.
		
		group.getChildren().addAll(tableView0, tableView1, bt0, bt1, bt2, bt3, bt4, progressBar);
		
		
		primaryStage.setScene(scene);
		primaryStage.setHeight(460);
		primaryStage.setWidth(920);
		primaryStage.show();

	}
	
	public Gui getGui() {
		return gui;
	}
	public void setGui(Gui gui) {
		this.gui = gui;
	}
	public AppObjects getAppObjects() {
		return appObjects;
	}
	public void setAppObjects(AppObjects appObjects) {
		this.appObjects = appObjects;
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

	
}
