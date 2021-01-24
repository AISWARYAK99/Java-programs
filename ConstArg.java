import java.util.Scanner;
class ConstArg
{
	public static void main(String[] args)
	{
		float r,b,h;
		int s1,s2;
		System.out.println("Enter radius of circle :");
		Scanner S=new Scanner(System.in);
		r=S.nextFloat();
		
		System.out.println("Enter length of Rectangle :");
		s1=S.nextInt();
		System.out.println("Enter breadth of Rectangle :");
		s2=S.nextInt();

		System.out.println("Enter length of triangle :");
		b=S.nextFloat();
		System.out.println("Enter height of triangle :");
		h=S.nextFloat();

		System.out.println("Area of Circle="+area(r,3.14));
		System.out.println("Area of Rectangle="+area(s1,s2));
		System.out.println("Area of Triangle="+area(b,h));
	}
	public static float area(float a,double pi)
	{
		double ar=pi*a*a;
		float area =(float) ar;
		return area;
	}
	public static int area(int a,int b)
	{
		int ar=a*b;
		return ar;
	}
	public static float area(float b,float h)
	{
		float ar=(b*h)/2;
		return ar;
	}
}
