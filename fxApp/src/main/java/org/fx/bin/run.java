package org.fx.bin;

// --module-path /home/tee/git/lib/ --add-modules javafx.controls,javafx.fxml

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.text.Font;
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
		label.setMinWidth(360);
		label.setMaxWidth(360);
		label.minHeight(16);
		label.setFont(new Font("Arial", 14));
		label.setBorder(Border.stroke(null));;
		label.setLayoutX(10);
		label.setLayoutY(10);
		label.setTextAlignment(TextAlignment.CENTER);

		
		Button button = new Button("klik!");
		TextField texf = new TextField();
		texf.setLayoutX(380);
		texf.setLayoutY(36);
		
		Group group = new Group();
		
		group.getChildren().add(texf);
		
		TableView table = new TableView();
		table.setMinWidth(360);
		table.setMaxWidth(360);
		table.setEditable(true);
		table.setLayoutX(10);
		table.setLayoutY(36);
		
		TableColumn coll0 = new TableColumn("Kolumna 1");
		TableColumn coll1 = new TableColumn("Kolumna 1");
		TableColumn coll2 = new TableColumn("Kolumna 1");
		
		coll0.setPrefWidth(120);
		coll1.setPrefWidth(120);
		coll2.setPrefWidth(120);
		
		coll0.setCellValueFactory(new PropertyValueFactory<String, String>("Id"));
		coll1.setCellValueFactory(new PropertyValueFactory<String, String>("Id1"));
		coll2.setCellValueFactory(new PropertyValueFactory<String, String>("Id2"));
		
		coll0.setCellFactory(null); //setText("123");
		
		table.getColumns().add(coll0);
		table.getColumns().add(coll1);
		table.getColumns().add(coll2);
		
		group.getChildren().addAll(table, label);
		
		Scene scene = new Scene(group);
		
		primaryStage.setScene(scene);
		primaryStage.setHeight(480);
		primaryStage.setWidth(640);
		primaryStage.show();
	}
}
