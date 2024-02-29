package encapsulation;

public class Student 
{
	private int id=10; //r
	private String name="pranoti";
	private int marks=35;//r
	int age=23;
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getMarks()
	{
		return marks;
	}
			
}
