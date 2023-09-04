package Traingle;

import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int i=s.nextInt();
		for (int row = 1; row <=i; row++) {
			for (int col = 1; col <=2*i-1; col++) {
				if (row<=col && row+col<=2*i) {
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
