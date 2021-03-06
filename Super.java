

//demo of same output for 2 pgms even if super() isnt used

class Sup
{
	Sup()
	{
		System.out.println("Superclass");
	}
}
class Sub extends Sup
{
	Sub()
	{
		super();//no change if it is not used Sup() will be automatically called
		System.out.println("SubClass");
	}
}
class Super
{
	public static void main(String[] args)
	{
		Sub obj1=new Sub();
	}
}

/*
class Sup
{
	Sup()
	{
		System.out.println("Superclass");
	}
}
class Sub extends Sup
{
	Sub()
	{
		System.out.println("SubClass");
	}
}
class Super
{
	public static void main(String[] args)
	{
		Sub obj1=new Sub();
	}
}
*/