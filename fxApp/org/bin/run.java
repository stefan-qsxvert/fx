package org.bin;
// --module-path /home/tee/git/lib/ --add-modules javafx.controls,javafx.fxml

import org.app.EdekTest;

public class run{
	
	public static void main(String[] args) {
//		Gui gui = new Gui();
////		gui.start();
		EdekTest edekTest = new EdekTest();
		edekTest.run();
		
	}
}
