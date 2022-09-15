
public class DemoMethod {
		

	static int add(int n1,int n2)
	{
		return(n1+n2);
	}
	
	static int sub(int n1,int n2)
	{
		return(n1-n2);
	}
	
	static int mul(int n1,int n2)
	{
	
		return(n1*n2);
	}
	
	static int div(int n1,int n2)
	{
		return(n1/n2);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Addition" +add(10,20));
		System.out.println("Substraction"+""+sub(50,30)); 
		System.out.println("Multiplication"+""+mul(10,10));
		System.out.println("Division is"+""+div(20,10));
		}
}


