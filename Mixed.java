package List;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class Mixed 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(3);
		
		Vector v1 = new Vector();
		v1.add(9);
		v1.add(10);
		v1.add(11);
		v1.add(12);
		
		Stack s = new Stack();
		s.push(31);
		s.push(32);
		s.push(33);
		
		LinkedList l = new LinkedList();
		l.add(41);
		l.add(42);
		l.add(43);
		
		System.out.println(" l head is  : "+l.getFirst());
		System.out.println(" l head is  : "+l.getLast());
		System.out.println();
		
		l.addFirst("head");
		l.addLast("tail");
		l.offerFirst("A");
		l.offerLast("B");
		
		System.out.println(l);
		
		System.out.println();
		LinkedList l2 = (LinkedList)l.clone();
		System.out.println(l2);
		
		l2.addFirst("akshay");
		l2.addLast("prakash ");
		l2.offerFirst("salve");
		l2.offerLast("chetan");
		System.out.println(l2);
		
		
		l.addAll(a1);
		l.addAll(v1);
		l.addAll(s);
		l.addAll(l2);
		System.out.println();
		
		Iterator ll = l.iterator();
		while(ll.hasNext())
		{
			System.out.println(ll.next());
		}
		System.out.println();
		
		int size = l.size();
		System.out.println(size);
		
		
	}
}
