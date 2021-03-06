class A
{
	int i=10;
        private int j=90;//if this was private then B cant access that but when we create a method to use that variable
			// and that method is either default/public then we can access total(i+j)through that method.
	int total;
	void sum()
	{
		total=i+j;
		System.out.println(total);
	}
}
class B extends A
{
	int total;
	/*void sum()//this method cant access private member j of class A
	{
		total=i+j;
		System.out.println(total);
	}*/
}
class PrivateMember
{
	public static void main(String[] args)
	{
		B obj1=new B();
		obj1.sum();// we can access sum in class A in B through inheritance 
	}
}
	