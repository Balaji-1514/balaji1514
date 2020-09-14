package org.java;
public class String1 {
	public static void main(String[] args) {
		String s1 = "Greens ";
        String s2 = "greens";
        String u = s2.toUpperCase();
        System.out.println(u);
        String lw = s1.toLowerCase();
        System.out.println(lw);
        int l = s2.length();
        System.out.println(l);
        char c = s1.charAt(6);
        System.out.println(c);
        int fi = s1.indexOf("e");
        System.out.println(fi);
        int li = s1.lastIndexOf("e");
        System.out.println(li);
        boolean sw = s2.startsWith("g");
        System.out.println(sw);
        boolean ew = s2.endsWith("s");
        System.out.println(ew);
        boolean e = s1.equals(s2);
        System.out.println(e);
        boolean ei = s2.equalsIgnoreCase(s1);
        System.out.println(ei);
        boolean empty = s1.isEmpty();
        System.out.println(empty);
        String s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s1.compareTo(s2));
        int i = System.identityHashCode(s3);
        System.out.println(i);
        String s4="how are you";
        String[] split = s4.split(" ", 3);
		for(String x:split)
        System.out.println(x);
		String substring = s3.substring(7, 13);
		System.out.println(substring);
		String str = "technology";
		String r = str.replace("t", "T");
		System.out.println(r);
	}
}
