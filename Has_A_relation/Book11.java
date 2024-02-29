package Has_A_relation;

public class Book11
{
	private String book_name;//r/w
	private int book_id;//r
	private double price; //r
	
	Book11(String book_name,int book_id,double price)
	{
		this.book_name=book_name;
		this.book_id=book_id;
		this.price=price;
	}
	
	public String getName()
	{
		return book_name;
	}
		
	public void setName(String book_name)
	{
		this.book_name=book_name;
	}
	
	public int getBookId()
	{
		return book_id;
	}
	
	public double getPrice()
	{
		return price;
	}
		

	}



