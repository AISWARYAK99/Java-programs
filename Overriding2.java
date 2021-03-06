class A
{
	int i,j;
	A(int a,int b)
	{
		j=a;
		i=b;
	}
	void show()
	{
		System.out.println(i+" "+j);
	}
}
class B extends A
{
	int k;
	B(int a,int b,int c)
	{
		super(a,b);
		k=c;
	}
	void show()
	{
		super.show();
		System.out.println(k);
	}
}
class Overriding2
{
	public static void main(String[] args)
	{
		B obj1=new B(10,20,30);
		obj1.show();
	}
}
//Output:20 10
//	30	