package programming_class_4to6;

public class Differ {

	public static void main(String[] args) {
		String s="s5884I113d";
		String s1="",s2="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			//System.out.println(ch);
			if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				s1=s1+ch;
				
		        
			}
			else
			{
				s2=s2+ch;
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
