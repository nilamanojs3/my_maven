package Interface;

public class ShapeClass implements InterfaceShape
{

	public void shape()
	{
		System.out.println("share is rectangle");
	}
	
	public void draw()
	{
		System.out.println("draw method from interface-drawing rectangle");
	}
	
	public void area()
	{
		System.out.println(length*breadth);
	}
	public static void main(String[] args) 
	{
		ShapeClass ob=new ShapeClass();
		ob.shape();
		ob.area();
		ob.draw();
		System.out.println(InterfaceShape.length);
		System.out.println("***********************");
		
		InterfaceShape ob1=new ShapeClass();
		ob1.area();
		ob1.draw();
		System.out.println(InterfaceShape.breadth);
		

	}

}
