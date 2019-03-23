package com.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "FirstName",
    "LastName",
    "Email",
    "Password"
})
@XmlRootElement(name = "UserModel")
public class UserModel {
    @XmlElement(required=true)
	private String FirstName;
    @XmlElement(required=false)
	private String LastName;
    @XmlElement(required=true)
	private String Email;
    @XmlElement(required=true)
	private String Password;
    
    //Default constructor to initialize
	public UserModel() {
		super();
	}
	
	//by constructor set values
	public UserModel(String firstName, String lastName, String email, String password) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Password = password;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public String getEmail() {
		return Email;
	}
	public String getPassword() {
		return Password;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "UserModel [FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + ", Password="
				+ (Password) + "]";
	}
	
		
	
}
