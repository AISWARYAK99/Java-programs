class Shift2
{
	public static void main(String[] args)
	{
		int a=2;
		System.out.println(Integer.toBinaryString(a));
		int c=a<<1;
		System.out.println(Integer.toBinaryString(c));
		c=a<<2;
		System.out.println(Integer.toBinaryString(c));

		c=a>>1;
		System.out.println(Integer.toBinaryString(c));
		c=a>>2;
		System.out.println(Integer.toBinaryString(c));
	}
}