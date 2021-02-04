/*class Inh
{
	public static void main(String[] args)
	{
		B ob=new B();
		System.out.println(ob.x+" "+ob.y);//class B accessing member of class A
	}
	
}
class A
{
	int x=10;
}
class B extends A
{
	int y=20;
}
//Output:10 20


class Inh
{
	public static void main(String[] args)
	{
		B ob=new B();
		System.out.println(ob.x+" "+ob.y);//class B cant access private member of class A
	}
	
}
class A
{
	private int x=10;
}
class B extends A
{
	int y=20;
}
// error: x has private access in A System.out.println(ob.x+" "+ob.y);compilation failed

class Inh
{
	public static void main(String[] args)
	{
		B ob=new B();
		ob.print();
	}
	
}
class A
{
	private int x=10;
}
class B extends A
{
	int y=20;
	void print()
	{
		System.out.println(x+ " " +y);class B cant access private member of class A
	}
}
//Output: error: x has private access in A   System.out.println(x+ " " +y); error: compilation failed


class Inh
{
	public static void main(String[] args)
	{
		B ob=new B();
		ob.print();
	}
	
}
class A
{
	int x=10;
}
class B extends A
{
	int x=20;
	void print()
	{
		System.out.println(x);//x of class B
		System.out.println(super.x);//x of class A
	}
}
//Output:20 10

class Inh
{
	public static void main(String[] args)
	{
		B ob=new B();
		ob.print();
	}
	
}
class A
{
	int x=10;
	void print()
	{
		System.out.println(x);
	}
}
class B extends A
{
	int x=20;
	void print()
	{
		super.print();
		System.out.println(x);//x of class B
	}
}
//Output:10 20

class Inh
{
	public static void main(String[] args)
	{
		B ob=new B();
		ob.print();
	}
	
}
class A
{
	int x;
	A()
	{
		x=10;
	}
	
}
class B extends A
{
	int y;
	B()
	{
		y=20;
	}
	void print()
	{
		System.out.println(x+" "+y);
	}
}
//Output:10 20


class Inh
{
	public static void main(String[] args)
	{
		B ob=new B();
		ob.print();
	}
	
}
class A
{
	int x;
	A()
	{
		x=10;
	}
	A(int xx)
	{
		x=xx;
	}
}
class B extends A
{
	int y;
	B()
	{
		super(30);
		y=20;
	}
	void print()
	{
		System.out.println(x+" "+y);
	}
}
//Output:30 20

class Inh
{
	public static void main(String[] args)
	{
		B ob=new B();
		ob.print();
	}
	
}
class A
{
	int x;
	A()
	{
		x=10;//though we are not creating A's object its constructor is also invoked automatically from subclass
	}
	A(int xx)
	{
		x=xx;
	}
}
class B extends A
{
	int y;
	B()
	{
		y=20;//when object of class B is created this constructor is invoked.The constructor of super class(A) is invoked from subclass.
	}
	void print()
	{
		System.out.println(x+" "+y);
	}
}
//Output:10 20

class Inh
{
	public static void main(String[] args)
	{
		B ob=new B();
		ob.print();
	}
	
}
class A
{
	int x;
	A()
	{
		x=10;// constructor is also invoked from subclass due to super() method.
	}
	A(int xx)
	{
		x=xx;
	}
}
class B extends A
{
	int y;
	B()
	{
		super();//no need to do this the constructor of super class(A) is invoked automatically from subclass.
		y=20;//when object of class B is created this constructor is invoked.The constructor of super class(A) is invoked from subclass.
	}
	void print()
	{
		System.out.println(x+" "+y);
	}
}
//Output:10 20
*/
class Parent
{
	void display()
	{
		System.out.println("Parent Class");
		display();
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("Child Class");
		super.display();
	}
}
public class Inh
{
	public static void main(String[] args)
	{
		Child ob=new Child();
		ob.display();
	}
}
//Output:Infinite... Child class Parent Class Child Class Parent Class....	
