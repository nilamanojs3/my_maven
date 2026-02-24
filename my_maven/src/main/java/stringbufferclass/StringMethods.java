package stringbufferclass;

public class StringMethods 
{

	public static void main(String[] args) 
	{
		String s="Welcome";
		System.out.println(s);
		
		String s1=new String("WELCOME");
		System.out.println(s1);
		
		System.out.println("Length of the string 's' is : "+s.length());
		System.out.println("Character for the given index is:"+s.charAt(1));
		
		int a=10;
		System.out.println(String.valueOf(a));
		
		System.out.println("Is s1 and s are equal:"+s1.equals(s));
		System.out.println("After equal ignore upppercaser is s1 ans s are equal:"+s1.equalsIgnoreCase(s));
		
		String s2="";
		String s3= new String(" ");
		System.out.println("Is s2 is a empty string: "+s2.isEmpty());
		System.out.println("Is s3 is a empty string: "+s3.isEmpty());

	}

}
