package datastructure;
import java.util.*;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue q = new LinkedList<Integer>();
		int a=5;
		int b=10;
		int c=15;
		q.add(a);
		q.add(b);
		q.add(c);
		System.out.println("\nQueues in the list=" +q);
		System.out.println("Remove 15 from the list:" +q.remove(c));
		System.out.println("\nQueues in the list after removal of 15 =" +q);
		System.out.println("\nPeek in the line to see who will get out first=" +(q.peek()));
		System.out.println("Queuelist after polling=");
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
