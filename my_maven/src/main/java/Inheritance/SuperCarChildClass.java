package Inheritance;

public class SuperCarChildClass extends SuperVehicleParentClass
{
    public void display()
    {
    	System.out.println(super.speed);
    	super.print();
    }
	public static void main(String[] args) 
	{
		SuperCarChildClass ob=new SuperCarChildClass();
		ob.display();
		

	}

}
