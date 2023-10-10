package com.looping;

import java.util.Scanner;

public class factorofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
 for(int i=1;i<=n;i++)
 {
	 if(n%i==0) {
		 System.out.println(i);
	 }
	 
 }
	
	}

}
