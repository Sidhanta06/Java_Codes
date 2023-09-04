package programming_class_4to6;

import java.util.Scanner;

public class productOfDigit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int input=s.nextInt();
		int pro=1,n=0;
		while (input>0) {
			n=input%10;
			pro*=n;
			input/=10;
		}
		System.out.println("Product of digits is "+pro);
	}

}
