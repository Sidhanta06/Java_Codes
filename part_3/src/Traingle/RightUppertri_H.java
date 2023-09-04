package Traingle;

import java.util.Scanner;

public class RightUppertri_H {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int i=s.nextInt();
		for (int row = 1; row <=i; row++) {
			for (int col = 1; col <=i; col++) {
				if (row==i || col==i || row+col==i+1) {
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
