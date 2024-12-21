package org.bin;

import org.app.Gui;

// --module-path /home/tee/git/lib/ --add-modules javafx.controls,javafx.fxml

public class run{
	
	public static void main(String[] args) throws Exception {
		Gui gui = new Gui();
		gui.run();
	}
}
