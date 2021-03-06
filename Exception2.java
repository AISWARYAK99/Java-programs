class Exception2//Multiple Exceptions
{
	public static void main(String[] args)
	{
		try
		{
			int n=args.length;
			System.out.println("No of command line arguments is: "+n);
			int b=10/n;
			int a[]={100};//array size here is 1
			a[n]=200;
		}
		catch(ArithmeticException c)
		{
			System.out.println("Divide by zero error");
		}
		catch(ArrayIndexOutOfBoundsException c)
		{
			System.out.println("Array Index Out Of  Bound Exception");
		}
		System.out.println("After try catch blocks");
	}
}
