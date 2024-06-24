package collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Diffca {

	public static void main(String[] args) {
		//Array
	    String[] a=new String[] {"w","e","l","c","o","m","e"};
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.print(a[i]);
	    }
	    System.out.println();
	    //collections
	    ArrayList<String> al=new ArrayList<>();
	    al.add("w");
	    al.add("e");
	    al.add("l");
	    al.add("c");
	    al.add("o");
	    al.add("m");
	    al.add("e");
	    System.out.println(al);
	    
	    Iterator<String> itr=al.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.print(itr.next());
	    }
	}

}
