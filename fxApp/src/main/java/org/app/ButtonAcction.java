package org.app;

import javafx.event.Event;
import javafx.event.EventDispatchChain;
import javafx.event.EventDispatcher;

public class ButtonAcction implements EventDispatcher{

	@Override
	public Event dispatchEvent(Event arg0, EventDispatchChain arg1) {
		// TODO Auto-generated method stub
		
		String typ = arg0.getEventType().toString();
		String source = arg0.getSource().toString();
		String target = arg0.getTarget().toString();
		
		System.out.println("typ: " + typ);
		System.out.println("source: " + source);
		System.out.println("target: " + target);
		
		
		return null;
	}

}