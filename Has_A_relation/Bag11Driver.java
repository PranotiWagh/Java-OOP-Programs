package Has_A_relation;

import java.util.Scanner;

public class Bag11Driver
{
	   public static void main(String[] args) 
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter bag name");
		   String bag_name=sc.next();
		   Bag11 bg=new Bag11(bag_name);
		   boolean exit=true;
		   while(exit) 
		   {
			   System.out.println("Enter your choice");
			   System.out.println("1.Add Book \n 2.Remove Book\n 3.Update Book\n 4.Book Deatils\n 5.Exit");
			   int choice=sc.nextInt();
			   switch(choice)
			   {
			   		case 1:
			   		{
						System.out.println("Enter Book name");
						String book_name=sc.next();
						System.out.println("Enter Book id");
						int book_id=sc.nextInt();
						System.out.println("Enter Book price");
						double price=sc.nextDouble();
						bg.addBook(new Book11(book_name,book_id,price));
					}
					break;
					case 2:
					{
						bg.removeBook();
					}
					break;
					case 3:
					{
						bg.updateBook();
					}
					break;
					case 4:
					{
						bg.displayBookDetails();
					}
					break;
					case 5:
					{
						exit=false;
					}
					break;
					default:
					{
						System.out.println("Invalid choice!!");
					}
				}	
			}	
		}
}
