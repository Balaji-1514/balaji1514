package org.java;

public class Encapsulation {
private String name;
private String Num;
private String Address;

public String getAddress() {
   return Address;
}
public String getName() {
	return name;
}
public String getNum() {
    return Num;
}

public void setAddress( String address) {
	 Address = address;
}
public void setName(String Name) {
     name = Name;
}
public void setNum( String num) {
     Num = num;
 }
}
