class SimpleInh1
{
	public static void main(String[] args)
	{
		B obj1=new B();
		obj1.i=10;
		obj1.j=80;
		obj1.display();	
		obj1.display1();
		obj1.showij();
	}
}
class A
{
	int i;
	void display()
	{
		System.out.println("Base Class");
	}
}
class B extends A
{
	int j;
	void showij()
	{
		System.out.println("i :"+i+" j :"+j);	
	}
	void display1()
	{
		System.out.println("Derived Class");
	}
}
	