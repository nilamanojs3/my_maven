package accessmodifier;

public class AccessSample2 
{

	public static void main(String[] args) 
	{
		AccessSample1 ob1=new AccessSample1();
		System.out.println(ob1.a);
		//System.out.println(ob1.b);//no access for private variables outside the class same package
		System.out.println(ob1.c);
		System.out.println(ob1.d);
		
		
		

	}

}
