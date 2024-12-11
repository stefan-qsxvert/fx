package org.app;

import org.fx.app.Person;

import javafx.application.Application;
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

public class Gui extends Application{
	public static void start() {
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
		button.setLayoutX(380);
		button.setLayoutY(412);
		button.setPrefWidth(256);
		
		ObservableList<Person> data = FXCollections.observableArrayList();
		EventAction buttonAcction = new EventAction(data, button);
		
		button.setEventDispatcher(buttonAcction);

		TextField texf = new TextField();
		texf.setLayoutX(380);
		texf.setLayoutY(36);
		texf.setPrefWidth(256);
		
		Group group = new Group();
		
		group.getChildren().add(texf);
		
		TableView<Person> table = new TableView<>();
		table.setMinWidth(360);
		table.setMaxWidth(360);
		table.setLayoutX(10);
		table.setLayoutY(36);
		
		TableColumn<Person, String> coll0 = new TableColumn("firstName");
		TableColumn<Person, String> coll1 = new TableColumn("lastName");
		TableColumn<Person, String> coll2 = new TableColumn("email");
		
		coll0.setPrefWidth(80);
		coll1.setPrefWidth(80);
		coll2.setPrefWidth(200);
		
		table.getColumns().add(coll0);
		table.getColumns().add(coll1);
		table.getColumns().add(coll2);
		
		coll0.setCellValueFactory(new PropertyValueFactory("firstName"));
		coll1.setCellValueFactory(new PropertyValueFactory("lastName"));
		coll2.setCellValueFactory(new PropertyValueFactory("email"));
		
		data.add(new Person("Jacob", "Smith", "jacob.smith@example.com"));
		data.add(new Person("Isabella", "Johnson", "isabella.johnson@example.com"));
		data.add(new Person("Ethan", "Williams", "ethan.williams@example.com"));
		data.add(new Person("Emma", "Jones", "emma.jones@example.com"));
		data.add(new Person("Michael", "Brown", "michael.brown@example.com"));
				
		data.add(new Person("Alan","testowy", "alan.testowy@mail.net"));
		
		table.setItems(data); //setItems(data);
		
		data.getLast().setEmail("zmieniony.mail");
		
		table.setTableMenuButtonVisible(true);
		table.setBorder(Border.stroke(null));
		
		EventAction tableAction = new EventAction(data, table);
		table.setEventDispatcher(tableAction);
		
		group.getChildren().addAll(table, label, button);
		
    	Scene scene = new Scene(group);
		
		primaryStage.setScene(scene);
		primaryStage.setHeight(480);
		primaryStage.setWidth(640);
		primaryStage.show();
	}
}
