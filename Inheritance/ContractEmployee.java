
public class ContractEmployee extends Employee 
{
	String agency;
	ContractEmployee(int emp_no,String ename,int age,String comp_name)
	{
		super(emp_no,ename,age);
		this.agency=agency;
	}
	public void EmployeeDetails()
	{
		System.out.println("--------- Contract Employee Details-------");
		System.out.println("Employee no="+emp_no);
		System.out.println("Name of employee"+ename);
		System.out.println("Age of employee"+age);
		System.out.println("Agency name"+agency);
	}


}
