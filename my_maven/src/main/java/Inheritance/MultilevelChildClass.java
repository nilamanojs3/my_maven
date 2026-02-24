package Inheritance;

public class MultilevelChildClass extends MultilevelParentClass 
{
	String s="Welcome";
	
	public void mul()
	{
		int c=6;
		int d=5;
		System.out.println(c*d);
	}

	public static void main(String[] args) 
	{
		MultilevelChildClass ob=new MultilevelChildClass ();
		ob.mul();
		System.out.println(ob.s);
		ob.display();
		ob.sub();
		

	}

}
