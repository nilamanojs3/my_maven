package Interface;

public class MultipleChildClass implements InterParent1,InterParent2
{
 public void show() 
 {
	 System.out.println("Method of child class");
 }
 public void display()
 {
	 System.out.println(a+b);
 }
 public void print()
 {
	 System.out.println("Parent 2");
 }
	public static void main(String[] args)
	{
		MultipleChildClass ob=new MultipleChildClass();
		ob.show();
		ob.display();
		ob.print();

	}

}
