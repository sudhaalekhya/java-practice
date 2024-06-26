package collections;
import java.util.*;
public class SetEx {

	public static void main(String[] args) {
		// Set<String> s=new HashSet<>();//random order
		 //	Set<String> s=new TreeSet<>();//ascending order
		/*	Set<String> s=new LinkedHashSet<>();//insertion order
	      s.add("Dog");
	      s.add("Cat");
	      s.add("Rat");
	      s.add("Dog");
	      System.out.println(s);
	      s.remove("Rat");
	      System.out.println(s);
	      System.out.println(s.isEmpty()+" "+s.size());
	      s.clear();
	      System.out.println(s.isEmpty()+" "+s.size());*/
	      Set<Integer> s1=new HashSet<>(Arrays.asList(1,3,5,0));
	      Set<Integer> s2=new HashSet<>(Arrays.asList(2,4,6,0));
	     Set<Integer> s3=new HashSet<>(Arrays.asList(3,5));
	     // s1.addAll(s2);//Union
	     // s1.removeAll(s2);//Difference
	     // s1.retainAll(s2);//Intersection
	     // System.out.println(s1+" "+s2);
	      boolean res=s1.containsAll(s3);
	      System.out.println(res);

	}

}
