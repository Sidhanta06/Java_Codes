package java_project;

public interface Bank{
	boolean createAccount(Account a);
	void withdraw(int password,double amount);
	void balanceEnquiry(int password);
	void deposit(int password,double amount);
	void changePassword(int password,int newPassword);
}
