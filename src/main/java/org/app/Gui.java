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
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Gui extends Application {
	
	
	public Gui() {
		
	}
	
	public void run() {
				launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		AppObjects appObjects= new AppObjects();
		
		
		FxComponents fxComponents = new FxComponents(appObjects);

		Group group = new Group();
		Scene scene = new Scene(group);
		
		TableView<ExtFile> tableView0 = fxComponents.getTableView(10, 10, "tab1", "99");
//		TableView<File> tableView1 = fxComponents.getTableView(290, 10,"tab2", "99");
//		tableView.setPrefWidth(320);
		
		TableColumn<ExtFile, String> coll0 = fxComponents.getTableColumn(72, "Lp.", "99");
		TableColumn<ExtFile, String> coll1 = fxComponents.getTableColumn(296, "RefId", "99");
		TableColumn<ExtFile, String> coll2 = fxComponents.getTableColumn(108, "Typ", "99");
		
		tableView0.getColumns().addAll(coll0, coll1, coll2);
		
		coll0.setCellValueFactory(new PropertyValueFactory<ExtFile, String>("lp"));
		coll1.setCellValueFactory(new PropertyValueFactory<ExtFile, String>("name"));
		coll2.setCellValueFactory(new PropertyValueFactory<ExtFile, String>("type"));
		
		ObservableList<ExtFile> files = FXCollections.observableArrayList();
		appObjects.setObservableListOfFiles(files);
//		files.addAll(refIds.listFiles());
		files.add(null);
		files.add(null);

		tableView0.setItems(files);
		
		Button bt0 =fxComponents.getButton(620, 100, "test", "99");
		Button bt1 =fxComponents.getButton(790, 340, "Pobierz UPO", "2");
		Button bt2 =fxComponents.getButton(790, 180, "Załaduj certyfikat","4");
		Button bt3 =fxComponents.getButton(620, 340, "Wyślij Pity", "1");
		Button bt4 =fxComponents.getButton(790, 240, "Wybierz UPO","3");
		Button bt5 =fxComponents.getButton(620, 240, "Wybierz PITy","0");
		
		appObjects.setTestButton(bt0);
		appObjects.setDownloadUposButton(bt1);
		appObjects.setLoadCertButton(bt2);
		appObjects.setSendPitsButton(bt3);
		appObjects.setSelectUposButton(bt4);
		appObjects.setSelectPitsButton(bt5);
		
		ProgressIndicator progressIndicator = new ProgressIndicator();
		progressIndicator.setLayoutX(520);
		progressIndicator.setLayoutY(240);
		progressIndicator.setMinSize(64, 128);
		progressIndicator.setProgress(0.3);
		
		appObjects.setProgressIndicator(progressIndicator);
		
//		ImageView imageView = fxComponents.getImageView(580,14, 320, 280);
		ProgressBar progressBar = fxComponents.getProgressBar(620, 300);
		progressBar.setProgress(0);
		
		CheckBox checkBox = fxComponents.getCheckBox(620, 180, "tryb testowy", "99");
		
		appObjects.setProgressBar(progressBar);
//		appObjects.setFiles0(files);
		appObjects.setTableView(tableView0);
		appObjects.setStage(primaryStage);
		appObjects.setCheckBox(checkBox);
		appObjects.setEdeklaracje(new Edeklaracje(appObjects));
		appObjects.setComboBox(fxComponents.getComboBox(620,10, "99"));
		appObjects.setCertLocationPathField(fxComponents.getTextField(620, 42, "5"));
		
		appObjects.setFileChooser(fxComponents.getFileChooser());
		
		group.getChildren().add(progressIndicator);
				
		group.getChildren().addAll(tableView0);
		group.getChildren().addAll(bt0, bt1, bt2, bt3, bt4, bt5, progressBar, checkBox);
		group.getChildren().add(appObjects.getComboBox());
		group.getChildren().add(appObjects.getCertLocationPathField());
		
		primaryStage.setScene(scene);
		primaryStage.setHeight(460);
		primaryStage.setWidth(980);
		primaryStage.setResizable(false);
		primaryStage.show();

	}
}