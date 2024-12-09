package org.fx.bin;
// --module-path /home/tee/git/lib/ --add-modules javafx.controls,javafx.fxml

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicBorders;

import org.fx.app.Person;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableListValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
		label.setFont(new Font("Times New Roman", 14));
		label.setBorder(Border.stroke(null));;
		label.setLayoutX(10);
		label.setLayoutY(10);
		label.setTextAlignment(TextAlignment.RIGHT);

		Button button = new Button("klik!");
		TextField texf = new TextField();
		texf.setLayoutX(380);
		texf.setLayoutY(36);
		
		Group group = new Group();
		
		group.getChildren().add(texf);
		
		TableView<Person> table = new TableView<>();
		table.setMinWidth(360);
		table.setMaxWidth(360);
		table.setEditable(true);
		table.setLayoutX(10);
		table.setLayoutY(36);
		
		TableColumn<Person, String> coll0 = new TableColumn<>("firstName");
		TableColumn<Person, String> coll1 = new TableColumn<>("lastName");
		TableColumn<Person, String> coll2 = new TableColumn<>("email");
		
		coll0.setPrefWidth(80);
		coll1.setPrefWidth(80);
		coll2.setPrefWidth(200);
		
		table.getColumns().add(coll0);
		table.getColumns().add(coll1);
		table.getColumns().add(coll2);
		
		coll0.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		coll1.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		coll2.setCellValueFactory(new PropertyValueFactory<>("email"));
		
		System.out.println(1);
		
//		coll0.setCellFactory(null); //setText("123");
		
//		table.getColumns().addAll(coll0, coll1, coll2);
//		table.getColumns().
		
//		ObservableList<Person> data = FXCollections.observableArrayList(
//				 new Person ("Wartość 1", "Wartość 2", "Wartość 3"), 
//				 new Person("Wartość 4", "Wartość 5", "Wartość 6"), 
//				 new Person("Wartość 7", "Wartość 8", "Wartość 9") 
////				 );
		final ObservableList<Person> data =
		        FXCollections.observableArrayList(
		            new Person("Jacob", "Smith", "jacob.smith@example.com"),
		            new Person("Isabella", "Johnson", "isabella.johnson@example.com"),
		            new Person("Ethan", "Williams", "ethan.williams@example.com"),
		            new Person("Emma", "Jones", "emma.jones@example.com"),
		            new Person("Michael", "Brown", "michael.brown@example.com")
		        );
		
		table.setItems(data); //setItems(data);
		
		table.setTableMenuButtonVisible(true);
		
		table.setBorder(Border.stroke(null));
		
		group.getChildren().addAll(table, label);
		
    	Scene scene = new Scene(group);
		
		primaryStage.setScene(scene);
		primaryStage.setHeight(480);
		primaryStage.setWidth(640);
		primaryStage.show();
	}
}
