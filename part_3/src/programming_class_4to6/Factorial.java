package programming_class_4to6;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the Number");
	int i=s.nextInt();
	int mul=1;
	for (;i>=1; i--) {
		mul=mul*i;
	}
	System.out.println(mul+" is the factorial of given number");
  }
}
