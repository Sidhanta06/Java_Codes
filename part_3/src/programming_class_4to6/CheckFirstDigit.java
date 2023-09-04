package programming_class_4to6;

import java.util.Scanner;

public class CheckFirstDigit {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int n=0;
		while (i>0) {
			n=i%10;
			i/=10;
		}
		
		
		
		if (n%2==0) {
			System.out.println(n+" is a enev number");
		}
		else {
			System.out.println(n+" is odd number");
		}
	}

}
