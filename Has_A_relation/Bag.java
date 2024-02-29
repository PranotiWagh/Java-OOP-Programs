package Has_A_relation;

public class Bag
{
	String bname;
	int bid;
	double price;
	Book b;
	Bag(String bname,int bid,double price)
	{
		this.brand=brand;
		this.bid=bid;
		this.price=price;
	}
	public void addBag(Book b)//helper method
	{
		if(this.e==null)
		{
		this.b=b;
		System.out.println("Congrulations, Book is successfully added in the Bag!!");
		}
		else
		{
			System.out.println("Book is alread inserted in the bag!!");
		}
	}
	public void removeEarphone()
	{
		if(b==null)
		{
			System.out.println("Sorry, book not found in the bag !!!");
		}
		else
		{
			b=null;
			System.out.println("Book removed from bag");
		}
	}	
    public void updateBook()
    {
        System.out.println("Book s updated!!")
    }
	public void BookDetails()
	{
		System.out.println("=======Book details=======");
		System.out.println("Book name is"+b.bname);
		System.out.println("Book id is"+b.bid;
    	System.out.println("book price"+b.price);	
	   
    }
}


