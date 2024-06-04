package constructs;

public class ForEachEx {

	public static void main(String[] args) {
		int[]  a= {1,2,3};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n-----");
		for(int i:a)
		{
			System.out.print(i+" ");
		}

	}



	}


