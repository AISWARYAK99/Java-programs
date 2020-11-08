import java.io.*;
class FileWrieByte
{
	public static void main(String[] args)throws IOException
	{
		FileOutputStream f=new FileOutputStream("pgm1.txt");
		String s="Aiswarya Byte Stream Writer";
		byte[] b1=s.getBytes();
		f.write(b1);
		f.close();
	}
}