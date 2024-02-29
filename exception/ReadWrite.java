package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWrite 
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr=new FileReader("C:\\Filedemo\\Example1.txt");
		BufferedReader br=new BufferedReader(fr);
		
		FileOutputStream fos=new FileOutputStream("C:\\Filedemo\\Example2.txt");
		PrintWriter pw=new PrintWriter(fos);
		String str=br.readLine();
		while(str !=null)
		{
			pw.println(str);
			str=br.readLine();
		}
		pw.flush();
		System.out.println("data written");
		
		
	}

}
