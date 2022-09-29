package com.One;

public class BankMain {

	public static void main(String[] args) {
		
		BankA A1= new BankA();                                                //instance of BankA
		System.out.println("Money Deposited by BankA is : "+A1.getBalance());        //method called of BankA
		          
		BankB B1= new BankB();                                                //instance of BankA
		System.out.println("Money Deposited by BankB is : " +B1.getBalance());       //method called of BankB
		
		BankC C1= new BankC();                                                //instance of BankA
		System.out.println("Money Deposited by BankC is : "+C1.getBalance());        //method called of BankC
	}

}
