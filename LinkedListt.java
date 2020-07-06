package List;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListt
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println("head value :"+l.getFirst());
		System.out.println("tail value :"+l.getLast());
		l.addFirst("dinga");
		l.addLast("ranga");
		l.offerFirst("bunga");
		l.offerLast("nanga");
		
		
		LinkedList l2 = (LinkedList)l.clone();
		l2.add("chetan");
		l2.add("akshay");
		l2.addAll(l);
		
		ListIterator l22 = l2.listIterator();
		while(l22.hasNext())
		{
			System.out.println(l22.next());
		}
		System.out.println();
		
		int res = l2.size();
		System.out.println(res);
		System.out.println();
		
		l.retainAll(l2);
		ListIterator l11 = l.listIterator();
		while(l11.hasNext())
		{
			System.out.println(l11.next());
		}
		
		l2.removeAll(l);
		System.out.println(l2.containsAll(l));
		
		l2.remove("ranga");
		System.out.println(l2.contains("ranga"));
		
	}
}
