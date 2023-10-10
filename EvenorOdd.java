package com.looping;
import java.util.*;
public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

int sum=0;
int even=0;
 for(int i=1;i<=100;i++)
   if(i%2==0) {
	   sum+=i;
	
   }
   else {
	   even+=i;
   }
 System.out.println(sum);
 System.out.println(even);
 
	}
	 

}
