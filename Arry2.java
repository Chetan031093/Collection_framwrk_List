package List;
import java.util.ArrayList;
import java.util.Iterator;
public class Arry2
{
	@SuppressWarnings({"rawtypes","unchecked"})
	public static void main(String[] args) 
	{
		ArrayList hindi = new ArrayList();
		hindi.add("ABCD");
		hindi.add("3 IDIOTS");
		hindi.add("Chhichhore");
		hindi.add("Msd");
		
		Iterator hindimovies = hindi.iterator(); // cursor use to retrive elements from object
		
		while(hindimovies.hasNext()) // checks wheather elements are present or not in object and returns the boolean info (boolean return type method)
		{
			System.out.println(hindimovies.next());// return the next value from object(return element itself)
		}
		System.out.println("---------------------------------");
		
		ArrayList english = new ArrayList();
		
		english.add("Bloodshot");
		english.add("Tenet");
		english.add("BadBoys");
		english.add("Onwards");
		
		Iterator englishmovies = english.iterator();;
		
		while(englishmovies.hasNext())
		{
			System.out.println(englishmovies.next());
		}
		System.out.println("-------------------------------------");
		
		ArrayList movies = new ArrayList();
		movies.add("KGF");
		movies.addAll(hindi);
		movies.addAll(english);
		
		Iterator allmovies = movies.iterator();
		while(allmovies.hasNext())
		{
			System.out.println(allmovies.next());
		}
		
		System.out.println("------------------------------------------");
		
		System.out.println(movies.contains("KGF"));
		System.out.println(movies.containsAll(hindi));
		System.out.println(movies.containsAll(english)); 
		
		System.out.println("------------------------------------------");
		System.out.println(movies.remove("Bloodshot"));
		System.out.println(movies.contains("Bloodshot"));
		System.out.println(movies.contains(english));
		System.out.println("--------------------------------------------");
		
		System.out.println(hindi.contains("ABCD"));
		hindi.remove("3 IDIOTS");
		System.out.println(hindi.contains("3 IDIOTS"));
		System.out.println(hindi.contains("Msd"));
		
		System.out.println("---------------------------------------------");
		
		movies.removeAll(english); // removing english object elements from movies object
		System.out.println(movies.containsAll(english));
		System.out.println();
		
		hindi.retainAll(movies); // pick common elements from both the objects 
		hindimovies = hindi.iterator();
		while(hindimovies.hasNext())
		{
			System.out.println(hindimovies.next()); 
		}
	}	
}
