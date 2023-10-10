package lab3;
import java.util.*;
public class Evenodd {
public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	num=sc.nextInt();
	 String msg =  (num % 2 == 0) ? "The number is even!" : "The number is odd!";
	    System.out.println(msg);
	}
}
