//Final keyword to prevent method overriding
class A
{
	final void show()
	{
		System.out.println("method of superclass");
	}
}
class B extends A
{
	//void show()//Illegal no overriding of final method allowed
	//{
	//	System.out.println("method of superclass");
	//}
}
class Final2
{
	public static void main(String[] args)
	{
		B obj1=new B();
		obj1.show();
	}
}