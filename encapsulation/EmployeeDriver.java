package encapsulation;
import java.util.Scanner;
public class EmployeeDriver {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter emp id");
		int emp_id=sc.nextInt();
		System.out.println("enter emp name");
		String emp_name=sc.next();
		System.out.println("enter emp age");
		int emp_age=sc.nextInt();
		System.out.println("enter emp salary");
		double emp_salary=sc.nextDouble();
		
		Employee e =new Employee(emp_id,emp_name,emp_age,emp_salary);
		//System.out.println(e.getEmpId);
		//System.out.println(e.getEmpname);
		e.setAge(34);
		// TODO Auto-generated method stub

	}

}
