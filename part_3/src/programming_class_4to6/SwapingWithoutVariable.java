package programming_class_4to6;

public class SwapingWithoutVariable {
    public static void main(String[] args) {
		int i=20;
		int j=10;
		
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println(i);
		System.out.println(j);
	}
}
