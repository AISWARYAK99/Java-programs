class ArraySmall
{
	public static void main(String arg[])
	{
		int[] a={7,9,5,3,8,2};
		int len=a.length;
		int small=a[0];
		System.out.println("The array elements are :");
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
			if(a[i]<small)
			    small=a[i];
		
		}
		System.out.println();
		System.out.println("The smallest element of the given array is : "+small);
	
	}
}