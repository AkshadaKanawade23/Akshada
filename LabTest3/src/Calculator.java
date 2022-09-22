
public class Calculator {

			int Addition(int... n1)           //for addition
		{
			int sum=0;
			for(int i=0;i<n1.length;i++)
			{
				sum+=n1[i];
			}
			return sum;
		}
		double Addition(double... n1)
		{
			double sum=0;
			for(int i=0;i<n1.length;i++)
			{
				sum+=n1[i];
			}
			return sum;
		}
		
		int Subtraction(int...n2)            //for subtraction	
		{
			int sub=0;
			for(int i=0;i<n2.length;i++)
			{
				sub=n2[i]-sub;
			}
			return sub;
		}
		double Subtraction(double...n2)
		{
			double sub=0;
			for(int i=0;i<n2.length;i++)
			{
				sub=n2[i]-sub;
			}
			return sub;
		}
	
		
		int Multiplication(int...n1)            //For multiplication
		{
			int sum=1;
			for(int i=0;i<n1.length;i++)
			{
				sum =sum*n1[i];
			}
			return sum;
		}
		double Multiplication(double...n1)
		{
			double sum=1;
			for(int i=0;i<n1.length;i++)
			{
				sum =sum*n1[i];
			}
			return sum;
		}
		
	                    
		int Division(int... n1)                    //for division	
		{
			int sum=n1[0];
			for(int i=1;i<n1.length;i++)
			{
			sum/=n1[i];
		    }
			return sum;
		}
		double Division(double... n1)
		{
			double sum=n1[0];
			for(int i=1;i<n1.length;i++)
			{
				sum/=n1[i];
				
			}
			return sum;
		}
		
		public static void main(String[] args) {
			Calculator add=new Calculator();
			System.out.println("Addition 1: "+add.Addition(20,30));              //called addition
			System.out.println("Addition 2: "+add.Addition(40.9,50.7));
			
			Calculator sub=new Calculator();
			System.out.println("Subtraction 1: "+sub.Subtraction(80,40));        //called Substraction
			System.out.println("Subtraction 2: "+sub.Subtraction(50.5,30.5));
		
			Calculator mul=new Calculator();
			System.out.println("Multiplication 1: "+mul.Multiplication(40,5));       //called Multiplication
			System.out.println("Multiplication 2: "+mul.Multiplication(50.5,5.5));

			Calculator div=new Calculator();
			System.out.println("Division 1: "+div.Division(30,10));               // called Division
			System.out.println("Division 2: "+div.Division(20.5,20.5));

		}

	}