package List;

import java.util.ArrayList;

public class Arry 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		
		a1.add(25);
		a1.add(4.8);
		a1.add(25);
		a1.add(null);
		a1.add("Hi");
		a1.add('A');
		
		System.out.println(a1.get(4)); // Hi
		System.out.println(a1.isEmpty()); // False
		System.out.println(a1.size());//6
		
		System.out.println(a1); //[25, 4.8, 25, null, Hi, A]
		
		a1.add(3,"oye"); // right shift
		System.out.println(a1); //  [25, 4.8, 25, oye, null, Hi, A]
		
		a1.remove(1); // left shift
		System.out.println(a1);// [25, 25, oye, null, Hi, A]
		
		a1.set(4, "Mac");
		System.out.println(a1);// [25, 25, oye, null, Mac, A]
		
		a1.trimToSize();
		System.out.println(a1.size());  //6 
		
		a1.clear();
		System.out.println(a1); //[]
	}
}

