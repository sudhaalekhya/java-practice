package functions;
import java.util.Scanner;
public class UDF2 {
	public void add(int a,int b)
    {
   	 int c=a+b;
   	 System.out.println(a+"+"+b+"="+c);
    }
	public static void main(String[] args) {
		int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        x=sc.nextInt();
        y=sc.nextInt();
        UDF2 ob=new UDF2();
        ob.add(x, y);

	}

}
