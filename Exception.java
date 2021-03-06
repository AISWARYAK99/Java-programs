class Exception
{
	public static void main(String[] args)
	{
		int d=0;//works normal if d=1
		int a=0;
		int b=100;
		//a=b/d;//generates run time error
		try
		{
			a=b/d;
		}
		catch(ArithmeticException c)
		{
			System.out.println("Divide by zero error");
		}
		System.out.println("Code Execution");
	}
}