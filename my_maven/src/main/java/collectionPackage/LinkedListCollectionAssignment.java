package collectionPackage;

import java.util.LinkedList;

public class LinkedListCollectionAssignment {

	public static void main(String[] args)
	{
		LinkedList al=new LinkedList();
	// ADD() method
		al.add("New");
		al.add(90);
		al.add('f');
		al.add(34.55f);
		System.out.println(al);
		
		LinkedList<String> al1=new LinkedList();//Generic LinkedList
		al1.add("Hey");
		al1.add("bye");
		al1.add("book");
		System.out.println(al1);
		
		LinkedList<String> al2=new LinkedList();//Generic LinkedList
		al2.add("Hi");
		al2.add("new");
		al2.add("pack");
		System.out.println(al2);
		
		//REMOVE() Method
		al2.remove(1);
		System.out.println(al2);
		
		//ADDALL() method
		al2.addAll(al1);
		System.out.println(al2);
		
		//REMOVEALL() Method
		al.removeAll(al);
		System.out.println(al);
		
		//GET Method
		System.out.println(al2.get(3));
		
		//SIZE() Method
		System.out.println(al2.size());
		
		//CONTAINS() Methhod
		
		boolean s=al2.contains("Hello");//Existing value
		System.out.println(s);//Return TRUE
		boolean s1=al2.contains("Green");//Non existing value
		System.out.println(s1);//REturn False
		
	}

}
