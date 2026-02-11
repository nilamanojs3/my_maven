package Abstraction;

public class NormalClass extends ShapeAbs
{

	public void draw()
	{
		System.out.println("Draw Triangle");
	}
	
	public static void main(String[] args) 
	{
		NormalClass ob=new NormalClass();
		ob.draw();
		ob.display();

	}

}
