package com.Two;

public class Area implements Shape{

	@Override
	public void rectangleArea() {                     // method override
		int length=5;
		int breadth=10;
		System.out.println("Area Of Rectangle is : "+length*breadth);        //To print area of rectangle
		
	}

	@Override
	public void squareArea() {                         // method override
		int side= 10;
		System.out.println("Area Of Square is : "+side*side);                //To print area of square
		
	}

	@Override
	public void circleArea() {                         // method override
		int r =5 ;
		double pi=3.14;
		double area= pi*r*r;
		System.out.println("Area Of Circle is : "+area );                   //To print area of circle
	}

}

	