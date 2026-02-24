package stringbufferclass;

public class StringBufferSample 
{

	public static void main(String[] args)
	{
		StringBuffer ob=new StringBuffer(" Hello");
		System.out.println(ob);
		
		//append()---to add one object to another object
		ob.append("Java");
		System.out.println(ob);
		
		//insert()---to  add a value in a given index postion
		ob.insert(4,"hi");
		System.out.println(ob);
		
		//replace()---to replace from which range to change the or replace the value
		ob.replace(3, 5, "Welcome");
		System.out.println(ob);
		
		//delete()---delete the value in the given postion with a startimg and ending index number
		ob.delete(1, 3);
		System.out.println(ob);
		
		//reverse()
		ob.reverse();
		System.out.println(ob);
		

	}

}
