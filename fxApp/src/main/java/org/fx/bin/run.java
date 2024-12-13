package org.fx.bin;
// --module-path /home/tee/git/lib/ --add-modules javafx.controls,javafx.fxml

import org.app.Gui;
import org.app.StringPrep;
import org.epit.test.app.EdekTest;

public class run{
	
	public static void main(String[] args) {
		Gui gui = new Gui();
//		gui.start();
		EdekTest edekTest = new EdekTest();
		edekTest.run();
		
		String str = new String("cjdshcbsdh \'text=mail@mail.com\' skmsdkcnjds");
		StringPrep stringPrep = new StringPrep();
		System.out.println(stringPrep.prep(str, "text=", "\'"));
	}
}
