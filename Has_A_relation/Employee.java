package Has_A_relation;

public class Employee 
{
	private String emp_name;//r/w
	private int emp_id;//r
	private long cno; //r
	Employee(String emp_name,int emp_id,long cno)
	{
		this.emp_name=emp_name;
		this.emp_id=emp_id;
		this.cno=cno;
	}
	public String getName()
	{
		return emp_name;
	}
	
	public void setName(String emp_name)
	{
		this.emp_name=emp_name;
	}
	public int getEmpId()
	{
		return emp_id;
	}
	public long getCno()
	{
		return cno;
	}
	

}
