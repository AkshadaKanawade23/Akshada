package StringPackage;

import java.util.Scanner;

public class Palihdrome {
	String S1;                                              // data type to store user string          
    String rev=""; 
	
	  void checkPalihdrome()                               //method to check Palihdrome string
		{  
		  
		  Scanner string1 = new Scanner(System.in);                  // Create a Scanner object
		   System.out.println("Enter the string ");
		   
            String S1= string1.nextLine();                           
              System.out.println("user enter String is: " +S1);      // input from user
             S1 = S1.toLowerCase();                                  //Converts given string into lowercase  
              
	     for(int i =S1.length()-1; i >=0; i--)                        //for loop to convert the string is reverse
	      {    
	    	rev=rev+S1.charAt(i);           
	      }
		}
	    		
	    void display()                                              //method to display string is palindrome or not 
	    {	

	    	if(S1.equals(rev)) {                                     //if condition to check given string and revers string is equal or not 
	    		System.out.println("String is Palindrome");          // it's equal then string is palihdrome
	    	  }
	    	 else {     
		     System.out.println("String is not a palindrome");  
	    	  }
	    } 
	   	    
	    public static void main(String[] args) {
	    	
			Palihdrome p =new Palihdrome();                           // Create a class  object                                         
			 p.checkPalihdrome() ;                                    //call the  method to check string is palihdrome or not 
			 p.display();                                             // call the display method 

		} 
}
