
public class Person {
	
	int age;
	String name;
	
	 Person()           // Default constructor
	{
		age=0;
		name=null;
	}
	 
	 Person(int age, String name)  //Parameterizied constructor
	 {
		 this.age=age;             // this keyword is used to know that it is global/instance
		 this.name=name;
	 }
	 
	void PrintInfo ()
	{
		
	System.out.println("name is  "+age);
    System.out.println("age "+name);
		
    }
	
     public static void main(String[] args) {
	
		  Person p1=new  Person();
		  p1.PrintInfo();
		
		  Person p2=new   Person(20,"shruti");
			// p2.name="shru";
			 //p2.age=20;
			 
		        p2.PrintInfo();	
		}

	}


