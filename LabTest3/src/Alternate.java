/*Proejct name : LabTest3

Calculator.java
1.WAP to create  a calculator for int and double using varargs. four methods--addition(),subtraction(),multiplication(),didvision().*/

public class Alternate {
	public static int[] Alter(int arr[])
    {
	int x=0;
    int  arr2[]=new int [arr.length/2];		
    for(int i=0;i<arr.length;i++)    //To check
    {
	    if(i%2!=0)  // check condition
	    {
	    arr2[x]=arr[i];
		x++;
	    } 
	}
	return arr2; //Returns value
	}
	void displayAdd(int[] x) {      //Method to add second array
		int sum=0;
		for(int i=0;i<x.length;i++)    
		{
			sum+=x[i];
		}
		System.out.print("Addition :"+sum);
	}
	
	public static void main(String[] args) {
		Alternate alt=new Alternate();
	int a[]= {2,3,4,4,5,6,7,8,9,10};
	int b[]= alt.Alter(a);
	
    for(int i=0;i<b.length;i++)    //To print the Array
     {
	   System.out.println(b[i]);
     }
      alt.displayAdd(b);
 
	}
}