import java.io.*;
class JavaRead1
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob= new BufferedReader(in);
		
		System.out.println("Enter a number");
		//String x=ob.readLine();instesd of this sentence under one is possible
		int n=Integer.parseInt(ob.readLine());
		n++;
		System.out.print("The number is "+n);
	}
}