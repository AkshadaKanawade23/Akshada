
public class Sum {

	void addNumber(int i,int n)
	{
		int plus=0;
		for( i =1; i<=100; i++)
		{
         plus = plus+i;
	    }
		
     System.out.println("sum of numbers from 1 to 100 is " +plus);
}
   
    public static void main(String[] args) {
    	
    	Sum c1=new Sum();
    	c1.addNumber(1,100);
    }
}
