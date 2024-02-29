package encapsulation;

public class StudentDriver
{
	public static void main(String args[])
	{
	Student s=new Student();
	System.out.println(s.getId());//10
	System.out.println(s.getName());//pranoti
	s.setName("Seema");
	System.out.println(s.getName());
	System.out.println(s.getMarks());
	System.out.println(s.age);
	s.age=34;
	System.out.println(s.age);
	}
}
