package org.app;

import java.io.File;

import javafx.event.Event;
import javafx.event.EventDispatchChain;
import javafx.event.EventDispatcher;
import javafx.event.EventHandler;

public class EventAction implements EventHandler<Event>{
	
	String arcType;
	Edeklaracje edeklaracje;
	
	public EventAction(String arcType) {
		this.arcType = arcType;
		edeklaracje = new Edeklaracje();
	}
	public EventAction() {
	}
	
	
	@Override
	public void handle(Event arg0) {
		// TODO Auto-generated method stub
		
//		String typ = arg0.getEventType().getName(); // toString();
//		String source = arg0.getSource().toString();
//		String target = arg0.getTarget().toString();
		
//		if (typ == "MOUSE_PRESSED")
		{ 
			switch(arcType) {
			case "prd":
				System.out.println("case produkcja");
				break;
			case "pobierz UPO":
				File file = new File("/home/tee/refIds/");
				String[] fileList = file.list();
				for (int i = 0; i < fileList.length; i++) {
				edeklaracje.getUPO(fileList[i]);
				}
				System.out.println("case test");
				break;
			case "generuj wsdl":
				System.out.println("generuj wsdl");
				String wsdl = "https://test-bramka.edeklaracje.gov.pl/uslugi/dokumenty?wsdl";
				WsdlToJavaGenerator wsdlToJavaGenerator = new WsdlToJavaGenerator();
				wsdlToJavaGenerator.generateTestWsdlSource("test", wsdl);
				break;
			default:
				System.out.println("brak zdefiniiowanego działania");
				break;
			}
		}
		
//		return arg0;
	}
	
}
