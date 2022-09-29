package com.Three;

    public class MemberMain {

	public static void main(String[] args) {
		
		Empolyee E1=new Empolyee("ABC",20 ,"3214697","Sinnar","30000","Devloper");      //instance of empolyee
		System.out.println("Employee details ");
		System.out.println("Name : "+E1.getName());
		System.out.println("Age : "+E1.getAge());
		System.out.println("PhoneNo : "+E1.getPhonenumber());
		System.out.println("Address : "+E1.getAddress());
		System.out.println("Saraly : "+E1.getSalary());
		System.out.println("Department : "+E1.getSpecialization());
		
		Manager M1=new Manager("XYZ", 21, "789456123","Nashik","35000", "IT");        //instance of Manager
		System.out.println("\nManager details ");
		System.out.println("Name : "+M1.getName());
		System.out.println("Age : "+M1.getAge());
		System.out.println("PhoneNo : "+M1.getPhonenumber());
		System.out.println("Address : "+M1.getAddress());
		System.out.println("Saraly : "+M1.getSalary());
		System.out.println("Department : "+M1.getDepartment());
		
	}
	

}
