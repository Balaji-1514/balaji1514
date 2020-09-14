package org.java;

public class NameNotFoundException extends Exception {

	@Override
	public String getMessage() {
		System.out.println("check the name");
		return super.getMessage();
	}
	
}
