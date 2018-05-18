package com.icicibank.loans.personalloans;

public class PersonalClass implements PersonalInterface {

	int a, b, result=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonalClass add = new PersonalClass();
		add.additionMethod(5, 10);
		add.additionMethod1(5, 10);
	}

	@Override
	public void additionMethod(int a,int b) {
		// TODO Auto-generated method stub
		
		result = a+b;
		System.out.println("additon result:"+result);
		
	}
	
	// returning result within the method by changing void to int variable
	public int additionMethod1(int a,int b) {
		result = a+b;
		System.out.println("return result of addition:"+result);
		return result;
	}

}
