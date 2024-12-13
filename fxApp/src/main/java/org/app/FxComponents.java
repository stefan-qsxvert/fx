package org.app;

import java.io.File;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FxComponents {
	
	public FxComponents(int indexOfTableColumn, int indexOfButtons) {
	
	}
	public TableView<File> getTableView(int x, int y) {
		TableView<File> tableView = new TableView();
		tableView.setLayoutX(x);
		tableView.setLayoutY(y);
		tableView.prefWidth(270);
		return tableView;
	}
	public TableColumn<File, String> getTableColumn(int i, int wdth, String text) {
		TableColumn<File, String> tableColumn = new TableColumn();
		tableColumn.setText(text);
		tableColumn.setPrefWidth(wdth);
		System.out.println(tableColumn);
		return tableColumn;
	}
	public Button getButton(int i) {
		Button button = new Button();
		button.setText("Klik!");
		return button;
	}	
	
}
