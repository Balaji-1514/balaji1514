package org.java;

public class ControlDemo {

	public static void main(String[] args) {
        int a=1,b=0,c=0;
		if(a%2<=0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		for(int i=0;i<10;i++) {
			System.out.print(a+" ");
			a++;
		}System.out.println();
		while(b<10) {
			System.out.print(b+" ");
			b++;
		}System.out.println();
		do {
			System.out.print(c+" ");
			c++;
		} while (c<10);
		System.out.println();
		switch(1) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");	
			break;
		}
		
	}

}
