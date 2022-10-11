package inheritance;

public class Square extends Quadrilateral
{
	public Square (int length )
	{
		super (length);
	}
	public  Square()
	{
		super();
		
	}
	
	int area()
	  {
		  int a=length*length;
		//  System.out.println("area of Square is "+a);
		  return a;
	  }
}

	