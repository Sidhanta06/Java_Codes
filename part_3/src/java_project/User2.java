package java_project;

import java.util.Scanner;

public class User2 {
	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
		String uname;
		long phno;
		long accno;
		int pwd;
		double bal;
		
		boolean repate=true;
		IndianBank b=new IndianBank("Indian Bank", "OAR");
		do 
		{
			   System.out.println("--------------------------------");
			   System.out.println("1. Create Account");	
			   System.out.println("2. Balance Withdraw ");	
			   System.out.println("3. Balance Enquiry");	
			   System.out.println("4. Balance Deposit");	
			   System.out.println("5. Change Password");
			   System.out.println("6. Exit");
			   System.out.println();
			   System.out.println("Enter Option");
			   int i=s.nextInt();
			     
			   
			   switch (i)
			   {
			   case 1:
				   {
					   System.out.println();
					   System.out.println("Enter User Name");
					   uname=s.next();
					   System.out.println("Enter Phone Number");
					   phno=s.nextLong();
					   System.out.println("Enter Account Number");
					   accno=s.nextLong();
					   System.out.println("Enter Password");
					   pwd=s.nextInt();
					   System.out.println("Enter Balance");
					   bal=s.nextDouble();
					   
					   b.createAccount(new Account(accno,pwd,bal,new User(uname,phno)));
				   }
				   break;

			   case 2:
				   {
					   System.out.println();
					   System.out.println("Enter Password");
					   pwd=s.nextInt();
					   System.out.println("Enter Amount");
					   double amount=s.nextDouble();
					   b.withdraw(pwd, amount);
					
				   }
				   break;

			   case 3:
				   {
					   System.out.println();
					   System.out.println("Enter Password");
					   int pwd1=s.nextInt();
					   b.balanceEnquiry(pwd1);
					
				   }
				   break;

			   case 4:
				   {
					   System.out.println();
					   System.out.println("Enter Password");
					   int pwd2=s.nextInt();
					   System.out.println("Enter Deposit amount");
					   double amount1=s.nextDouble();
					   b.deposit(pwd2, amount1);
				   }
				   break;
			   
			   case 5:
				   {
					   System.out.println();
					   System.out.println("Enter Old password");
					   int pwd3=s.nextInt();
					   System.out.println("Enter New password");
					   int pwd4=s.nextInt();
					   b.changePassword(pwd3, pwd4);
				   }
			       break;

				   case 6:
				   {
					repate=false;
				   }
				   break;
			   }	       
		}
		while(repate);
		
	}
}


















/*Account a=new Account(245879654,5786,2587999,(new User("sid",2587689)));
a.getU().detailsofUser();
System.out.println(a.getBalance());*/