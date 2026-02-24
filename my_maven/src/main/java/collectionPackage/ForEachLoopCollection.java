package collectionPackage;

import java.util.ArrayList;

public class ForEachLoopCollection 
{

	public static void main(String[] args) 
	{

		ArrayList<String> al=new ArrayList();
	
		al.add("Hi");
		al.add("Hello");
		al.add("Bye");
		
		//FOREACH LOOP
		
		for(String a:al)
		{
			System.out.println(a);
		}
		
		int c[]= {10,11,12};
		for(int b:c)
		{
			System.out.println(b);
		}
		

	}

}
