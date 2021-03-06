class A
{
	int i;
}
class B extends A
{
	int i;
	B(int a,int b)
	{
		super.i=a;
		i=b;
	}
	void show()
	{
		System.out.println(i+" i in subclass");
		System.out.println(super.i+ " i in super class");
	}
}
class Overriding
{
	public static void main(String [] args)
	{
		B obj1=new B(1,2);
		obj1.show();
	}
}
//Output: 2 i in subclass
//        1 in superclass