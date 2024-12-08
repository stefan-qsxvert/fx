package org.fx.app;

import javafx.beans.property.SimpleStringProperty;

public class Person {
	 
    private String firstName;
    private String lastName;
    private String email;

    public Person(String fName, String lName, String email) {
        this.firstName = new String(fName);
        this.lastName = new String(lName);
        this.email = new String(email);
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    

//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String fName) {
//        firstName = (fName);
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