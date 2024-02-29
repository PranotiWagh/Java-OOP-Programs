package Inheritance;

public class WhatsAppDriver 
{
	public static void main(String args[])
	{
		WhatsAppV4 v4=new WhatsAppV4();
		v4.send();
		v4.vedio();
		v4.payment();
		WhatsAppV3 v3=new WhatsAppV3();
		v3.send();
		v3.audio();
		v3.vedio();
//		v3.payment();  CTE
		
		WhatsAppV2 v2=new WhatsAppV2();
		v2.send();
		v2.audio();
		//v2.vedio;  CTE
		//v2.payment() CTE
		
		WhatsAppV1 v1=new WhatsAppV1();
		v1.send();
	}
		
}
