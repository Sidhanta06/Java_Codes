package programming_class_4to6;

import java.util.Scanner;

public class EvenNumberRange {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the Starting Number");
			int i=s.nextInt();

			System.out.println("Enter the end Number");
	        int j=s.nextInt();

			int Count=0;
			
			for (;i<=j ;i++ )
			{
				if (i%2==0)
				{
					Count++;
				}
			}System.out.println(Count+" is total even numbers in given range.");
		 
	}
}
