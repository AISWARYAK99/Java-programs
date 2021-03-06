import java.io.*;
class Sample
{
	void show()throws IOException
	{
		throw new IOException("Throw IO Error");
	}
}
public class TestThrows
{
	public static void main(String[] args)
	{
		Sample s=new Sample();
		try
		{
			s.show();
		}
		catch(Throwable e)
		{
			System.out.println("Exception handled"+e);
		}
		System.out.println("Normal Flow");
	}
}	