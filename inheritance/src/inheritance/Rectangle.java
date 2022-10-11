package inheritance;

public class Rectangle  extends  Quadrilateral{


public  Rectangle(int length ,int breadth)
{
	super (length);
	this. breadth = breadth;
}

public  Rectangle( )
{
	super();
	
}
  int area()
  {
	  int a=length*breadth;
	//  System.out.println("area of Rectangle is "+a);
	  return a;
  }
	
int breadth;
}
