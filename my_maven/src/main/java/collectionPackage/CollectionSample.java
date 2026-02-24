package collectionPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSample 
{

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();//Non generic arraylist.
	// ADD() method
		al.add("Hi");// add() method used to add values in collection
		al.add(33);
		al.add('A');
		al.add(34.55f);
		System.out.println(al);
		
		
		ArrayList<String> al1=new ArrayList();//Generic arraylist
		al1.add("Hello");
		al1.add("Welcome");
		al1.add("Enjoy");
		System.out.println(al1);
		
		ArrayList<String> al2=new ArrayList();//Generic arraylist
		al2.add("Hey");
		al2.add("new");
		al2.add("pack");
		System.out.println(al2);
		
		//REMOVE() Method
		al2.remove(1);//Remove method to remove the data in the first index of al2.
		System.out.println(al2);
		
		//ADDALL() method
		al2.addAll(al1);//adding al1 array to al2 arraylist or two merge two arraylist
		System.out.println(al2);
		
		//REMOVEALL() Method
		al.removeAll(al);//removing all elements from al arraylist
		System.out.println(al);
		
		//GET Method--to fetch one value from a particular index
		System.out.println(al2.get(3));
		
		//SIZE() Method--to know the size of the arraylist or total no of elements
		System.out.println(al2.size());
		
		//CONTAINS() Methhod --checking whether a particular value is there in the list or nor,Return true or false
		
		boolean s=al2.contains("Hello");//Existing value
		System.out.println(s);//Return TRUE
		boolean s1=al2.contains("Green");//Non existing value
		System.out.println(s1);//REturn False
		
		//Iterator Interface--used to fetch data one by one
		
		Iterator it=al2.iterator();//using iterator method to work on list al2 and storing to object 'it'
		
		while(it.hasNext())//checking every elements in the list of elements in 'it'
		{
			System.out.println(it.next());//taking the value or fetching value
		}
		
		//REMOVE Method in iterator--using this to remove the last element
		it.remove();
		System.out.println(al2);//removed the last element in al2 and printing
	}

}
