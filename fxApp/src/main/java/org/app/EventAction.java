package org.app;

import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventDispatchChain;
import javafx.event.EventDispatcher;
import javafx.scene.control.Button;

public class EventAction implements EventDispatcher{
	
	ObservableList data;
	Button button;
	
	public EventAction(ObservableList data, Button button) {
		this.data = data;
		this.button = button;
	}
	
	public EventAction() {
		
	}

	@Override
	public Event dispatchEvent(Event arg0, EventDispatchChain arg1) {
		// TODO Auto-generated method stub
		
		String typ = arg0.getEventType().toString();
		String source = arg0.getSource().toString();
		String target = arg0.getTarget().toString();
		
//		System.out.println("typ: " + typ);
//		System.out.println("source: " + source);
//		System.out.println("target: " + target);
//		
		if (arg0.getTarget() == button && arg0.getEventType().toString().contains("PRESSED"))
		{ 
			System.out.println("typ: " + typ);
			System.out.println("source: " + source);
			System.out.println("target: " + target);
		}
		
		return null;
	}

}
