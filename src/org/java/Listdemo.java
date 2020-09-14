package org.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listdemo {

	public static void main(String[] args) {
       List<Integer> li = new ArrayList<Integer>();
       li.add(10);
       li.add(20);
       li.add(30);
       li.add(50);
       li.add(40);
       li.add(20);
       li.add(60);
       System.out.println(li);
       System.out.println(li.size());
       li.remove(3);
       System.out.println(li);
       System.out.println(li.get(2));
       li.set(4, 50);
       System.out.println(li);
       System.out.println(li.indexOf(20));
       System.out.println(li.lastIndexOf(20));
       List<Integer> li2 = new LinkedList<Integer>();
       System.out.println(li2.isEmpty());
       li2.add(70);
       li2.addAll(li);
       System.out.println(li2);
       li.add(5, 20);
       System.out.println(li);
       System.out.println(li.contains(70)) ;
       List<Integer> li1= new ArrayList<Integer>();
       Integer t = li1.get(0);
       System.out.println(t);
	}

}
