package Has_A_relation;

import java.util.Scanner;

public class Bag11 
{
		String  bag_name;
		Book11 b;
		Bag11(String bag_name)
		{
			this.bag_name=bag_name;
		}
		public void addBook(Book11 bk)//helper method
		{
			if(this.b!=null)
			{
				System.out.println("Book already exist");
			}
			else
			{
				this.b=b;
				System.out.println("Book added successfully");
			}
		}
		public void removeBook()
		{
			if(b!=null)
			{
				b=null;
				System.out.println("Book removed !!");
			}
			else
			{
				System.out.println("Book not found");
			}
		}
		public void updateBook()
		{
			if(b!=null)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter book new name that you want to update!!");
				String new_name=sc.next();
				b.setName(new_name);
				System.out.println("Name updated Successfully");
				System.out.println("The updated name is"+bk.getName());
			}
			else
			{
				System.out.println("Book name not found");
			}
		}
		public void displayBookDetails()
		{
			if(b!=null)
			{
				System.out.println("=======Book details=======");
				System.out.println("Name of book is "+b.getName());
				System.out.println("Id of book is"+b.getBookId());
				System.out.println("Price of book is"+b.getPrice());
			}
			else
			{
				System.out.println("Book not found!!!!");
			}
		}
}



