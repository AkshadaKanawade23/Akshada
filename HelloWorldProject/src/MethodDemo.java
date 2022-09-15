
public class MethodDemo {
	
	static void add(int n1,int n2)
	{
		System.out.println("Addition is "+(n1+n2));
	}
	
	static void sub(int n1,int n2)
	{
		System.out.println("substration is "+(n1-n2));
	}
	
	static void mul(int n1,int n2)
	{
	
		System.out.println("multiplition is "+(n1*n2));
	}
	
	static void div(int n1,int n2)
	{
		System.out.println("Divition is "+(n1/n2));
	}
	
	public static void main(String[] args) {
		
		add(10,20);
		sub(50,30);
		mul(10,10);
		div(20,10);
		}
}
