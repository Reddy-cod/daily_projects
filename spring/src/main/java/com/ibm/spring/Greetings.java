// File: src/main/java/com/ibm/spring/Greeting.java
package com.ibm.spring;

public class Greetings {
    private String name;
    public Greetings() {
    	System.out.println("Greetings initialized");
    }
    public void initGreet() {
    	System.out.println("Initialized");
    }
    public void destroyGreet() {
    	System.out.println("Destroyed");
    }
    public void setName(String name) {
        this.name = name;
    }

	public String getName() {
		return name;
	}

   
}
