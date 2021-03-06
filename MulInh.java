class A
{
	int i;
	A()
	{
		System.out.println("Superclass");
	}
}
class B extends A
{
	int j;
	B()
	{
		System.out.println("Subclass B");
	}
}
class C extends B
{
	C()
	{
		System.out.println("Subclass c");
	}
}
class MulInh
{
	public static void main(String[] args)
	{
		C obj1=new C();
	}
}
//Output: Superclass
//	subclass B
//	subclass c