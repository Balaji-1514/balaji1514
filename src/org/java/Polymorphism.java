package org.java;

public class Polymorphism {
public void add() {
	int a,b,c;
	float e,f;
	a=10;b=20;
	c=a+b;
	e=69;f=35;
	float g=e/f;
	System.out.println(g);
	System.out.println(c);
}
public void add(int a,int b) {
	int c=a+b;
	System.out.println(c);
}  
public void add(int a, int b, float c) {
    int f=a+b;
	float d = f/c;
    System.out.println(d);
}
public void subtract() {
System.out.println("overriding");
}

}
