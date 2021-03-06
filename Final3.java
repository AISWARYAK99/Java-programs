final class A
{
	final void show()
	{
		System.out.println("method of superclass");
	}
}
//class B extends A Illegal no inheritance of final class allowed
//{
	//void show() Illegal no overriding of final method allowed
	//{
	//	System.out.println("method of superclass");
	//}
//}
class Final3
{
	public static void main(String[] args)
	{
		A obj1=new A();
		obj1.show();
	}
}