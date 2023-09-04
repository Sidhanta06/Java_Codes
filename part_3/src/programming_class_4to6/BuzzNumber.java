package programming_class_4to6;

import java.util.Scanner;

public class BuzzNumber {
 
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner s=new Scanner(System.in);
		int input=s.nextInt();
		
		if (input%7==0) {
			System.out.println(input+" it is a Buzz number");
		}
		else if (input%10==7) {
			System.out.println(input+" it is a Buzz number");
		}
		else 
		{
			System.out.println(input+" it is not a Buzz number");
		}
	}

}
