package programming_class_4to6;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int input=s.nextInt();
		int input1=input,m=0,n=1;
		
		while(input!=0) {
			int j=input%10;
			m+=j;
			n*=j;
			input/=10;
		}
		
		if (m==n) {
			System.out.println(input1+" it is a Spy Number");
		}
		else 
		{
			System.out.println(input1+" it is not a Spy Number");
		}

	}


}
