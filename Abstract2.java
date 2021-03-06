abstract class A
{
	abstract void callme();
	void callmetoo()
	{
		System.out.println("Concrete method");
	}
}
abstract class B extends A
{
	
}
class C extends B
{

	void callme()
	{
		System.out.println("call me in B");
	}
}


class Abstract2
{
	public static void main(String[] args)
	{
		C obj1=new C();
		obj1.callme();
		obj1.callmetoo();
	}
}