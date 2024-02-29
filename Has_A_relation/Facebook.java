package Has_A_relation;

public class Facebook
{
	String user_name;
	int user_id;
	int password;
	
	Facebook(String user_name,int user_id,int password)
	{
		this.user_name=user_name;
		this.user_id=user_id;
		this.password=password;
	}

	public String getUserName()
	{
		return user_name;
	}
	public void setUserName(String user_name)
	{
		this.user_name=user_name;
	}
	public int getUserId()
	{
		return user_id;
	}
	public void getPassword()
	{
		this.password=password;
	}
	
}	

