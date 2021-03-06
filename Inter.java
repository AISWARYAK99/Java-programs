interface A
{
	int a=10;//same as we declare final int a=10
}
class B implements A
{
	public void print()//method should be declared public since all methods of interfaces have public visibility
	{
		System.out.println(a);
			//a=a+10;cant do this since a is considered as a final var it cant be changed
	}
}
class Inter
{
	public static void main(String[] args)
	{
		B obj1=new B();
		obj1.print();
	}
}