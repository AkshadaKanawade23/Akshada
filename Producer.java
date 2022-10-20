/*3.Apply InterThread Communication on demand and supply model.
  Create a class Producer with one data member int availableProduct and 
  two methods --demand() and supply().
  Create two threads . In the run() of first thread call demand(int n) and 
  In the run() of second thread call supply(int n).If deamnding number is gretaer than availableProduct
  consumer should wait till supply increases the availableProduct. */

package InnarThreadComm;

public class Producer {

	int availableProduct= 1000;
	
	void demand(int n)
	{
		 System.out.println("Available Products  Before Demand :"+availableProduct);
		 try {
		 if(n>availableProduct);
		  wait();
		  availableProduct-=n;
		 System.out.println("Available Product After Demand :"+availableProduct);
		 }catch(InterruptedException ie)
		 {
			 System.out.println(ie);
		
		 }
	}
		
	synchronized public void supply(int n)
	{
		System.out.println("Available Product Before Supply :"+availableProduct);
		availableProduct+=n;
		System.out.println("Available Product After Supply :"+availableProduct);
		notify();
	}
}
