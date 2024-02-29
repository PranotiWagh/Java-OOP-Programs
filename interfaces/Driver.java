package interfaces;

public class Driver 
{

	public static void main(String[] args)
	{
		I1.n=new ChildClass();
		n.m1();//implementation given by m1() of I1
		
		I2 im=new ChildClass();
		im.m1();// implementation given by m1() of I2
		
	}

}
