package com.edubridge;
import java.util.Scanner;
class Product
{
	int pid;
	String pname;
	float pprice;
	static String cname="wipro";
	void inputProduct()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the product id:");
		pid=sc.nextInt();
		
		System.out.println("enter the product name:");
		pname=sc.next();
		
		System.out.println("enter the product price:");
		pprice=sc.nextFloat();		
		
		
	}
	void display()
	{
		System.out.println(" product id:");
		System.out.println(this.pid);
		System.out.println(" product name:");
		System.out.println(this.pname);
		System.out.println("1 the product price:");
		System.out.println(this.pprice);
		System.out.println(Product.cname);
	}
}
public class Companyproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		p.inputProduct();
		p1.inputProduct();
		p2.inputProduct();
		p3.inputProduct();
		p4.inputProduct();
		p.display();
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		
		}

}
