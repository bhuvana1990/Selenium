package com.icicibank.loans.homeloans;

public class Icici implements Rbi{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icici b = new Icici();
		b.withdrawal();
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("override withdrawal of ICICI ");
		
	}

}
