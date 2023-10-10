package com.edubridge;


	import java.util.Scanner;

	 

	class Student{

		int age;

		String name;

		

		void inputStudentData() {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter name");

			name=scanner.nextLine();

			

			System.out.println("Enter Age");

			age = scanner.nextInt();

		}

	}

	 

	public class  Instancemethodaccess { 

	 

		public static void main(String[] args) {

			Student student = new Student();

			//student.inputStudentData();

			

			System.out.println("Name = "+student.name); 

			System.out.println("Age = "+student.age);

			

		}

	 

	}


