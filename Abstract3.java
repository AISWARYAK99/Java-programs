abstract class Figure
{
	double d1;
	double d2;
	Figure(double a,double b)
	{
		d1=a;
		d2=b;
	}

	abstract double area();
}
class Rectangle extends Figure
{
	Rectangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Rectangle Area");
		return d1*d2;
	}
}
class Abstract3
{
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle(5,9);
		Figure fig;//super class object reference
		fig=r;//it refers to object of rectangle
		System.out.println("Area is "+fig.area());
	}
}
		