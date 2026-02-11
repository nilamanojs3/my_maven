package accessmodifier1;

import accessmodifier.AccessSample1;

public class AccessSample3 extends AccessSample1//2 class from different package 
{

	public static void main(String[] args) 
	{
		AccessSample3 ob2=new AccessSample3 ();
		System.out.println(ob2.a);
		//System.out.println(ob2.b);//no access for private outside the class 
		System.out.println(ob2.c);
		//System.out.println(ob2.d);//no access for default ouside the package
		

	}

}
