package programming_class_4to6;

import java.util.Scanner;

public class TableFormat {

	public static void main(String[] args) {
		System.out.println("Enter one number");
		Scanner s=new Scanner(System.in);
		int input=s.nextInt();
		System.out.println("Enter upto table");
		int range=s.nextInt();
		method(input,range);
	}
	
	public static void method(int input,int k) {
		if (input>=k) {
			do {
		    	 System.out.println("*************************");
			    	System.out.println("Table of " +input);
			    	System.out.println("**************************");
		    	 for (int i = 1; i <=10; i++) {
				int res=input*i;
				System.out.println(input+" * "+i+" = "+res);
		     }
		    	
		    	 input--;
		     }
		     while(input>=k);
		}
		else {
			do {
		    	 System.out.println("*************************");
			    	System.out.println("Table of " +input);
			    	System.out.println("**************************");
		    	 for (int i = 1; i <=10; i++) {
				int res=input*i;
				System.out.println(input+" * "+i+" = "+res);
		     }
		    	
		    	 input++;
		     }
		     while(input<=k);
		}
	     
	     
	}
}
