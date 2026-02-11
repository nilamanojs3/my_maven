package Polymorphism;

public class ChildOverride extends ParentOverride
{
	@Override
	public void display()
	{  
		super.display();//calling parent class display method--this is one way of calling parent class method
		System.out.println("Child class Method");//same method as parent class
	}

	public static void main(String[] args)
	{
		
		ChildOverride ob=new ChildOverride();
		ob.display();
		//ParentOverride ob1=new ParentOverride();//creating parent class object to call parent method--second way of execution
		//ob1.display();

	}

}
