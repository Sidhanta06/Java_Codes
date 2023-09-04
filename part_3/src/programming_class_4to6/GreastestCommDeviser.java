package programming_class_4to6;

import java.util.Scanner;

public class GreastestCommDeviser {
	public static void main(String[] args) {
		System.out.println("Enter the 1st value");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		System.out.println("Enter the 2nd number");
		int j=s.nextInt();
		comm(i,j);
	}
	
	public static void comm(int i,int j) {
		int m=0;
           for (int l = 1; l <=i; l++) {
			if (i%l==0 && j%l==0) {
				m=l;
			}
		}
           System.out.println();
           System.out.println(m+" greatest common deviser");
	}
}
