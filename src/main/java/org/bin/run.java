package org.bin;

import org.app.AppObjects;
import org.app.Gui;

import javafx.stage.Stage;

// --module-path /home/tee/git/lib/ --add-modules javafx.controls,javafx.fxml

public class run{
	
	public static void main(String[] args) throws Exception {
		AppObjects appObjects = new AppObjects();
		Gui gui = appObjects.getGui();
//		Gui gui = new Gui(appObjects);
		gui.setAppObjects(appObjects);
//		System.out.println(gui.getProgressBar());
		gui.run(appObjects);

//		appObjects.setGui(gui);
//		gui.setAppObjects(appObjects);
//		gui.setGui(gui);
//		System.out.println("run: " + appObjects);
//		gui.run();
	}
}
