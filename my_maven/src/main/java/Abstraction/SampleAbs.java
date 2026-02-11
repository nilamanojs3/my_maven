package Abstraction;

public class SampleAbs extends AbstractClassSample //definition passing 
{

	public  void print()//creating same abstract method to pass values or data-we are doing method overriding here
	{
		System.out.println("to pass definition to abstract method");
	}
	
	public static void main(String[] args)
	
	{
		SampleAbs ob=new SampleAbs();
		ob.display();
		ob.print();

	}

}
