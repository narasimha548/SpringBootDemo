package com.example;

public class Calculator {
	
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public boolean compareNamesAreEqualOrNot(String name1,String name2) {
		
		boolean res=name1.equals(name2);
		
		if(res==false)
			throw new NullPointerException();
		
		return res;
	}

}
