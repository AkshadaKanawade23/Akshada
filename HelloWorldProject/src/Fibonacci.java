
public class Fibonacci {
	
	void fiboo(int n)  
	{ 
		int a=0, b=1,c=0;
		 System.out.println(a);
		 //System.out.println(b);
		 
		for(int i=1;i<=n;i++)  
		{
		 c=a+b;                     
		 System.out.println(c);
		  a=b;
		  b=c;
		}
		
	
	}
 
	public static void main(String[] args) {
		
		Fibonacci series=new Fibonacci();
		
		series.fiboo(20);
	}

}
