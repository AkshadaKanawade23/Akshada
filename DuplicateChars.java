// Write a program to find and display the duplicate characters in the string

package StringPackage;
import java.util.Scanner;

 public class DuplicateChars {
	 String s1;                                                  // data type to store user string 
	 int count;  
		 
       void check_duplicate()
		{
		  Scanner string1 = new Scanner(System.in);              // Create a Scanner object
		   System.out.println("Enter the string ");  
			  
		  s1=  string1.nextLine();                               
		   System.out.println("String Entered by User is: " +s1);       // string from user
				
		  char string[] = s1.toCharArray();                             //Converts given string into array  
			System.out.println("Duplicate characters in a given string: ");     
			    
		    for(int i = 0; i <string.length; i++)                       // nested for loop to check all character to other character
			 {  
			  count = 1;  
			    for(int j = i+1; j <string.length; j++) 
			     {  
				   if(string[i] == string[j] && string[i] != ' ')       // if condition to check the character is duplicate or not
				    {  
				     count++;  		                   
				     
				    }  
			 }  
				                                                                      
			   if(count > 1 && string[i] != '0')                         //character is considered as duplicate if count is greater than 1
				      
				  System.out.println(string[i]);  
			 }     
		}  
	
       
	public static void main(String[] args) {
			
	   DuplicateChars D =new  DuplicateChars();                           //Create class  object 
				     
		 D. check_duplicate();                                             //call method to check duplicate string
	}
}
