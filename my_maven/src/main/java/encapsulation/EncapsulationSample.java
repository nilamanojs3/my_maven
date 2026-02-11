package encapsulation;

public class EncapsulationSample

{
	private String name;//instance variable
	private int salary;//instance variable
	
	public void setter(String name,int salary)//setter method to set values
	{
		this.name=name;//refering instance variable using this keyword
		this.salary=salary;
	}
	
	public void getter()//getter method to view values
	{
		System.out.println(name);
		int incentive=1500;
		salary=incentive+salary;
		System.out.println(salary);
	}

}
