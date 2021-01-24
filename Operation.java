class Add
{
  int a;
  int b;
  public Add(int x,int y)
  {
	a=x;
	b=y;
  }
  public void Adding()
  {
	int sum=a+b;
	System.out.println("The sum is : "+sum);
  }		

}
class Sub
{
  int a;
  int b;
  public Sub(int x,int y)
  {
	a=x;
	b=y;
  }
  public void Subtract()
  {
	int s=a-b;
	System.out.println("The Subtracted value  is : "+s);
  }	
}
class Mul
{
  int a;
  int b;
  public Mul(int x,int y)
  {
	a=x;
	b=y;
  }
  public void Multiply()
  {
	int m=a*b;
	System.out.println("The Product  is : "+m);
  }
}
class Div
{
  float a;
  float b;
  public Div(int x,int y)
  {
	a=x;
	b=y;
  }
  public void Division()
  {
	float d=a/b;
	System.out.println("The answer  is : "+d);
  }
}	
class Operation 
{	
	public static void main(String[] args)
	{
		Add obj1=new Add(5,10);
		obj1.Adding();
		Sub obj2=new Sub(10,6);
		obj2.Subtract();
		Mul obj3=new Mul(7,90);
		obj3.Multiply();
		Div obj4=new Div(100,5);
		obj4.Division();
	}
}

