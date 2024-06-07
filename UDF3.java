package functions;
import java.util.Scanner;
public class UDF3 {
	public int add()
	   {
		    int a,b,c;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 numbers:");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a+b;
			return c;
	   }
	public static void main(String[] args) {
		UDF3 ob=new  UDF3();
	    int z=ob.add();
	    System.out.println(z);

	}

}
