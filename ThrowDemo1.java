class ThrowDemo1
{
	static void show()
	{
		
		   throw new NullPointerException("demoexception");
	}
	public static void main(String[] args)
	{
		try
		{
			show();
		}
		catch(NullPointerException e)
		{
			System.out.println("caught in main"+e);
		}
	}
}
