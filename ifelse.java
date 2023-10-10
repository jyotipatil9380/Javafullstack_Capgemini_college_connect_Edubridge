package lab3;
import java.util.*;
class checknumber{
	int num;
	void inputData()
	{
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		}
	void display()
	{
		if(num==0) {
			System.out.println("nor positive nor negative");
		}
		else	if(num>0) {
			System.out.println("num is positive");
		}
		else {
			System.out.println("negative number");
		}
	}
}

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checknumber c=new checknumber();
		c.inputData();
		c.display();
		
	}

}
