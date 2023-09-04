package programming_class_4to6;

import java.util.Scanner;

public class CountNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int in=s.nextInt();
		int count=0;
		for (;in>0;) {
			in=in/10;
			count++;
		}
		System.out.println(count +" count of given number");
	}
}
