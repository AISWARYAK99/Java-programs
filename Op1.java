/*class Op1
{
	public static void main(String[] args)
	{
		boolean b=false;
		System.out.println(!b);//prints true
	}
}

class Op2
{
	public static void main(String[] args)
	{
		int b=10;
		System.out.println(!b);//causes error

	}
}
*/
class Op3
{
	public static void main(String[] args)
	{
		String a="hi",b="hi",a1="heey";
		if(a!=b)
			System.out.println("Not Equal");
		else
			System.out.println("Equal");
		if(a==a1)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
									
	}
}

class Op4
{
	public static void main(String[] args)
	{
		int a=11,b=10,c=5;
		if((a>b)&&(a>=c))
			System.out.println(a);		
	}
}

class Op5
{
	public static void main(String[] args)
	{
		int a=11,b=10,large;
		large=a>b ? a:b;
		System.out.println(large);		
	}
}

class Op6
{
	public static void main(String[] args)
	{
		int a=4,b=7;//a=100,b=111 in bin 
		
		System.out.println(a|b);//(here 1or1 then 1or0 then 1or0 so 111 ie 7)	
	}
}

class Op7
{
	public static void main(String[] args)
	{
		int a=4,b=7;//a=100,b=111 in bin 
		
		System.out.println(a&b);//(here 1and1 then 1and0 then 1and0 so 100 ie 4)	
	}
}

class Op8
{
	public static void main(String[] args)
	{
		int a=4;//a is 100
		
		System.out.println(~a);//(here 1or1 then 1or0 then 1or0 so 111 ie 7)	
	}
}