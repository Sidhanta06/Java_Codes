package Traingle;

import java.util.Scanner;

public class LeftPyramid_H {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int i=s.nextInt();
		for (int row = 1; row <=2*i-1; row++) {
			for (int col = 1; col <=i; col++) {
				if (col==1 || row==col || row+col==2*i) {
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
