package programming_class_4to6;

import java.util.Scanner;

public class SumOfEvenNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the start number");
		int start=s.nextInt();
		System.out.println("Enter the end number");
		int end=s.nextInt();
		
		int sum=0;
		
		for (;start<=end; start++) {
			if (start%2==0) {
              sum=sum+start;				
			}
		}
		System.out.println(sum+" is the sum of the even number");
	}

}
