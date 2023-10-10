package com.edubridge;

import java.util.Scanner;

class Employee{
	 //variable declared inside the class is called instance variable
	String name;
	int age;
	float salary;
	char gen;
	void inputData()
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the name");

		//name = scanner.next(); //string single word

		name = scanner.nextLine(); //with the space more than one word

		

		System.out.println("Enter age");

		age = scanner.nextInt(); //int datatype

		

		System.out.println("Enter salary");

		salary = scanner.nextFloat();

		

		System.out.println("Enter gender (M/F)");

		gen = scanner.next().charAt(0); //read char

		
	}
	void displayData() {
		System.out.println("Employee Details ");

        System.out.println("Name = "+name);	

        System.out.println("Age ="+age);

        System.out.println("Salary ="+salary);

        System.out.println("Gender ="+gen);
	}
}


public class encapsulation {

	public static void main(String args[])
	{
	
		Employee e=new Employee();
		e.inputData();
		e.displayData();
	}
}
