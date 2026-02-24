package Inheritance;

public class MultilevelAssignmentManagerClass extends MultilevelAssignmentEmployeeClass
{
	String s="Manager class  instance variable";
	public void displaymanager()
	{
		String d="department- IT";
		System.out.println(d);
	}

	public static void main(String[] args) 
	{
		MultilevelAssignmentManagerClass  ob=new  MultilevelAssignmentManagerClass ();
		ob.displaymanager();
		System.out.println(ob.s);
		ob.displayemployee();
		ob.displayperson();
		

	}

}
