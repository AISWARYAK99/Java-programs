import java.io.*;
class FileWriteCharacter
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String");
		String s1=b.readLine();
		FileWriter f=new FileWriter("pgm3.txt");
		//String s1="Hai its me Aiswarya";
		f.write(s1);
		f.close();
	}
}