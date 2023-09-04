package programming_class_4to6;

import java.util.Scanner;

public class Rev {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int j=0,l=n;
		
		while (n>0) {
			int i=n%10;
			j=i+j*10;
			n/=10;
		}
		//System.out.println(j);
		if (j==l) {
			System.out.println(l+" it is a palendrom number");
		}
		else
		{
			System.out.println(l+" it is not a palendrom number");
		}
	}

}
