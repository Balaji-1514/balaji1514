package org.java;

public class UserLaunch {

	public static void main(String[] args){
		try {
		throw new NameNotFoundException();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
