package org.bin;

import java.io.File;

import org.app.Gui;

// --module-path /home/tee/git/lib/ --add-modules javafx.controls,javafx.fxml

public class run{
	
	public static void main(String[] args) throws Exception {
		
		Gui gui = new Gui();
		
		System.out.println(new File(".").getAbsolutePath());
		gui.run();
	}
}
