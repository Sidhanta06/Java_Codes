package programming_class_4to6;

public class SwapingNumberWithoutVariable {
    public static void main(String[] args) {
		int i=10;
		int j=20;
		
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println(i);
		System.out.println(j);
	}
}
