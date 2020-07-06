package List;
import java.util.Stack;
import java.util.Vector;
import java.util.Enumeration;

public class Stacck
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		
		s.push(1);
		s.push("chetan");
		s.push("salve");
		System.out.println();
		Enumeration ss = s.elements();
		while(ss.hasMoreElements())
		{
			System.out.println(ss.nextElement());
		}
		
		
		s.pop();
		
		System.out.println(s);
		
		System.out.println("--------------------------");
	
		Vector v1 = new Vector();
		v1.add(12);
		v1.add(4.8);
		v1.add(19);
		v1.add("akshay");
		v1.addAll(s);
		System.out.println();
		Enumeration vv = v1.elements();
		while(vv.hasMoreElements())
		{
			System.out.println(vv.nextElement());
		}
		
		
		
	}
}
