import java.util.*;
public class Vector1
{
	public static void main(String[] args)
	{
		Vector<String> vec=new Vector<String>();//creating a vector
		vec.add("Tiger");//adding elements using add() method
		vec.add("Cat");
		vec.add("Elephant");

		vec.addElement("Deer");//adding elements using addElement() method
		vec.addElement("Lion");
		vec.addElement("Cat");//no prblm if duplicates exists
		System.out.println("Elements are "+vec);
	}
}