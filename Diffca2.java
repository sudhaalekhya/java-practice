package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Diffca2 {

	public static void main(String[] args) {
		//Array
		 /*   String[] a=new String[] {"w","e","l","c","o","m","e"};
		    for(int i=0;i<a.length;i++)
		    {
		    	System.out.print(a[i]);
		    }
		    System.out.println();*/
		    //collections
		    ArrayList<String> al=new ArrayList<>();
		    al.add("w");
		    al.add("e");
		    al.add("l");
		    al.add("c");
		    al.add("o");
		    al.add("m");
		    al.add("e");
		    al.add(0,"hi ");
		  //  System.out.println(al);
		 //   System.out.println(al.get(4));
		  /*  al.set(1,"to Java");
		    System.out.print(al);*/
		 /*  System.out.println(al.indexOf("e"));
		   System.out.println(al.lastIndexOf("e"));*/
		   // System.out.println(al);
		  /*  al.remove(0);
		    System.out.println(al);*/
		  //  System.out.println(al.subList(4, 8));
		   /* Iterator<String> itr=al.iterator();
		    while(itr.hasNext())
		    {
		    	System.out.print(itr.next());
		    }*/
		    //Collections.sort(al);
		   // Collections.reverse(al);
		    Collections.sort(al,Collections.reverseOrder());
		    System.out.println(al);	

	}

}
