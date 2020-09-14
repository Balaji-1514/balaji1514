package org.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
	  Map<Integer, String> m = new HashMap<>();
	  m.put(1, "greens");
	  m.put(2, "tech");
	  m.put(3, "python");
	  m.put(4, "selenium");
	  m.put(5, "omr");
	  m.put(6, "java");
	  System.out.println(m);
	  int size = m.size();
	  System.out.println(size);
	  String o = m.get(2);	  
	  System.out.println(o);
	  Collection<String> v = m.values();
	  System.out.println(v);
	  Set<Integer> k = m.keySet();
	  System.out.println(k);
	  boolean ck = m.containsKey(6);
	  System.out.println(ck);
	  boolean cv = m.containsValue("omr");
	  System.out.println(cv);
	  Set<Entry<Integer, String>> es = m.entrySet();
	  for (Entry<Integer, String> entry : es) {
		System.out.println(entry);		
	}
	  for (Entry<Integer, String> entry : es) {
		  Integer key = entry.getKey();
		  String value = entry.getValue();
		  System.out.println(key);
		  System.out.println(value);
	}
	}

}
