/*class Construct1
{
	public static void main(String[] args)
	{
		Test t1=new Test(10);
		t1.print();
	}
}
class Test
{
	int x,y;
	Test(int xx)
	{
		x=xx;
	}
	void print()
	{
		System.out.println(x+y);//default value of y will be 0 since initialised through a default constructor.
	}
}
//Output:10

class Construct1
{
	public static void main(String[] args)
	{
		Test t1=new Test(50);
		t1.print();
	}
}
class Test
{
	int x=20,y=30;
	Test(int xx)
	{
		x=xx;
	}
	void print()
	{
		System.out.println(x+y);//x takes value from constructor
	}
}
//Output:80

class Construct1
{
	public static void main(String[] args)
	{
		Test t1=new Test(30);
		t1.print();
	}
}
class Test
{
	int x=10,y=20;
	Test()
	{
		y=40;
	}
	Test(int xx)
	{	
		this();//calling default constructor
			//default constructor should always be called first in the constructor
		x=xx;
	}
	void print()
	{
		System.out.println(x+y);
	}
}
//Output:70

class Construct1
{
	public static void main(String[] args)
	{
		Test t1=new Test(10);
		t1.print();
	}
}
class Test
{
	int x=10,y=20;
	Test()
	{
		this();//recursive calling 
		y=40;
	}
	Test(int xx)
	{
		this();
		x=xx;
	}
	void print()
	{
		System.out.println(x+y);//
	}
}
//Output: error: recursive constructor invocation Test() error: compilation failed


class Construct1
{
	public static void main(String[] args)
	{
		Test t1=new Test();
		t1.print();
	}
}
class Test
{
	int x=10,y=20;
	Test()
	{
		this(50);//construct calling should be done first if needed if it is called after first stmt causes error
		y=40;
	}
	Test(int xx)
	{
		x=xx;
	}
	void print()
	{
		System.out.println(x+y);
	}
}
//Output:90

class Construct1
{
	public static void main(String[] args)
	{
		Test t1=new Test();
		t1.print();
	}
}
class Test
{
	int x=10,y=20;
	Test()
	{
		this(50);
		y=40;
	}
	Test(int xx)
	{
		this();
		x=xx;
	}
	void print()
	{
		System.out.println(x+y);
	}
}
//Output:error: recursive constructor invocation Test(int xx) error: compilation failed

class Construct1
{
	public static void main(String[] args)
	{
		Test t1=new Test(10);
		t1.print();
	}
}
class Test
{
	int x;
	Test(int x)
	{
		x=x;//here x inside the fun is initialised not the class variable x 
	}
	void print()
	{
		System.out.println(x);//default value of x will be 0 since initialised through a default constructor.
	}
}
//Output:0

class Construct1
{
	public static void main(String[] args)
	{
		Test t1=new Test(10);
		t1.print();
	}
}
class Test
{
	int x;
	Test(int x)
	{
		this.x=x;//invoking class variable using this keyword 
	}
	void print()
	{
		System.out.println(x);
	}
}
//Output:10
*/
class Construct1
{
	public static void main(String[] args)
	{
		Test t1=new Test();
		t1.read(10,20);
		t1.print();
	}
}
class Test
{
	int x,y;
	void read(int xx,int yy)
	{
		x=xx;
		read(yy);
	}
	void read(int yyy)
	{
		y=yyy;
	}
	void print()
	{
		System.out.println(x+y);
	}
}
//Output:30