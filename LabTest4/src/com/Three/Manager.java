package com.Three;

public class Manager extends Member {
	
	//private String specialization;
	private String department;
	

	public Manager() {                               // default constructor
		super();
		
	}

	public Manager(String name, int age, String phonenumber, String address, String salary, String department ) {//parameterized constructor
		super(name, age, phonenumber, address, salary);
		this.department = department;
	}

	/*public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}*/
     
	public String getDepartment() {                        //getters and setters 
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	 void printSalary() {
		  
		 System.out.println("Salary of member");
	}

}
