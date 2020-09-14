package org.java;

public class Poly2 extends Polymorphism{
	@Override
	public void subtract() {
		int a,b,c;
		a=32;b=24;
		c= a-b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		Poly2 l= new Poly2();
		l.add();
		l.add(96,64,85);
		l.subtract();
		l.add(45, 96);
		Polymorphism o = new Poly2();
		o.subtract();
		o.add(45, 96);
	}

}
