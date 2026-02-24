package collectionPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfaceSample
{

	public static void main(String[] args) 
	{
		List l=new ArrayList();//List is an interface thats why we are using the Constructor of Arraylist or Classname
		// ADD() method
				l.add("New");
				l.add(90);
				l.add('f');
				l.add(34.55f);
				System.out.println(l);
				
				List<String> l1=new ArrayList();;//Generic LinkedList
				l1.add("Hey");
				l1.add("bye");
				l1.add("book");
				System.out.println(l1);
				
				List<String> l2=new ArrayList();;//Generic LinkedList
				l2.add("Hi");
				l2.add("new");
				l2.add("pack");
				System.out.println(l2);
				
				//REMOVE() Method
				l2.remove(1);
				System.out.println(l2);
				
				//ADDALL() method
				l2.addAll(l1);
				System.out.println(l2);
				
				//REMOVEALL() Method
				l.removeAll(l);
				System.out.println(l);
		

	}

}
