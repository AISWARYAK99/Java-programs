class Cmplxnum
{
	int r,i;
	Cmplxnum(int a,int b)
	{
		r=a;
		i=b;
	}
	
	public static Cmplxnum add(Cmplxnum c1,Cmplxnum c2)
	{
		Cmplxnum temp=new Cmplxnum(0,0);
		temp.r=c1.r+c2.r;
		temp.i=c1.i+c2.i;
		return temp;
	}
	public static void main(String[] args)
	{
		Cmplxnum ob1=new Cmplxnum(12,8);
		Cmplxnum ob2=new Cmplxnum(88,6);
		Cmplxnum temp=Cmplxnum.add(ob1,ob2);
		System.out.println("Sum is "+temp.r+"+"+temp.i+"i");
	}
}