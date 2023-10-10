package com.conmt;
import java.util.*;
class calculator{
	int n1,n2,ans;
	static Scanner sc= new Scanner(System.in);
	void InputData() {
		
		n1=sc.nextInt();
		n2=sc.nextInt();
		
	}
	void addition()
	{
		ans=n1+n2;
		System.out.println("Addition is"+ans);
	}
	void substraction()
	{
		ans=n1-n2;
		System.out.println("substraction is"+ans);
	}
	
}
public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("********MENU*********");
System.out.println("1.addition");
System.out.println("2.substraction");
System.out.println("3.multiplication");
System.out.println("4.division");
int choice=calculator.sc.nextInt();

	 calculator c=new calculator();
	 c.InputData();
	 switch(choice) {
	 
	case 1:c.addition();
	break;
	case 2:c.substraction();
	break;
		default:
			System.out.println("enter the valid input");
	}
	}
}
