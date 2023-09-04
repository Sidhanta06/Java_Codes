package programming_class_4to6;

public class XylemOrPhloem_Number {
     public static void main(String[] args) {
	    int input=5555;
	    int k=0,input1=input/10,m=0,z=input;
	    
	    int j=input%10;//last digit
	    input/=10;
	  	   
	   while(input1>9) {
		   m=m+input1%10;
		   input1/=10;
	   }
	  
	   k=input1;//First 
	   
	 if (j+k==m) {
		System.out.println(z+" it is Xylem number");
	}
	 else
	 {
		 System.out.println(z+" it is a Polem number");
	 }
	}
     
     
}
