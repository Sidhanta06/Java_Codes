package programming_class_4to6;

import java.util.Scanner;

public class PHollowStar {

	public static void main(String[] args) {
		System.out.println("Enter the Starting point");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		for (int row = 1; row <= i; row++) {
			for (int col = 1; col <=i; col++) {
				if (row==1 || col ==1 || row==i || col==i ) {
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
