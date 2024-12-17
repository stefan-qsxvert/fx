package org.app;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ExtFxButton extends Button{
	private Stage stage;
	
	public Stage getStage() {
		return stage;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}	
	
}
