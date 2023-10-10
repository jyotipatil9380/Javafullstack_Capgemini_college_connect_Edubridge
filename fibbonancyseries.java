package com.looping;
import java.util.*;
public class fibbonancyseries {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the terms");
	int num;
	int sum=0;
	num=sc.nextInt();
	int n=1,n1=1,temp;
	System.out.println(n);
	System.out.println(n1);
	for(int i=2;i<num;i++) {
		sum=n+n1;
		System.out.println(sum);
		n=n1;
		n1=sum;
		
	}
}
}
