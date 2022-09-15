
public class TernaryOperator {

	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		int greater;
		
		 greater=(a>b)?a:b;
		 System.out.println("Greater Number is "+greater);
		 
		//OR
		 
		 /*int a=100;
			int b=200;
			int c;
			
			 c=(a>b)?a:b;
			 System.out.println("Greater Number is "+c);
			*/
		
		/*int meal = 5; int tip = 2;
		int total = meal + (meal>6 ? ++tip : tip);
		*/
		
		/*
		long thatNumber = 5 >= 5 ? 1+2 : 1*1;
		 if(++thatNumber < 4)
		 thatNumber += 1;
		 */
		
		/*int pterodactyl = 6;
		 long triceratops = 3; 
		if(pterodactyl % 3 >= 1)
		 triceratops++; 
		triceratops--; 
		System.out.print(triceratops);int pterodactyl = 6;
		 */
		 
		
			/* int flair = 15;
			 if(flair >= 15 && flair < 37) { 
			System.out.print("Not enough"); 
			}
			 if(flair==37) { 
			System.out.print("Just right");
			 } else { 
			System.out.print("Too many");
		   }
			 */
			 
		 /*int hops = 0;
		 int jumps = 0;
		 jumps = hops++;
		if(jumps) 
		System.out.print("Jump!");
		 else
		 System.out.print("Hop!");
		*/	 
		
		/*{
			int plan = 1; plan = plan++ + --plan; 
			if(plan==1) { System.out.print("Plan A");
			 } 
			else { if(plan==2)
			 System.out.print("Plan B"); 
			} 
			else System.out.print("Plan C"); }
			*/
	}
}


