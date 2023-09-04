package programming_class_4to6;

import java.util.Scanner;

public class TechNumber {
      public static void main(String[] args) {
    	  Scanner s=new Scanner(System.in);
    	  System.out.println("Enter the number");
		int input=s.nextInt();
		int copy=input,count=0,j=0,k=0;
		
		while (input>0) {
			count++;
			input/=10;
		}
	
		if (count%2==0) {
			count/=2;
			int d=1;
			for (int i = 0; i < count; i++) {
				d*=10;
			}
			j=copy/d;
			k=copy%d;
			int l=j+k;
			l*=l;
			if (l==copy) {
				System.out.println();
				System.out.println(copy+" it is a Tech number");
			}
			else {
				System.out.println();
				System.out.println(copy+" it is not a Tech Number");
			}
		}
		else {
			System.out.println();
			System.out.println(copy+" it is not a Tech Number");
		}
		
	}
}
