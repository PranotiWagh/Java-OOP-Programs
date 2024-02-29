package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDemo
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fin=new FileInputStream("C:\\\\Filedemo\\\\Example1.txt");
			try
			{
				int ch=fin.read();
				while(ch!=-1)
				{
					System.out.println((char)ch);
					ch=fin.read();
				}
			}
			catch(IOException e)
			{
				System.out.println("exception handled");
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("path not found");
		}
	}

}
