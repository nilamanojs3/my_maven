package exceptionpackage;

public class NullPointerExceSample

{
    public void display() 
    {
    	String s="";
    	System.out.println(s.charAt(1));
    }
	public static void main(String[] args)
	{
		NullPointerExceSample  ob=new NullPointerExceSample ();
		ob.display();

	}

}
