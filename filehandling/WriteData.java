package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class WriteData 
{
	public static void main(String args[]) throws FileNotFoundException
	{
		FileOutputStream fos=new FileOutputStream("C:\\Filedemo\\Example1.txt");
		PrintWriter pw=new PrintWriter(fos);
		pw.print("good morning");
		pw.flush();
		System.out.println("data written");
	}

}
