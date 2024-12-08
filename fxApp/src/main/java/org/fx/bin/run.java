package org.fx.bin;

// --module-path /home/tee/git/lib/ --add-modules javafx.controls,javafx.fxml

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class run extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Button button = new Button("klik!");
		TextField texf = new TextField();
		texf.setLayoutX(140);
		texf.setLayoutY(24);
		Group group = new Group(button);
		group.getChildren().add(texf);
		Scene scene = new Scene(group);

		
		
		primaryStage.setScene(scene);
		primaryStage.setHeight(480);
		primaryStage.setWidth(640);
		primaryStage.show();
	}
}
