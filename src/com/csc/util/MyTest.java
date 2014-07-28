package com.csc.util;

public class MyTest {
	String str = "";
	
	public String getMessage(){
		if (str != ""){
			return str;
		}
		else{
			str = "My Java Test Program";
		}
		System.out.println("[Inside MyTest.java]"+str);
		return str;
	}

	public void setMessage(String s){
		str = s;
	}
}
