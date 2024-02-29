package Has_A_relation;
import java.util.Scanner;

public class BasketDriver 
{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter basket color");
			String basket_color=sc.next();
			Basket b=new Basket(basket_color);
			boolean exit=true;
			while(exit) 
			   {
				   System.out.println("Enter your choice");
				   System.out.println("1.Add Ball \n 2.Remove Ball\n 3.Update Ball\n 4.Ball Deatils\n 5.Exit");
				   int choice=sc.nextInt();
				   switch(choice)
				   {
				   		case 1:
				   		{
							System.out.println("Enter Ball name");
							String ball_name=sc.next();
							System.out.println("Enter ball color");
							String ball_color=sc.next();
							System.out.println("Enter Ball radius");
							double ball_radius=sc.nextDouble();
							b.addBall(new Ball(ball_name,ball_color,ball_radius));
						}
						break;
						case 2:
						{
							b.removeBall();
						}
						break;
						case 3:
						{
							b.removeBall();
						}
						break;
						case 4:
						{
							b.displayBallDetails();
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



