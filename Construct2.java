class MyClass5
{
	int x;
	int y;
	public void read()
	{
		x=10;
		y=20;	
	}
	public void read(int xx)
	{
		x=xx;
		y=30;
	}
	public void read(int xx,int yy)
	{
		x=xx;
		y=yy;
	}
	public void read(float xx,float yy)
	{
		x=xx;
		y=yy;
	}
	public void read(int xx,float yy)
	{
		x=xx;
		y=yy;
	}
	public void read(float xx)
	{
		x=xx;
		y=30;
	}
}
class Construct2
{
	public static void main(String args[])
	{
		MyClass5 obj1=new MyClass5();
		//System.out.println(obj1.x);//this wiil print garbage value
		obj1.read();
		System.out.println(obj1.x);
		System.out.println(obj1.y);

		MyClass5 obj2=new MyClass5();
		//System.out.println(obj2.x);//prints garbage value
		obj2.read(100);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		obj2.read(500,600);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		
	}
}