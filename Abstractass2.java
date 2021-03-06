abstract class Marks
{
	abstract float getPercentage();
}	
class A extends Marks
{
	float m1;
	float m2;
	float m3;
	A(float x,float y,float z)
	{
		m1=x;
		m2=y;
		m3=z;
	}
	float getPercentage()
	{
		int total=300;
		float sum=m1+m2+m3;
		float percent=(sum/total)*100;
		return percent;
	}	
}
class B extends Marks
{
	float m1;
	float m2;
	float m3;
	float m4;
	B(int x,int y,int z,int w)
	{
		m1=x;
		m2=y;
		m3=z;
		m4=w;
	}
	float getPercentage()
	{
		int total=400;
		float sum=m1+m2+m3+m4;
		float percent=(sum/total)*100;
		return percent;
	
	}
}


class Abstractass2
{
	public static void main(String[] args)
	{
		A obj1=new A(80,95,70);
		System.out.println("Percentage of student A "+obj1.getPercentage());
		B obj2=new B(79,88,99,89);
		System.out.println("Percentage of student B "+obj2.getPercentage());
	}
}