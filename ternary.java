package lab3;
import java.util.*;
public class ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

int ans=(a>b&&a>c)?a:(b>a&&b>c)?b:c;
System.out.println("ans is:"+ans);
	}

}
