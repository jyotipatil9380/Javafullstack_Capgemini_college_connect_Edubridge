package lab3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		int flag=1;
			if(num==0 || num==1) {
				System.out.println("number is not prime");
			}
			
		for(int i=2;i<num;i++)
		{
			if(num%i==0) {
				flag=0;
				break;
			}
		}
			
		if(flag==1) {
			System.out.println("number is  prime");
		}
		else {
			System.out.println("number is not prime");
		}
	}

}
