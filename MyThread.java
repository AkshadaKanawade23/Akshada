/*1.1.Create a class MyThread .Make it a Thread.
Override run() to print names of your 10 friends stored in an array .
Create 3 threads and start them. */

package com.Multithreading;

public class MyThread extends Thread {


	public MyThread() {
	    super();
	 }

	public MyThread(String name) {       //Para Constructor is used to pass the name of thread
		super(name);
	 }
	
	   public void run()
	    {
		   String [] name =  {"Friend A","Friend B","Friend C","Friend D","Friend E",
			"Friend F","Friend G","Friend H","Friend I","Friend J"};
		
		   for(String str:name)
		   {
			   System.out.println(Thread.currentThread().getName()+" : "+str);	
		   }
		
	    }

}
