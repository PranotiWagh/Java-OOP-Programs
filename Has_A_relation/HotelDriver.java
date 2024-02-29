package Has_A_relation;

import java.util.Scanner;
public class HotelDriver
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter hotel name");
		String hname=sc.next();
		System.out.println("enter hotel cno");
		long hno=sc.nextLong();
		System.out.println("enter hotel address");
		String address=sc.next();
		Hotel h= new Hotel(hname,address,hno);
		System.out.println("=======Hotel Details=========");
		System.out.println(h.hname);
		System.out.println(h.hno);
		System.out.println(h.address);
		
		System.out.println("========Swigy customer details==========");
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your cno");
		long cno=sc.nextLong();
		System.out.println("enter your address");
		String address1=sc.next();
		
		h.connection(new Swigy(name,address1,cno));
		
		System.out.println("=======Swigy customer Details=========");
		//System.out.println(h.s.name);
		System.out.println(h.s.cno);
		//System.out.println(h.s.address1);
		
		
	}

}
