package encapsulation;

public class Sample 
{

	public static void main(String[] args)
	{
		EncapsulationSample ob=new EncapsulationSample();//Aggregation-creating the encapsulation class obj to call setter and getter method because there is no connection in between classes
		ob.setter("John", 20000);//passing values to the variable name and salary created in encapsulation class
		ob.getter();//calling getter method created in encapsulation class

	}

}
