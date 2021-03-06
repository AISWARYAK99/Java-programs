abstract class Parent
{
	abstract void message();
}
class B extends Parent
{
	 void message()
	{
		System.out.println("This is first subclass");
	}
}
class C extends Parent
{
	 void message()
	{
		System.out.println("This is second subclass");
	}
}
class Abstractass1
{
	public static void main(String[] args)
	{
		B obj1=new B();
		obj1.message();
		C obj2=new C();
		obj2.message();
	}
}