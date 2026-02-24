package Inheritance;

public class HierarchicalInheritanceChild2 extends HierarchicalInheritanceParentClass
 
{
	
 String s2="Hello";
 public void add()
 {
	 int a=10;
	 int b=20;
	 System.out.println(a+b);
 }
		 
	public static void main(String[] args) 
    
	{ 
		HierarchicalInheritanceChild2 ob2=new HierarchicalInheritanceChild2();
		ob2.add();
		System.out.println(ob2.s2);
		ob2.sub();
		System.out.println(ob2.s);

	}

}
