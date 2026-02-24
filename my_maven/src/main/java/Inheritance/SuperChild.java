package Inheritance;

public class SuperChild extends SuperParent
{
	public void print()
	
	{  
		super.display();//super keyword to refer parent class method
		System.out.println(super.s);//super keyword to reference parent class instance variable
		System.out.println("Child Class");
	}
	
	public SuperChild()
	{
		super();//super keyword to refer the constructor of parent class
		System.out.println("Child Class Constructor");
		
	}

	public static void main(String[] args) 
	{
		SuperChild ob=new SuperChild();
		ob.print();
		//ob.display();
		

	}

}
