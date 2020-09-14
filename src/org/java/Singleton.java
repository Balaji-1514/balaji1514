package org.java;

public class Singleton {
public static Singleton s;
private Singleton() {}
public static Singleton getName() {
	if(s==null) {
		s=new Singleton();
	}
	System.out.println(s);
	return s;
}
public void display(String a) {
	System.out.println("Name of student is "+ a);
}
	public static void main(String[] args) {
		Singleton s1 =Singleton.getName();
		System.out.println(s1);
	    s.display("Balaji");
	}

}
