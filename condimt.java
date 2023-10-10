package com.conmt;
import java.util.*;
class test{
	
	int marks;
	String grade;
	void InputData() {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the marks:");
	marks=sc.nextInt();
	
	}
	void display() {
		if(marks>=0&& marks>100) {
			System.out.println("invalid input");
		}
		else if(marks>=0 && marks<=39) {
			System.out.println("fail");
		}
		else if(marks>=40 && marks<=59) {
			System.out.println("grade c");
		}
		else if(marks>=60 && marks<=80)
		{
			System.out.println("grade B");
		}
		else {
			System.out.println("grade A");
		}
	}
}
public class condimt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test c=new test();
		c.InputData();
		c.display();
	}

}
