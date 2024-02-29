package Has_A_relation;

public class MobileDriver {
	public static void main(String args[])
	{
		Mobile m=new Mobile("oneplus","black",12345);
		System.out.println(m.brand);
		m.mobileDetails();
		m.insertSim(new Sim("airtel",1234,"red"));
		m.s.simDetails();
		m.removeSim();
	}

}
