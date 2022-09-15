
public class Primee {

	void primeNum(int n) {
		int a;
		for(int i=1;i<=n;i++)  
		{
		    a=0;
		    for (int j=2;j<=i/2;j++)
		    {
			if (i%j==0)
			{
				a++;
				break;
						}	
			}
			if(a==0) 
			{
				System.out.println(i);
			}
			
		    
		}
	}

		public static void main(String[] args) {
			Primee N1=new Primee();
			N1.primeNum(20);

		}
	}	