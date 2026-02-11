package exceptionpackage;

public class ExceSample 
{
    public void display() 
    {
    	int a=10;
    	int b=a/0;
    	System.out.println(b);
    }
	public static void main(String[] args)
	{
		ExceSample  ob=new ExceSample ();
		ob.display();

	}

}
