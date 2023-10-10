package com.looping;

import java.util.Scanner;
import java.math.*;
import java.lang.*;
public class armstrongNumber {

	public static void main(String[] args) {
		int count=0,sum=0;
		int num,rem;
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
num=sc.nextInt();


int temp;
temp=num;


while(temp>0) {
	 rem=temp%10;
	count++;
	temp/=10;
}

while(temp!=0)
{
	rem=temp%10;
	sum+=Math.pow(rem,count);
	temp=temp/10;
}
if(sum==num) {
	System.out.println("number is armstrong number");
	
}
else {
	System.out.println("number is not armstrong");
}

	}

}
