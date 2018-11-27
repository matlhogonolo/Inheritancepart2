
public class Main {

	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount();
		
		sa.rate = 2.5;
		
		CurrentAccount ca = new CurrentAccount();
		
		ca.rate = 3.5;
		
		ca.deposit(3400);

	}

}

class  Account
{
	double balance;
	int accNo;
	double  rate;
	
	public  double deposit(double balance) 
	{
		
		return balance;
	}
}


class CurrentAccount extends Account
{
	
	
	public static double withdraw(double balance) 
	{
		
		return balance;
	}
}

class SavingsAccount extends Account
{
	
	
	
}