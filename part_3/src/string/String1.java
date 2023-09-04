package string;

public class String1 {

	public static void main(String[] args) {
		String input1="countCamelCase";
		int count=1;
		for(int i=0;i<input1.length();i++) {
			char c=input1.charAt(i);
			if(c>=65&&c<=90) {
				count++;
			}
		}
		System.out.println(count);
	}
}
