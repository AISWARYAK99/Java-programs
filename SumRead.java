import java.util.Scanner;
class AdditionClass
{
     int s1;
     int s2;
     
    
     public AdditionClass()
     {
        Scanner S=new Scanner(System.in);
	System.out.println("Enter the first number");
	s1=S.nextInt();
	System.out.println("Enter the second number");
        s2=S.nextInt();
     }
      public int Sum()
     {
	int sum=s1+s2;
	return sum;
     }
}
class SumRead
{
	public static void main(String[] args)
	{
		
			
		AdditionClass obj1=new AdditionClass();
		
		System.out.println("The 2 numbers are :");
		
		System.out.println(obj1.s1+" "+obj1.s2);
		System.out.println("The sum is:");
		System.out.println(obj1.Sum());
	}
}
