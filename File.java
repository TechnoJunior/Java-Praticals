//6.3 WAP to to read write and copy one file to another file

import java.util.*;
import java.io.*;

class writefile
{
	public static void main(String args[]) throws IOException
	{
		String op;
		do
		{
			Scanner ob=new Scanner(System.in);
			System.out.println("Seelct an option\n1.Read\n2.Write\n3.Copy");
			int ch=ob.nextInt();
			
			switch(ch)
			{
				case 1:
					Scanner obj=new Scanner(System.in);
					System.out.println("Enter File Name : ");
					String name=obj.nextLine();
					FileInputStream finn=new FileInputStream(name);
					int i=0;
					while((i=finn.read())!=-1)
					{
						System.out.print((char)i);
						
					}
					finn.close();
				break;
				case 2:
					Scanner obj1=new Scanner(System.in);
					System.out.println("Enter new file name ");
					String name1=obj1.nextLine();
					FileOutputStream fout = new FileOutputStream(name1);
					System.out.println("Write something : ");
					String a=obj1.nextLine();
					byte c[]=a.getBytes();
					fout.write(c);
					fout.close();
				break;

				case 3:
				FileInputStream fin=new FileInputStream("abc.txt");
				FileOutputStream fcopy=new FileOutputStream("def.txt");
				int z=0;
				while((z=fin.read())!=-1)
				{
					fcopy.write((byte)z);
					
				}
				fin.close();
				fcopy.close();
				break;
				default:
					System.out.println("Invalid Option");
					break;


				/*String s ="Welcome to Java IO package program";
				byte b[]=s.getBytes();
				fout.write(b);*/
				//fout.close();
				//fin.close();
				//fcopy.close();
			}
			System.out.println("Do you want to continue : ");
			op=ob.nextLine();
		}while(op="y" || op='y');
	}
}