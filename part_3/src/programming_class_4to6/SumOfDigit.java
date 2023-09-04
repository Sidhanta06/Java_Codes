package programming_class_4to6;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int input=s.nextInt();
        int sum=0,n=0;
        while (input>0) {
			n=input%10;
			sum=sum+n;
			input/=10;
		}
        System.out.println("Sum of given number is "+sum);
	}

}
