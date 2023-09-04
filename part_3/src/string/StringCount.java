package string;

public class StringCount {

	public static void main(String[] args) {
		String[] input1= {"a b c s d","e  f c","a b"};
		int large=0;
		for (int i = 0; i < input1.length; i++) {
			int count1=countString(input1[i]);
			if(large<count1) {
				large=count1;
			}
		}
		System.out.println(large);
		
	}
	public static int countString(String s) {
		String[] str=s.split(" ");
		return str.length;
	}
	
	
}
