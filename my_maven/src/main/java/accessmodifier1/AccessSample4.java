package accessmodifier1;

import accessmodifier.AccessSample1;

public class AccessSample4 
{

	public static void main(String[] args) 
	{
		AccessSample1 ob3=new AccessSample1();
		System.out.println(ob3.a);
		//System.out.println(ob3.b);////no access for private if different package if no connection
		//System.out.println(ob3.c);//no access for protected if different package if no connection
		//System.out.println(ob3.d);//no access for default if different package if no connection
		
		

	}

}
