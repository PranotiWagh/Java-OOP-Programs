package Has_A_relation;

public class Hotel
{
	String hname;
	String address;
	long hno;
	Swigy s;
	Hotel(String hname,String address,long hno)
	{
		this.hname=hname;
		this.address=address;
		this.hno=hno;
	}
	


	public void connection(Swigy s)//helper method
	{
		this.s=s;
	}
}
