package exceptionpackage;

public class ArithmeticExceTryCatch 

{
    public void display() 
    {
    	int a=10;
    	
    	try//insert the exception code inside the try block 
    	{
    	int b=a/0;
    	System.out.println(b);
    	}
    	
    	catch(Exception e)//handling the exception by using catch block
    	{
    	System.out.println("Exception Handled.");
    	System.out.println(e);
    	}
    	                                                                                   
    	finally
    	{
    	System.out.println("Finally Block");//this block will execute anyway .doesn't matter whether the exception handled or not.Used to execute important blocks
    	}
    }
	public static void main(String[] args)
	{
		ArithmeticExceTryCatch   ob=new ArithmeticExceTryCatch  ();
		ob.display();

	}

}
