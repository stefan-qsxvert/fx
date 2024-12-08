package org.fx.app;

import javafx.beans.property.SimpleStringProperty;

public class Person {
	 
    private  SimpleStringProperty firstName;
    private  SimpleStringProperty lastName;
    private  SimpleStringProperty email;

    public Person(String fName, String lName, String email) {
        this.firstName = new SimpleStringProperty(fName);
        this.lastName = new SimpleStringProperty(lName);
        this.email = new SimpleStringProperty(email);
    }

	public SimpleStringProperty getFirstName() {
		return firstName;
	}

	public void setFirstName(SimpleStringProperty firstName) {
		this.firstName = firstName;
	}

	public SimpleStringProperty getLastName() {
		return lastName;
	}

	public void setLastName(SimpleStringProperty lastName) {
		this.lastName = lastName;
	}

	public SimpleStringProperty getEmail() {
		return email;
	}

	public void setEmail(SimpleStringProperty email) {
		this.email = email;
	}

    
	
//    public String getFirstName() {
//        return firstName.get();
//    }
//
//    public void setFirstName(String fName) {
//        firstName.set(fName);
//    }
//
//    public String getLastName() {
//        return lastName.get();
//    }
//
//    public void setLastName(String fName) {
//        lastName.set(fName);
//    }
//
//    public String getEmail() {
//        return email.get();
//    }
//
//    public void setEmail(String fName) {
//        email.set(fName);
//    }
}