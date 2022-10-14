
	package com.Exception;

	import java.util.Scanner;

	public class CountVowel {

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);                                   
			System.out.println("Enter The string :");          
			String s1=sc.next();                             // input from user                                               
			char ch[]=s1.toCharArray();                      //   convert the string into array 
		    int count=0;
		    for(int i=0;i<ch.length;i++)                                  //create loop for array 
		    {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')      //if condition to check  vowels 
			{
			count++;
		    }
			}
		    	    
		    try {                                                    // if string contain x then through  exception 
		    	if(s1.contains("x"))                       
		    	throw new Exception();
		        }
		    catch(Exception e) 
		        {
		    	System.out.println("String should not conatin x");
		        }
		   
		    System.out.println("Number of Vowels in your string : "+count);
		     
		}

	}


