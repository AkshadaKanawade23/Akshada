package com.Three;

public class Member {

	 private String name;
	 private int age;
	 private String phonenumber;
	 private String address;
	 private String salary;
	 
	 public Member() {                      // default constructor
			super();
	  }
		
	 public Member(String name, int age, String phonenumber, String address, String salary) {      //parameterized constructor
		super();
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.address = address;
		this.salary = salary;
	  }
	 
	 void printSalary() {                          
		 System.out.println("Salary of member");
		 }
	
	public String getName() {                            //getters and setters of all data members
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

}
