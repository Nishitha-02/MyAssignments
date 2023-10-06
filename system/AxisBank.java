package org.system;

public class AxisBank extends BankInfo {
	public void deposit() {
		super.deposit();
		System.out.println("Money deposited");
	}

	public void bankBranch() {
		System.out.println("Chennai Branch");
	}
	
	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.bankBranch();
		bank.deposit();
		bank.fixed();
		bank.saving();
		

	}

}
