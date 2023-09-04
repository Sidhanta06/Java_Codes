package part_3;

public class Account {
	private int accno;
	private int password;
	private double balance;
	private User u;
	
	public Account(int accno, int password, double balance, User u) {
		super();
		this.accno = accno;
		this.password = password;
		this.balance = balance;
		this.u = u;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}
	

}
