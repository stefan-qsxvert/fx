package org.app;

import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventDispatchChain;
import javafx.event.EventDispatcher;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class EventAction implements EventDispatcher{
	
	ObservableList data;
	Button button;
	TableView table;
	
	public EventAction(ObservableList data, Button button) {
		this.data = data;
		this.button = button;
	}
	
	public EventAction(ObservableList data, TableView table) {
		this.data = data;
		this.table = table;
	}
	
	public EventAction() {
	}

	@Override
	public Event dispatchEvent(Event arg0, EventDispatchChain arg1) {
		// TODO Auto-generated method stub
		
		StringPrep stringPrep = new StringPrep();
		
		String typ = arg0.getEventType().getName(); // toString();
		String source = arg0.getSource().toString();
		String target = arg0.getTarget().toString();

		if (typ == "MOUSE_PRESSED")
		{ 
			System.out.println("typ: " + typ);
			System.out.println("source: " + source);
			System.out.println("target: " + target);
		}
		
//		if (arg0.getTarget() == table || arg0.getSource() == table) {
//
//			System.out.println("typ: " + typ);
//			System.out.println("source: " + source);
//			System.out.println("target: " + target);
//		}
		
		
		return null;
	}

}
