package com.Exception;

import java.util.Scanner;

public class InvalidEmailException {

	public static void main(String[] args) {
		
			
		     Scanner  scan=new Scanner(System.in);           // create scanner obj
				
				System.out.println("Enter string  : ");
				String str = scan.next();                      // input from user
				
				try {                                                  //check the condition
				boolean b = (str.contains("@") && str.contains(".") && str.endsWith("com"));
				
				if(b==false) throw new IllegalArgumentException();      // throw Exception
					System.out.println("Valid Email ID");
				}
				catch(IllegalArgumentException iae)                    // catch exception
				{
					System.out.println("Not getting correct email id");
				}
							
	}

}
