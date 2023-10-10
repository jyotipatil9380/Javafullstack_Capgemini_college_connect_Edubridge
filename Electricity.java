package lab3;
import java.util.*;
 class ElectricBill{
	 String n;
	 int units;
	 double bill;
	 
	 void accept() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the name of customer:");
		 n=sc.nextLine();
		 
		 System.out.println("enter the number of units consumed:");
		 units=sc.nextInt()	; 
	 }
	 void calculate() {
		 if(units>0 && units<=100) {
			 bill=units*2;
			 System.out.println("bill amount is:"+bill);
		 }
		 else if(units>100 && units<=200) {
			 bill=100*2.00f+(units-100)*3.00f;
			 System.out.println("bill amount is:"+bill); 
		 }
		 else if(units>=300) {
			 bill=(100*2.00f+200*3.00f+((units-200)*5.00f)*0.025);
			 System.out.println("bill amount is:"+bill);
		 }
	 }
 }

public class Electricity {

	public static void main(String[] args) {
		 ElectricBill ele=new  ElectricBill();
		 ele.accept();
		 ele.calculate();

	}

}
