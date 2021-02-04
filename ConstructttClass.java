class MyClass6
{
	int x;
	int y;
	public MyClass6()
	{
		x=10;
		y=20;
	}
	public MyClass6(int n1,int n2)
	{
		x=n1;
		y=n2;
	}
	public MyClass6(int n1)
	{
		x=n1;
		y=60;
	}
	
} 
class ConstructttClass
{
	public static void main(String[] args)
	{
		MyClass6 obj1=new MyClass6();
		MyClass6 obj2=new MyClass6(30,40);
		MyClass6 obj3=new MyClass6(50);	
		System.out.println(obj1.x+" "+obj1.y);
		System.out.println(obj2.x+" "+obj2.y);
		System.out.println(obj3.x+" "+obj3.y);
	}
}