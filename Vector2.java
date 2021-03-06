import java.util.*;
public class Vector2
{
	public static void main(String[] args)
	{
		Vector<String> vec=new Vector<String>(2);//creating a vector by passing capacity as 2
		vec.add("Tiger");
		vec.add("Cat");
		vec.add("Elephant");

		System.out.println("Size is "+vec.size());
		System.out.println("Capacity is "+vec.capacity());//as we add elemnts more than capacity it doubles automatically.

		System.out.println("Elements are "+vec);

		vec.addElement("Deer");

		System.out.println("Size is "+vec.size());
		System.out.println("Capacity is "+vec.capacity());//again checking capacity only doubles when elemnts more than capacity is there not when equal.
		System.out.println("Elements are "+vec);

		vec.addElement("Cat");
		vec.add("Cat");
		vec.add("Cat");
		vec.add("Cat");
		vec.add("Cat");
		System.out.println("Size after addition "+vec.size());
		System.out.println("Capacity after addition "+vec.capacity());
		System.out.println("Elements are "+vec);
	
	}
}