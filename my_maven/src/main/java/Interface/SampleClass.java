package Interface;

public class SampleClass implements InterfaceSample
{
    public void print()
    {
    	System.out.println("Method of class");
    }
    
    public void add()
    {
    	System.out.println(a+b);
    }
    public void display()
    {
    	System.out.println("Method in Interface");
    }
	public static void main(String[] args) 
	{
		SampleClass ob=new SampleClass();
		ob.add();//interface method
		ob.display();//interface method
		ob.print();//this class method
		System.out.println(InterfaceSample.a);//variable from interface
		System.out.println("**************");
		
		//InterfaceSample  ob1=new InterfaceSample ();//There is no constructor for interface so we cannot instantiate the instantiate
		InterfaceSample  ob1=new SampleClass ();
		ob1.add();
		ob1.display();
		//ob1.print();//we cannot call the method from class
		System.out.println(InterfaceSample.a);
		
	}

}
