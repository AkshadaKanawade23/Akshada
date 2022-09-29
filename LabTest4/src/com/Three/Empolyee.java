package com.Three;

public class Empolyee extends Member {
	
	private String specialization;
	//private String department;

	public Empolyee() {                           // default constructor
		super();
		
	}
	public Empolyee(String name, int age, String phonenumber, String address, String salary, String specialization ) {//parameterized constructor
		super(name, age, phonenumber, address, salary);
		this.specialization=specialization;
	}

	public String getSpecialization() {                          //getters and setters 
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	/*public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}*/
	
	 void printSalary() {
		  
		 System.out.println("Salary of member");
	}
	


}
