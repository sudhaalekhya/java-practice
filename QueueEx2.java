package collections;
import java.util.*;
public class QueueEx2 {

	public static void main(String[] args) {
		Queue<Integer> queue1=new ArrayDeque<>(1);
		Queue<Integer> queue2=new ArrayDeque<>(1);
		queue1.add(1);
		queue1.add(2);
		queue1.add(3);
		queue1.add(4);//exception
		System.out.println(queue1);
		queue2.offer(1);
		queue2.offer(2);
		queue2.offer(3);
		queue2.offer(4);//false
		System.out.println(queue2);
	

	}

}
