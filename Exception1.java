class Exception1
{
	public static void main(String[] args)
	{
		int d=0;//works normal if d=1
		int a=0;
		int f=1;
		//a=b/d;//generates run time error
		try
		{
			a=40/d;
			System.out.println("Not printed");
		}
		catch(ArithmeticException c)
		{
			System.out.println("Divide by zero error");
			System.out.println(c);
		}
		System.out.println("Code Execution");
	}
}