import java.io.*;
class FileReadByte
{
	public static void main(String[] args)throws IOException
	{
		FileInputStream f=new FileInputStream("pgm.txt");
		int i;
		while((i=f.read())!=-1)
		{
		System.out.print((char)i);
		}
		f.close();
	}
}