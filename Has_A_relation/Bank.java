package Has_A_relation;

public class Bank 
{
	String bank_name;
	String bank_manager_name;
	String branch;
	String bank_head_office;
	
    Bank(String bank_name, String bank_manager_name, String branch,String bank_head_office)
   
    {
    	this.bank_name=bank_name;
    	this.bank_manager_name=bank_manager_name;
    	this.branch=branch;
    	this.bank_head_office=bank_head_office;
    			
    }
	
	
	public String getUserName()
	{
		return bank_name;
	}
	public String setBankManagerName()
	{
		return bank_manager_name;
	}
	public void getBankManagerName(String bank_manager_name)
	{
		this.bank_manager_name=bank_manager_name;
	}
	public String setbranch()
	{
		return branch;
	}
	public void getBranch(String branch)
	{
		this.branch=branch;
	}
	public String setBankHeadOffice()
	{
		return bank_head_office;
	}
	
	public void printData()
	{
		System.out.println("bank name"+bank_name);
		System.out.println("bank anager name"+bank_manager_name);
		System.out.println("branch"+branch);
		System.out.println("bank head office"+bank_head_office);
	}

}
