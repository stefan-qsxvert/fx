package org.app;

import javafx.scene.control.CheckBox;

public class Uris {
	
	private boolean testMode;
	
	public boolean isTestMode() {
		return testMode;
	}
	
	public void setTestMode(boolean checkBox) {
		this.testMode = checkBox;
	}

	public String getBramka() {
		String bramka = null;
		switch (String.valueOf(testMode)) {
		case "true":
			bramka = "https://bramka.e-deklaracje.mf.gov.pl/test";
			break;
		case "false":
			bramka = "https://bramka.e-deklaracje.mf.gov.pl/";
			break;
		default:
			bramka = null;
			break;
		}
		
		return bramka;
	}
	public String getWsdl() {
		
		String wsdl = null;
		switch (String.valueOf(testMode)) {
		case "true":
			wsdl = "https://test-bramka.edeklaracje.gov.pl/uslugi/dokumenty?wsdl";
			break;
		case "false":
			wsdl = "https://test-bramka.edeklaracje.gov.pl/uslugi/dokumenty?wsdl";
			break;
		default:
			wsdl = null;
			break;
		}
		return wsdl;
	}

}
