package programming_class_4to6;

import java.util.Scanner;

public class RootSquare {

	public static void main(String[] args) {
		System.out.println("Enter one number");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		//int j = i+1;
		boolean b=false;
		for (int k2 = 1; k2 <= i; k2++) {
			if (k2 * k2 == i) {
				System.out.println(k2 + " is square root of " + i);
				b=true;
			}

		}
		if (b==false)
		{
			System.out.println(i+" is not a perfect square");
		}

	}
}