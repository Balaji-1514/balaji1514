package org.java;

public class ControlDemo2 {

	public static void main(String[] args) {
		int a[][]=new int[2][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		for (int[]x : a) {
			for (int y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		int b=0;
		if(b%2<=0) {
			System.out.println("even");
			if(b==0) {
				System.out.println("if b value is 0 then it is neither odd nor even ");
			}else{
				System.out.println("b is not zero");
			}
		}else {
			System.out.println("odd");
		}
	}

}
