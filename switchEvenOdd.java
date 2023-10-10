package com.conmt;
import java.util.*;
import java.util.Scanner;

	
public class switchEvenOdd {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		switch(n%2) {
		case 0:System.out.println("number is even");
		break;
		case 1:
			System.out.println("number is odd");
		
		}
	}

}
