
public class Rectangle {

		int length;
		int width;
		
		Rectangle()
		{
			length=0;
			width=0;

		}
		
		Rectangle(int length , int width)
		{
			this.length=length;
			this.width=width;
	
		}
		
		void Area()
		{
			System.out.println(length*width);
		}
		
		public static void main(String[] args) {
			Rectangle b1=new Rectangle();
			b1.Area();
			
			Rectangle b2=new Rectangle(10,5);
			b2.Area();		
	}

}
