package exceptionpackage;

public class PostiveNumThrowKeywordAssignment 
{

	public static void print(int num)
	{
		if(num<0)
		{
			throw new ArithmeticException("Not a Positive Number");
		}
		else
		{
			System.out.println("Positive Number");
		}
		
	}
	public static void main(String[] args)
	{
		PostiveNumThrowKeywordAssignment .print(-2);
		

	}

}
