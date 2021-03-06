interface Add
{
	void Add(int a,int b);
	
}
interface Sub
{
	void Sub(int a,int b);
}
interface Mul
{
	void Mul(float a,float b);
}
interface Div
{
	void Div(float a,float b);
}
class ArithmeticClass implements Add,Sub,Mul,Div
{
	public void Add(int a,int b)
	{
		System.out.println("Sum is "+(a+b));
	}
	public void Sub(int a,int b)
	{
		System.out.println("Difference is "+(a-b));
	}
	public void Mul(float a,float b)
	{
		System.out.println("Product is "+(a*b));
	}
	public void Div(float a,float b)
	{
		System.out.println("Division is "+(a/b));
	}
}
class Interfaceass
{
	public static void main(String[] args)
	{
		ArithmeticClass obj1=new ArithmeticClass();
		obj1.Add(20,10);
		obj1.Sub(20,10);
		obj1.Mul(20,10);
		obj1.Div(20,10);
	}
}