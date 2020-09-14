 package org.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		   s.add(10);
	       s.add(20);
	       s.add(30);
	       s.add(50);
	       s.add(40);
	       s.add(20);
	       s.add(60);
	       System.out.println(s);
	       s.remove(20);
	       System.out.println(s);
	       boolean contains = s.contains(60);  
	       System.out.println(contains);
	       for (Integer x : s) {
			System.out.println(x);
		}
	       List<Integer> li = new ArrayList<Integer>();
	       li.add(100);
	       li.add(200);
	       li.add(300);
	       li.add(500);
	       li.add(400);
	       li.add(200);
	       li.add(600);
	       Set<Integer> s1 = new TreeSet<Integer>();
	       s1.addAll(li);
	       System.out.println(s1);
	}
         
}
