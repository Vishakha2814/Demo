package com.person;

public class Person {
	String name;  
    String country; 
    String experience; 
    Person(String x, String y,String z){
		name = x;    
        country = y;  
        experience = z; 
    }
	public String Getdata() {
		return("ClassEmployee details :"+name+" "+country+" "+experience);
	}	
}
