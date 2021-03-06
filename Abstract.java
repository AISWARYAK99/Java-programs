abstract class A
{
	abstract void callme();
	void callmetoo()
	{
		System.out.println("Concrete method");
	}
}
class B extends A
{
	void callme()
	{
		System.out.println("call me in B");
	}
}
class Abstract
{
	public static void main(String[] args)
	{
		B obj1=new B();
		obj1.callme();
		obj1.callmetoo();
	}
}