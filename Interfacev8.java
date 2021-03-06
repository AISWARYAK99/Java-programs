interface Interface
{
	static void hello()
	{
		System.out.println("Static method of interface");
	}
	void overridingmethod(String s);
}
class A implements Interface
{
	public void overridingmethod(String s)
	{
		System.out.println(s);
	}
	static void hello()//no prbs if we doesnt have this method here
	{
		System.out.println("Static method redefined");
	}
}
class Interfacev8
{
	public static void main(String[] args)
	{
		A obj=new A();
		Interface.hello();
		//A.hello();same as obj.hello()
		obj.hello();
		obj.overridingmethod("Overrided abstract method of interface");
	}
}