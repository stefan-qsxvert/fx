package org.app;

import java.io.File;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FxComponents {
	
	public TableView<File> getTableView(int x, int y) {
		EventAction eventAction = new EventAction();
		TableView<File> tableView = new TableView();
		tableView.setLayoutX(x);
		tableView.setLayoutY(y);
		tableView.prefWidth(270);
		tableView.setEventDispatcher(eventAction);
		return tableView;
	}
	public TableColumn<File, String> getTableColumn(int wdth, String text) {
		TableColumn<File, String> tableColumn = new TableColumn();
		tableColumn.setText(text);
		tableColumn.setPrefWidth(wdth);
		return tableColumn;
	}
	public Button getButton(int x, int y, String text) {
		EventAction eventAction = new EventAction(text);
		Button button = new Button();
		button.setText(text);
		button.setLayoutX(x);
		button.setLayoutY(y);
		button.setPrefWidth(156);
		button.setEventDispatcher(eventAction);
		return button;
	}	
}
