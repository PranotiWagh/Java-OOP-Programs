package encapsulation;

public class Employee 
{
	private int emp_id;
	private String emp_name;
	private int emp_age;
	private double emp_salary;
	Employee(int emp_id,String emp_name,int emp_age,double emp_salary)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_age=emp_age;
		this.emp_salary=emp_salary;
	}
	public int getEmpI()
	 {
		return emp_id;
	 }
	public String getEmpName()
	{
		return emp_name;
	}
	public void setName(String emp_name)
	{
		this.emp_name=emp_name;
	}
	public void setAge(int emp_age)
	{
		this.emp_age=emp_age;
	}
	public double getSalary()
	{
		return emp_salary;
	}
	
     
}
