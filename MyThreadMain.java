package com.Multithreading;

public class MyThreadMain {

	public static void main(String[] args) {
		
		MyThread th1 = new MyThread("Thread 1");
		MyThread th2 = new MyThread("Thread 2");
		MyThread th3 = new MyThread("Thread 3");
		
		th1.start();
		th2.start();
		th3.start();
		

	}

}
