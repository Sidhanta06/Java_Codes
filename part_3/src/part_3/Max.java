package part_3;

public class Max {
   public static void main(String[] args) {
	int a[]= {1,3,54,8,7};
	int max=a[0];
	for (int i = 1; i < a.length; i++) {
		if (max<a[i]) {
			max=a[i];
		}
	}
	System.out.println(max);
}
}
