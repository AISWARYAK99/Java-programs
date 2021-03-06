interface printable
{
	public void print();
}
interface printable1
{
	public void print1();
}
class Mammal implements printable,printable1//multiple implementation
{
	public void print()
	{
		System.out.println("Mammal Eat");
	}
	public void print1()
	{
		System.out.println("Mammal Travel");
	}
}
class Interface2
{
	public static void main(String[] args)
	{
		Mammal obj1=new Mammal();
		obj1.print();
		obj1.print1();
	}
}