
public class Operators {

	public static void main(String[] args) {

		int x =5;
		int y =10;
		char choice = '+';
		
		switch(choice)
		{
		case '+'->System.out.println("Addition is "+""+(x+y));
		
		case '-'->System.out.println("Substraction is"+""+(x-y));
		
		case '*'->System.out.println("Multiplication is"+""+(x*y));
		
		case '/'->System.out.println("Division is"+""+(x/y));
		
		case '%'->System.out.println("Modulus is"+""+(x%y));
		
		default ->System.out.println("Invalid Choice"); 
		}

	}
}
