
public class ParmenentEmployee extends Employee
{
	String comp_name;
	
	ParmenentEmployee(int emp_no,String ename,int age,String comp_name)
	{
		super(emp_no,ename,age);
		this.comp_name=comp_name;
	}
	public void EmployeeDetails(a)
	{
		System.out.println("---------Parment Employee Details-------");
		System.out.println("Employee no="+emp_no);
		System.out.println("Employee Name"+ename);
		System.out.println("Company Name"+comp_name);
	}


}
