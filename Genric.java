package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Genric
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(22);
		a2.add(68);
		//a2.add(4.5);
		a2.add(36);
		a2.add(98);
		a2.add(54);
		a2.add(32);
		
		System.out.println(a2);
		System.out.println();
		Iterator a22 = a2.iterator();
		while(a22.hasNext())
		{
			System.out.println(a22.next());
		}
		System.out.println();
		
		System.out.println("max no. is : "+Collections.max(a2));
		System.out.println("min no. is : "+Collections.min(a2));
		System.out.println();
		
		System.out.println(Collections.frequency(a2, 32));
		
		Collections.sort(a2);
		System.out.println(a2);
		System.out.println();
		
		Collections.reverse(a2);
		System.out.println(a2);
		
		Collections.swap(a2, 0, 2);
		System.out.println(a2);
		System.out.println();
		
		Collections.shuffle(a2);
		System.out.println(a2);
		
		Collections.replaceAll(a2, 54, 55);
		System.out.println(a2);
		
		System.out.println(a2.get(1));
		System.out.println("size is :"+a2.size());
		System.out.println("isEmpty :"+a2.isEmpty());
		
		ArrayList a3 = new ArrayList();
		
		a3.add(1);
		a3.add("chetan");
		a3.add(36);
		System.out.println();
		
		ArrayList a4 = new ArrayList();
		a4.add("akshay");
		a4.addAll(a2);
		a4.addAll(a3);
		
		Iterator a44 = a4.iterator();
		while(a44.hasNext())
		{
			System.out.println(a44.next());
		}
		System.out.println();
		
		System.out.println(a4.contains("akshay"));
		System.out.println(a4.containsAll(a3));
		System.out.println(a4.containsAll(a2));
		
		a3.remove("chetan");
		System.out.println(a3.contains("chetan"));
		System.out.println();
		
		a4.removeAll(a2);
		System.out.println(a4.containsAll(a2));
		
		a3.retainAll(a4);
		Iterator a33 = a3.iterator();
		while(a33.hasNext())
		{
			System.out.println(a33.next());
		}
		
	} 
	
}
