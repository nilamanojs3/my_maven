package Inheritance;

public class HierarchicalInheritanceChild1 extends HierarchicalInheritanceParentClass
{
	String s1="Welcome";
	 public void mul()
	 {
		 int a=5;
		 int b=2;
		 System.out.println(a*b);
	 }
	public static void main(String[] args) 
	{
		HierarchicalInheritanceChild1 ob1=new HierarchicalInheritanceChild1();
		ob1.mul();
		System.out.println(ob1.s1);
		ob1.sub();
		System.out.println(ob1.s);
		

	}

}
