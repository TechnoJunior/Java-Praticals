//6.2 WAP to copy multiple file in one single file
import java.io.*;
class file2
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream f1=new FileInputStream("1.txt");
		FileInputStream f2=new FileInputStream("2.txt");
		FileOutputStream fout=new FileOutputStream("3.txt");
		SequenceInputStream sis=new SequenceInputStream(f1,f2);
		int i;
		while((i=sis.read())!=-1)
		{
			fout.write(i);
		}
		System.out.println("Copied!!!!!!");
		f1.close(); 
		f2.close();
		fout.close();
		sis.close();
	}
}