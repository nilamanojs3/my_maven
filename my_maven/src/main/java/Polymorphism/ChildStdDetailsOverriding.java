package Polymorphism;

public class ChildStdDetailsOverriding extends ParentStdDetailsOverriding

{

	public String StudentDetails(String name)
	{
		return name;
	}
	public static void main(String[] args) 
	{
		ChildStdDetailsOverriding ob=new ChildStdDetailsOverriding();
		System.out.println(ob.StudentDetails("John"));
		ParentStdDetailsOverriding ob1=new ParentStdDetailsOverriding();
	    System.out.println(ob1.StudentDetails("Maya"));

	}

}
