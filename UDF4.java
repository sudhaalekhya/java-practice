package functions;
import java.util.Scanner;
public class UDF4 {
	public int add(int a,int b)
    {
   	 int c=a+b;
   	 return c;
    }
	public static void main(String[] args) {
		int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        x=sc.nextInt();
        y=sc.nextInt();
        UDF4 ob=new UDF4();
        int z=ob.add(x, y);
        System.out.println(x+"+"+y+"="+z);

	}

}
