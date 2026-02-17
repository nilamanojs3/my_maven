package exceptionpackage;

public class BankAccountUserException
{
    public void payment(int salary)throws SalaryException
    {
    	if(salary<=20000)
    	{
    		throw new SalaryException("Cannot Withdraw the fund");
    	}
    	else
    	{
    		System.out.println("Withdraw the Amount");
    	}
    }
	public static void main(String[] args) throws SalaryException
	{
		BankAccountUserException ob=new BankAccountUserException();
		ob.payment(15000);
	}

}
