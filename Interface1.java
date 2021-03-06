interface Animal
{
	public void eat();
	public void travel();
}
class Mammal implements Animal
{
	public void eat()
	{
		System.out.println("Mammal Eat");
	}
	public void travel()
	{
		System.out.println("Mammal Travel");
	}
}
class Interface1
{
	public static void main(String[] args)
	{
		Mammal obj1=new Mammal();
		obj1.eat();
		obj1.travel();
	}
}