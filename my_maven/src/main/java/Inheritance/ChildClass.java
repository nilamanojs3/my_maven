package Inheritance;

public class ChildClass  extends ParentClass 
{
	
	String s1="Hi";//child class instance variable
	
	public void print()
	{
		System.out.println("CHILD CLASS");//Child class method
	}

	public static void main(String[] args) 
	{
		ChildClass ob=new ChildClass();//childclass obj
		ob.print();//Child class method calling
		ob.add();//parent class method calling

		System.out.println(ob.s);
		System.out.println(ob.s1);
		
		ParentClass ob1=new ParentClass();//parent class obj
		ob1.add();
		System.out.println(ob.s);
		

	}

}
