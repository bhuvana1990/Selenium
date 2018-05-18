package com.icicibank.loans.homeloans;

public class Hdfc implements Rbi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc m = new Hdfc();
		m.withdrawal();
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("override withdrawal in HDFC class");
	}
	
	

}
