package org.bin;

import java.io.File;
import java.io.FileOutputStream;

import org.app.Gui;

// --module-path /home/tee/git/lib/ --add-modules javafx.controls,javafx.fxml

public class run{
	
	public static void main(String[] args) throws Exception {
//		System.out.println(System.getProperties());
//		byte[] b = System.getProperties().toString().getBytes();
//		File file = new File("/home/tee/SystemProperties.txt");
//		System.out.println(file.exists());
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//		FileOutputStream fs = new FileOutputStream(file);
//		fs.write(b);
//		fs.flush();
//		fs.close();
		Gui gui = new Gui();
		gui.run();
	}
}
