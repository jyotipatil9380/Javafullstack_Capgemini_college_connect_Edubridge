package com.looping;
import java.util.*;
public class factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
double fact=1;

for(int i=1;i<=n;i++) {
	fact*=i;
}
System.out.println(fact);
	}

}
