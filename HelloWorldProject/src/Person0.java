
public class Person0 {
	
	int age;
	String name;
	
	Person0()
	{
	age=0;
	name=null;
	}
	
	void info()
	{
	System.out.println("Age is "+age);
	System.out.println("Name is "+name);
	}

	public static void main(String[] args) {
		Person0 p1=new Person0();
				p1.info();
				
				Person0 p2=new Person0();
				p2.name="Akshada";
				p2.age= 21;
				p2.info();
				
				}

  }
