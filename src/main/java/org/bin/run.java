package org.bin;

import org.app.AppObjects;
import org.app.Gui;

import javafx.stage.Stage;

// --module-path /home/tee/git/lib/ --add-modules javafx.controls,javafx.fxml

public class run{
	
	public static void main(String[] args) throws Exception {
		Gui gui = new Gui();
		gui.run();
	}
}
