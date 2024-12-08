package org.fx.bin;

import javax.swing.GroupLayout.Alignment;

// --module-path /home/tee/git/lib/ --add-modules javafx.controls,javafx.fxml

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class run extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Label label = new Label("Address Book");
		label.setPrefWidth(360);
		label.setTextAlignment(TextAlignment.CENTER);

		
		Button button = new Button("klik!");
		TextField texf = new TextField();
		texf.setLayoutX(140);
		texf.setLayoutY(24);
		
		Group group = new Group();
		
		group.getChildren().add(texf);
		
		TableView table = new TableView();
		table.setMinWidth(360);
		table.setMaxWidth(360);
		
		TableColumn coll0 = new TableColumn("Kolumna 1");
		TableColumn coll1 = new TableColumn("Kolumna 1");
		TableColumn coll2 = new TableColumn("Kolumna 1");
		
		coll0.setPrefWidth(120);
		coll1.setPrefWidth(120);
		coll2.setPrefWidth(120);
		
		coll0.setCellFactory(null); //setText("123");
		
		table.getColumns().add(coll0);
		table.getColumns().add(coll1);
		table.getColumns().add(coll2);
		
		table.setEditable(true);
		table.setLayoutX(10);
		table.setLayoutY(36);
		
		group.getChildren().addAll(table, label);
		
		Scene scene = new Scene(group);
		
		primaryStage.setScene(scene);
		primaryStage.setHeight(480);
		primaryStage.setWidth(640);
		primaryStage.show();
	}
}
