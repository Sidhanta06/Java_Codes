package string;

public class Midrev {
	public static void main(String[] args) {
		String s="good morning welcome to java class";
		String[] str=s.split(" ");
		String s1="";
		for (int i = 0; i <str.length; i++) {
			if (i%2!=0) {
				s1=s1+reverse(str[i])+" ";				
			}
			else
			{
			  s1=s1+str[i]+" ";			
			  }
		}
		System.out.println(s1);
	}

	public static String reverse(String s) {
		String s1="";
		for (int i = s.length()-1; i >=0; i--) {
			s1=s1+s.charAt(i);
			
		}
		return s1;
		
	}

}
