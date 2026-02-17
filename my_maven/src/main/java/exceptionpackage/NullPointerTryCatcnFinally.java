package exceptionpackage;

public class NullPointerTryCatcnFinally
{

	public void display() 
    {
			try
			{
				String s="";
				System.out.println(s.charAt(1));
			}
			catch(Exception e)
			{
			System.out.println("Exception handled");
			System.out.println(e);
			}
			
			finally
			{
				System.out.println("FINALLY BLOCK");
			}
    }
	public static void main(String[] args)
	{
		NullPointerTryCatcnFinally  ob=new NullPointerTryCatcnFinally();
		ob.display();

	}

}
