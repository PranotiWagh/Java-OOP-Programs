package Has_A_relation;
import java.util.Scanner;

public class Basket 
{
		String  basket_color;
		Ball ba;
		Basket(String basket_color)
		{
		this.basket_color=basket_color;
		}
		public void addBall(Ball ba)//helper method
		{
			if(this.ba!=null)
			{
				System.out.println("Ball is in the basket");
			}
				else
			{
				this.ba=ba;
				System.out.println("Ball added successfully");				}
			}
			public void removeBall()
			{
				if(ba!=null)
				{
					ba=null;
					System.out.println("Ball removed !!");
				}
				else
				{
					System.out.println("Ball not found");
				}
			}
			public void updateBallName()
			{
				if(ba!=null)
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter ball new name that you want to update!!");
					String new_name=sc.next();
					ba.setName(new_name);
					System.out.println("Name updated Successfully");
					System.out.println("The updated name is"+ba.getName());
				}
				else
				{
					System.out.println("Book name not found");
				}
			}
			public void displayBallDetails()
			{
				if(ba!=null)
				{
					System.out.println("=======Ball details=======");
					System.out.println("Name of ball is "+ba.getName());
					System.out.println("ball color is is"+ba.getBallColor());
					System.out.println("Radius of ball is"+ba.getBallRadius());
				}
				else
				{
					System.out.println("Ball not found!!!!");
				}
			}
	}

