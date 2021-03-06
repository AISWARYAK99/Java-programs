interface A
{
	void read();
}
interface B extends A
{
	void print();
}
class D
{
	void display()
	{
		System.out.println("Display function");
	}
}
class C extends D implements B
{
	public void read()//error if we doesnt give public since interface methods are public in default
	{
		System.out.println("Reading function");
	}
	public void print()//error if we doesnt give public since interface methods are public in default
	{
		System.out.println("Printing function");
	}
}
class InterInter
{
	public static void main(String[] args)
	{
		C obj=new C();
		obj.read();
		obj.print();
		obj.display();
	}
}