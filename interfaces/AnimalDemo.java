package interfaces;

public class AnimalDemo 
{
	public static void main(String args[])
	{
		//Animal a=new Animal();
		
		Animal a=new Dog();
		a.eat();
		a.sleep();
		a.run();
		Animal.sound();
		System.out.println("=============");
		
		Animal a1=new Cat();//upcasting
		a1.eat();
		a1.sleep();
		a1.run();
	}

}
