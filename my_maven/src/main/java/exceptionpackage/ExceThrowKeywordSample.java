package exceptionpackage;

public class ExceThrowKeywordSample 
{

	public static void display(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible.");//Explicitily throwing the exception to the constructor of ArithmeticException class.
		}
		else
		{
			System.out.println("Eligible for license.");
		}
	}
	public static void main(String[] args) 
	{
		// we can use try catch to handle the exception here because code line 22 is picking the exception .so we can put that in try block
		//try 
		//{
		ExceThrowKeywordSample.display(2);
		//}
		//catch(Exception e)
		//{
		//	System.out.println("Exception Handled");
		//}

	}

}
