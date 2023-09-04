package programming_class_4to6;

import java.util.Scanner;

public class CountOfFacter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int f=s.nextInt();
		
		int count=0;
		for (int i = 1; i <=f; i++) {
			if (f%i==0) {
				count++;
			}
		}
		System.out.println(count+" is the facters in given number");
	}

}
