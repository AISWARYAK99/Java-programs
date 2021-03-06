interface Inter
{
	default void newmethod()
	{
		System.out.println("default method");
	}
	static void anothermeth()
	{
		System.out.println("Static method");
	}
	void exmethod(String s);
}
class A implements Inter
{
	public void exmethod(String s)
	{
		System.out.println( "String"+s);
	}
	public void newmethod()
	{	
		Inter.super.newmethod();
		System.out.println("From A");
	}
}
class Interfacev8def
{
	public static void main(String[] args)
	{
		A obj=new A();
		obj.newmethod();//from class A
		obj.exmethod("Hai");
		Inter.anothermeth();
	}
}