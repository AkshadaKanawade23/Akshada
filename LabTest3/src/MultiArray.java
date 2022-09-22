
public class MultiArray {
	
	void resultantArray()
	
	{
		int [] [] td1 = {{10,20,30},{5,10,15}};
		int [] [] td2 = {{2, 2, 2} ,{5, 2, 4}};
		int [] [] ad= new int [3] [3];
		 
		System.out.println("Multiplication of two matrices ");
		
		for(int i=0; i<td1.length; i++)                //no of rows
		{
			
			for(int j=0; j<td1[i].length; j++)          //no of columns
			{
				ad[i][j] = td1[i][j]*td2[i][j];         // multiplication of Array
				System.out.print(ad[i][j]+" ");         
			}
		System.out.println();
		}
		
	}
		
	public static void main(String[] args) {
		MultiArray M1=new MultiArray();
		M1. resultantArray();                     // called resultantArray
	}

}
