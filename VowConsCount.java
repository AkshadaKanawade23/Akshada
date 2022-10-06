package StringPackage;
//Write a program to count the total number of vowels and consonants present in the given string.

import java.util.Scanner;
public class VowConsCount {
	
   int vowCount = 0, consCount = 0;          // data type for count vowels & consonants  
   String s1;                                // to store user string 
	
	void  countVoweCons()                                  // method to count char is vowel or consonant
	{	
		Scanner string1 = new Scanner(System.in);           // Scanner object
		  System.out.println("Enter the string ");

	    String s1 =  string1.nextLine();                               
	    System.out.println("String Enter by User : " +s1);           //input from user	     
	     s1= s1.toLowerCase();                                       // convert string is lower case   
		 
	 for(int i = 0; i < s1.length(); i++)                            // for loop to check char is a vowel or consonant 	 
	  {                                                             
	     if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' 
			 || s1.charAt(i) == 'o' || s1.charAt(i) == 'u')         //Checks character is a vowel  using if condition
           {    	            	   
	        vowCount++;                                             //Increments vowel counter   
	       }
         else if(s1.charAt(i) >= 'a' && s1.charAt(i)<='z')          //Checks whether a character is a consonant 
           {      
             consCount++;                                           //Increments consonant counter 
           }           
	    }
	 }
	 	
	 void display()                                                 // method to display vowel & constant count               
	 {
	   System.out.println("Number of vowels:      " +  vowCount++);      
       System.out.println("Number of consonants:  " + consCount++ );
	 }
	   
	public static void main(String[] args) {  
		
	  VowConsCount vc =new VowConsCount();                           // Create a class  object       
		
		 vc.countVoweCons();                                         // call countVowelCons method
		 vc.display();                                               // call display method 	
	}
}

