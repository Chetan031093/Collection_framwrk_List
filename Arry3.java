package List;
import java.util.ArrayList;
import java.util.Iterator;

public class Arry3 
{
	public static void main(String[] args) 
	{
		ArrayList bike = new ArrayList();
		
		bike.add("pulsar");
		bike.add("ktm");
		bike.add("dike");
		bike.add("dominar");
		
		System.out.println(bike);//pulsar,ktm,dike,dominar
		System.out.println("size : "+bike.size());//4
		System.out.println("isEmpty : "+bike.isEmpty());//false
		System.out.println("3rd element is : "+bike.get(3));//dominar
		bike.set(3,"avenger");// replace the value of index no.
		bike.add(3,"scooter");
		bike.remove(1);
		bike.trimToSize();
		System.out.println("size : "+bike.size());
		//bike.clear();
		//System.out.println(bike);
		
		
		
		System.out.println();
		
		Iterator comm_bike = bike.iterator();
		while(comm_bike.hasNext())//true,true,true,true,false--loop breaks
		{
			System.out.println(comm_bike.next());//pulsar,ktm,dike,dominar
		}
		System.out.println();
		
		ArrayList car = new ArrayList();
		car.add("chevrolet");
		car.add("honda");
		car.add("maruti");
		car.add("hyundai");
		
		System.out.println(car);//chevrolet,honda,maruti,hyundai
		System.out.println();
		
		Iterator comm_car = car.iterator();
		
		while(comm_car.hasNext())//true,true,true,true,false--loop breaks
		{
			System.out.println(comm_car.next());//chevrolet,honda,maruti,hyundai
		}
		System.out.println();
		
		ArrayList vehical = new ArrayList();
		vehical.add("bus");
		vehical.addAll(bike);
		vehical.addAll(car);
		
		Iterator all_vehical = vehical.iterator();
		while(all_vehical.hasNext())
		{
			System.out.println(all_vehical.next());
		}
		
		System.out.println();
		vehical.removeAll(bike);
		//vehical.remove("scooter");
		System.out.println(bike.contains("dominar"));//false
		System.out.println(bike.contains("pulsar"));// true
		System.out.println(vehical.containsAll(bike));//false
		System.out.println();
		
		car.remove(2);
		
		car.retainAll(vehical);
		
		comm_car = car.iterator();
		while(comm_car.hasNext())
		{
			System.out.println(comm_car.next());
		}
	}
}
