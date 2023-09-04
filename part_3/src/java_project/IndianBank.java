package java_project;

public class IndianBank implements Bank {
	
	String bname;
	String branch;
	Account a;

	public IndianBank(String bname, String branch) {
		super();
		this.bname = bname;
		this.branch = branch;
	}

	@Override
	public boolean createAccount(Account a) {
		if(this.a==null)
		{
			this.a=a;
			System.out.println();
			System.out.println("Congratulation your Account has  Created Successfully");
			System.out.println();
			return true;
		}
		else
		return false;
	}

	@Override
	public void withdraw(int password, double amount) {
		if(a!=null)
		{
			if(a.getPassword()==password)
			{
				if(a.getBalance()>amount)
				{
					a.setBalance(a.getBalance()-amount);
					System.out.println();
					System.out.println("Amount Withdraw Successfully");
					System.out.println();
				}
				else
				{
					System.out.println();
					System.out.println("Insufficient amount");
					System.out.println();
				}
			}
			else
			{
				System.out.println();
				System.out.println("Incorrect password");
				System.out.println();
			}
		}
		else
		{
			System.out.println();
			System.out.println("Account not Created");
			System.out.println();
		}
		
	}

	@Override
	public void balanceEnquiry(int password) {
		if(a.getPassword()==password)
		{
			System.out.println();
			System.out.println(a.getBalance()+" is your available balance");
			System.out.println();
		}
		else
		{
			System.out.println();
			System.out.println("Enter valid password");
			System.out.println();
		}
		
	}

	@Override
	public void deposit(int password, double amount) {
		if(a.getPassword()==password)
		{
			a.setBalance(a.getBalance()+amount);
			System.out.println();
			System.out.println("Amount is Deposited");
			System.out.println();
		}
		else
		{
			System.out.println();
			System.out.println("Enter valid password");
			System.out.println();
		}
		
	}

	@Override
	public void changePassword(int password, int newPassword) {
		if(a.getPassword()==password)
		{
			a.setPassword(newPassword);
			System.out.println();
			System.out.println("Password change Successfully");
			System.out.println();
		}
		else
		{
			System.out.println();
			System.out.println("Enter valid password");
			System.out.println();
		}
		
	}
	

}
