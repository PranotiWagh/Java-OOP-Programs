package Has_A_relation;

public class Mobile2Driver
{
	public static void main(String args[])
	{
		Mobile2 m2=new Mobile2("oneplus",123,12345);
		//m2.getSim();
		m2.insertSim(new Sim(123,"airtel"));
		//m2.s.removeSim();
	}
			

}
