package programming_class_4to6;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println("Enter one Number");
		Scanner s=new Scanner(System.in);
		int input=s.nextInt();

		while(true) {
			int input2=0;
			while (input>0) {
			 int i=input%10;
			 input2+=i*i;
			 input/=10;
			}
			
	       input=input2;
	       
			if (input==1 ) {
				System.out.println(input+" it is happy number");
				break;
			}
			else if (input==4) {
				System.out.println(input +" it is a sad number");
				break;
		}
	}
		
	}

}
