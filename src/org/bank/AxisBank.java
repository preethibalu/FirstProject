package org.bank;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
	
		System.out.println("Deposit amount is 75000");
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.saving();
		a.fixed();
		a.deposit();
	}

}
