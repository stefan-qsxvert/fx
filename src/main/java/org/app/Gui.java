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
		
		appObjects.setPrepRunnable(new PrepRunnable(appObjects));
		appObjects.setEdeklaracje(new Edeklaracje(appObjects));
		appObjects.setEventActionMethods(new EventActionMethods(appObjects));
		
		FxComponents fxComponents = new FxComponents(appObjects);

		Group group = new Group();
		Scene scene = new Scene(group);
		
		TableView<ExtFile> tableView0 = fxComponents.getTableView(10, 10, "tab1", "99");
		
		TableColumn<ExtFile, String> coll0 = fxComponents.getTableColumn(72, "Lp.", "99");
		TableColumn<ExtFile, String> coll1 = fxComponents.getTableColumn(296, "RefId", "99");
		TableColumn<ExtFile, String> coll2 = fxComponents.getTableColumn(108, "Typ", "99");
		
		tableView0.getColumns().addAll(coll0, coll1, coll2);
		
		coll0.setCellValueFactory(new PropertyValueFactory<ExtFile, String>("lp"));
		coll1.setCellValueFactory(new PropertyValueFactory<ExtFile, String>("name"));
		coll2.setCellValueFactory(new PropertyValueFactory<ExtFile, String>("type"));
		
		ObservableList<ExtFile> files = FXCollections.observableArrayList();
		appObjects.setObservableListOfFiles(files);
		files.add(null);
		files.add(null);

		tableView0.setItems(files);
		
		appObjects.setTestButton(fxComponents.getButton(620, 100, "test", "99"));
		appObjects.setDownloadUposButton(fxComponents.getButton(790, 340, "Pobierz UPO", "2"));
		appObjects.setLoadCertButton(fxComponents.getButton(790, 180, "Załaduj certyfikat","4"));
		appObjects.setSendPitsButton(fxComponents.getButton(620, 340, "Wyślij Pity", "1"));
		appObjects.setSelectUposButton(fxComponents.getButton(790, 240, "Wybierz UPO","3"));
		appObjects.setSelectPitsButton(fxComponents.getButton(620, 240, "Wybierz PITy","0"));
		

		appObjects.setProgressIndicator(new ProgressIndicator());
		appObjects.getProgressIndicator().setLayoutX(520);
		appObjects.getProgressIndicator().setLayoutY(240);
		
//		ImageView imageView = fxComponents.getImageView(580,14, 320, 280);
		appObjects.setProgressBar(fxComponents.getProgressBar(620, 300));
		
		appObjects.setCheckBox(fxComponents.getCheckBox(620, 180, "tryb testowy", "99"));
		
		appObjects.setTableView(tableView0);
		appObjects.setStage(primaryStage);
		appObjects.setComboBox(fxComponents.getComboBox(620,10, "99"));
		appObjects.setCertLocationPathField(fxComponents.getTextField(620, 42, "5"));
		
		appObjects.setFileChooser(fxComponents.getFileChooser());
				
		group.getChildren().addAll(
				appObjects.getTableView(),
				appObjects.getDownloadUposButton(), 
				appObjects.getLoadCertButton(), 
				appObjects.getSelectPitsButton(), 
				appObjects.getSelectUposButton(), 
				appObjects.getSendPitsButton(), 
				appObjects.getTestButton(), 
				appObjects.getProgressBar(),
				appObjects.getProgressIndicator(),
				appObjects.getCheckBox(),
				appObjects.getComboBox(),
				appObjects.getCertLocationPathField());
		
		primaryStage.setScene(scene);
		primaryStage.setHeight(460);
		primaryStage.setWidth(980);
		primaryStage.setResizable(false);
		primaryStage.show();

	}
}