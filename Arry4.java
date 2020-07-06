package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Arry4
{
	public static void main(String[] args) 
	{
		ArrayList numbers = new ArrayList();
		
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(3);
		numbers.add(8);
		numbers.add(0);
		numbers.add(2);
		
		Collections.sort(numbers);
		System.out.println(numbers);
		System.out.println();
		
		Collections.reverse(numbers);
		System.out.println(numbers);
		System.out.println();
		
		System.out.println("max no.is : "+Collections.max(numbers));
		System.out.println("min no is : "+Collections.min(numbers));
		System.out.println();
		
		System.out.println(numbers);
		Collections.swap(numbers, 0, 5);
		System.out.println(numbers);
		System.out.println();
		
		Collections.shuffle(numbers);
		System.out.println(numbers);
		System.out.println();
		
		Collections.replaceAll(numbers, 2, 30);
		System.out.println(numbers);
		
		System.out.println(Collections.frequency(numbers, 30));
		System.out.println();
		
		Collections.sort(numbers);
		
		Iterator all_numbers = numbers.iterator();
		while(all_numbers.hasNext())
		{
			System.out.println(all_numbers.next());
		}
		System.out.println();
		
		ArrayList name = new ArrayList();
		
		name.add("dinga");
		name.add("ranga");
		name.add("bungi");
		name.add("bunga");
		name.add("dingi");
		
		Iterator all_name = name.iterator();
		while(all_name.hasNext())
		{
			System.out.println(all_name.next());
		}
		System.out.println();
		
		ArrayList data = new ArrayList();
		data.add("chetan");
		data.addAll(numbers);
		data.addAll(name);
		
		Iterator all_data = data.iterator();
		while(all_data.hasNext())
		{
			System.out.println(all_data.next());
		}
		System.out.println();
		System.out.println("size of data is : "+data.size());//13
		data.add(2,"akshay");
		System.out.println("size of data is : "+data.size());//14
		data.set(5, 4.6);
		System.out.println("size of data is : "+data.size());//14
		System.out.println();
		
		all_data = data.iterator();
		while(all_data.hasNext())
		{
			System.out.println(all_data.next());
		}
	}
}
