package functions;
import java.util.Scanner;
public class UDF1 {
	public void add()
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}
	public static void main(String[] args) {
		 UDF1 ob=new  UDF1();
	       ob.add();	

	}

}
