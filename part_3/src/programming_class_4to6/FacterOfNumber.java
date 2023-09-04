package programming_class_4to6;

import java.util.Scanner;

public class FacterOfNumber {

	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
       System.out.println("Enten the number");
       int f=s.nextInt();
       
       for (int i = 1; i <=f; i++) {
          if (f%i==0) {
        	  System.out.println(i+" is a facter of "+f);
		}		
	}
	}

}
