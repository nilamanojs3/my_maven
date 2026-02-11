package accessmodifier;

public class AccessSample1 

{
     public int a=10;
     private String b="Hello";
     protected char  c='A';
     float d=32.5f; //access modifier is 'default' 
     
     public void print()
     {
    	 System.out.println(a);
    	 System.out.println(b);
    	 System.out.println(c);
    	 System.out.println(d);
     }
     
	public static void main(String[] args)
	{
		AccessSample1 ob=new AccessSample1 ();
		ob.print();
		

	}

}
