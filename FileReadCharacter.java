import java.io.*;
public class FileReadCharacter
{
	public static void main(String[] args)throws IOException
	{
		FileReader f=new FileReader("pgm.txt");
		int i;
		while((i=f.read())!=-1)
		{
		System.out.print((char)i);
		}
		f.close();
	}
}