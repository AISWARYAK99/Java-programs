class Arraylarg
{
	public static void main(String arg[])
	{
		int[] a={7,9,5,3,8,2};
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]);
			if(a[0]<a[i])
				a[0]=a[i];
		
		}
		System.out.println(a[0]);
		System.out.println(len);
	
	}
}