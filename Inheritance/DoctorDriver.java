package Inheritance;

public class DoctorDriver {

	public static void main(String[] args) 
	{
		Doctor d=new Doctor();
		d.dname="Pranoti";
		d.dlno=1234;
		System.out.println(d.dname);
		Cardiologist c=new Cardiologist();
		c.dname="Seema";
	    System.out.println("c.dname");
	    System.out.println("c.dlo");
	    c.CheckBP();
	    c.CheckPulse();
	    c.byPass();
	    //d.byPass();  CTE

	}

}
