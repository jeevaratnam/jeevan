package com.miraclesoft;

public class JavaExample {
	public static void main(String[] args) {

//		String str = "a.b.c=c.b.a";
//		System.out.println(str);
		
		String s1="a.b.c=c.b.a";  
		  
		for(String w:s1.split("\\s",1)){  
		System.out.println(w); 
		}
	    
	}

}
