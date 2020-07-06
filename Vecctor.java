package List;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Collections;

public class Vecctor 
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		
		v1.add(1);
		v1.add("chetan");
		v1.add("akshay");
		v1.add(4.3);
		v1.add('A');
		
		Enumeration v11 = v1.elements();
		
		while(v11.hasMoreElements())
		{
			System.out.println(v11.nextElement());
		}
		System.out.println();
		
		Vector v2 = new Vector();
		v2.add("hayabusa");
		v2.add("audi");
		v2.add("amzae");
		v2.add("honda");
		v2.addAll(v1);
		
		Enumeration v22 = v2.elements();
		while(v22.hasMoreElements())
		{
			System.out.println(v22.nextElement());
		}
		System.out.println();
		
		v1.removeAllElements();
		v11 = v1.elements();
		
		while(v11.hasMoreElements())
		{
			System.out.println(v11.nextElement());
		}
		System.out.println();
		
		System.out.println(v2.containsAll(v1));
		v22 = v2.elements();
		System.out.println();
		while(v22.hasMoreElements())
		{
			System.out.println(v22.nextElement());
		}
	}
}
