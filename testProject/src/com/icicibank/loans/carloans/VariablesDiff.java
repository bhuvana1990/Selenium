package com.icicibank.loans.carloans;

public class VariablesDiff {
	
	static VariablesDiff V; //declaring an object as static

	int x = 10; //here "a" is primitive variable/ instance variable/global variable/non static variable
	static String name ="Inno"; //static variable created when value is common
	static int numbercount = 5; //static variable

	
	// instance method: instance variables or methods can be accessed directly 
	// &  static variables or methods can be accessed directly or with a class object
	public void m1() {
		
		System.out.println("m1 instance method");
		System.out.println(x); //instance variable accessing directly
		System.out.println(name); //static variable accessing directly like this
		System.out.println(VariablesDiff.numbercount); //static variables can be accessed with class object like this
		VariablesDiff.m3(); // or m3(); //static method with class object
	}
	
	// instance method
	public void m2() {
		System.out.println("m2 instance method");
	}
	
	// static method: instance variables or methods can be accessed by creating an object
	// &  static variables or methods can be accessed directly or indirectly with class object
	public static void m3() {
		System.out.println("m3 static method");
		V = new VariablesDiff();
		V.m1(); //instance method calling with an object "obj"
		V.m2(); //instance method
		System.out.println("m3 static method :"+V.x); //instance variables can be accessed by creating an object
		System.out.println("m3 static method :"+VariablesDiff.numbercount); //static variables accessed indirectly with class object 
	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V = new VariablesDiff();
		
		System.out.println(V.x);
		
//		System.out.println(a.name); // we get an error as it is an static method.so need to call directly with variable or with class
	
		System.out.println(VariablesDiff.name); //or System.out.println(name);
		System.out.println(VariablesDiff.numbercount); //or System.out.println(numbercount);
		
		V.m1();
//		V.m2();
//		V.m3(); // here we get an error because of static method. static method can be called directly like m3()
	//	m3(); // or VariablesDiff.m3();
		
	}

}
