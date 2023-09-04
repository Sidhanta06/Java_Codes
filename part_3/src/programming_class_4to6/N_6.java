package programming_class_4to6;

public class N_6 {

	public static void main(String[] args) {
		int n = 5;
        int num=1;
		for (int row = 1; row <= n; row++) {
			int k=num;
			for (int col = 1; col <= n; col++) {
				  System.out.print(k +" ");
				  k+=n;
			}
             num++;
			System.out.println();
		}

	}

}
