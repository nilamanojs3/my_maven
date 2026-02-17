package exceptionpackage;

public class SampleUserExceptionClass 
{
	public void test(int age) throws LicenseException
	{
		if(age<=18)
		{
			throw new LicenseException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) throws LicenseException 
	{
		SampleUserExceptionClass ob=new SampleUserExceptionClass();
		ob.test(13);

	}

}
