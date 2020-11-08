import java.io.*;
class JavaRead
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter a character");
		//int x=ob.read();//reads single value ignores rest others
		//char c =(char)x;
		System.out.println("Enter a number");
		//String x=ob.readLine();instesd of this sentence under one is possible
		int n=Integer.parseInt(ob.readLine());
		n++;
		System.out.print("The String is "+n);
	}
}