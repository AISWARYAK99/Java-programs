import java.util.Scanner;

class prime
{
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=S.nextInt();
		if(isprime(n))
		    {
			System.out.println( n + " is a prime number");
		    }
		else
		    {
			System.out.println( n + " is not a prime");
		    }
	}







	public static boolean isprime(int n)
	{
		if(n<=1)
		{
		   return false;
		} 
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i == 0)
			
			    return false;
		}
	        return true;
		
	}

}