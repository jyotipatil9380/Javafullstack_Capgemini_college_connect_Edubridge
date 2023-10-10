package com.conmt;

import java.util.Scanner;

class areafig{
	double area;
	double length,breadth;
	
	public double areaSquare(double side) {
		area=side*side;
		System.out.println("area of square"+area);
		return side;
	}
	public double areaRectangle(double length,double breadth) {
		area=length*breadth;
		return area;
	}
}
public class SwitchArea {

	public static void main(String[] args) {
	double length,breadth,side;
	 Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("********MENU*********");
		System.out.println("1.rectangle");
		System.out.println("2.square");
		int choice=calculator.sc.nextInt();
		areafig as=new areafig();
		switch(choice)
		{
		case 1:System.out.println("enter the length and breadth");
		 length=sc.nextDouble();
		 breadth=sc.nextDouble();
		 double area=as.areaRectangle(length, breadth);
		System.out.println("area is"+area);
		break;
		
		
		case 2:System.out.println("enter the side");
		 side=sc.nextDouble();
		
		 double areab=as.areaSquare(side);
		System.out.println("area is"+areab);
	
		
		}
		
	}

}
