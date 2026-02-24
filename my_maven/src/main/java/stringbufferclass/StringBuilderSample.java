package stringbufferclass;

public class StringBuilderSample
{

	public static void main(String[] args) 
	{
		StringBuilder ob1=new StringBuilder("Welcome");
		System.out.println(ob1);
		
		System.out.println("APPEND:"+ob1.append(" to Java"));
		System.out.println("INSERT:"+ob1.insert(0, "Hey "));
		System.out.println("DELETE:"+ob1.delete(15, 19));
		System.out.println("REPLACE:"+ob1.replace(0, 3,"Hi"));
		System.out.println("REVERSE:"+ob1.reverse());
		

	}

}
