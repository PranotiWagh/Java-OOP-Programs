package Has_A_relation;

public class CollegeDriver
{
	public static void main(String args[])
	{
	College c=new College("ABC",123);
	System.out.print(c.cid);
	System.out.println(c.cname);
	System.out.println(c.s.name);
	System.out.println(c.s.id);
	c.collegeDetails();
	}

}
