package com.conmt;

import java.util.*;



public class grade {

	

	char grade;
	void InputData() {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the grade:");
	grade=sc.next().charAt(0);
	
	}
	void display() {
		if(grade == 'A') {
			System.out.println("you are ranges from 80 to 100");
		}
		else if(grade=='B') {
			System.out.println("you are ranges from 60 to 79");
		}
		else if(grade=='C') {
			System.out.println("you are ranges from 40 to 59");
		}
		else if(grade=='D')
		{
			System.out.println("you are ranges from 0 to 39");
		}
		else {
			System.out.println("enter a valid input which ranges from A to D");
		}
	}


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 grade g=new grade();
		 g.InputData();
		 g.display();
	}

}
