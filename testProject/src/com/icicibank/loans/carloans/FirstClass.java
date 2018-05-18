package com.icicibank.loans.carloans;

public class FirstClass {

	int a = 10, b =20, result = 0;
	
	// addition 

	public void additon() {
	
		result = a+b;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// addition
		System.out.println("true");
		FirstClass obj = new FirstClass();
		obj.additon();
		System.out.println(obj.a);
		
		FirstClass obj1 = new FirstClass();
		obj1.additon();
	}

}
