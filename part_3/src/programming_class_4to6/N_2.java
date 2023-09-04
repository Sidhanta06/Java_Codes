package programming_class_4to6;

public class N_2 {

	public static void main(String[] args) {
		int n=4;
		for (int row = 1; row <=n; row++) {
			for (int col = 1; col <=n; col++) {
				if (row==1 || col==1 || row==n || col==n) {
					System.out.print(col+" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		

	}

}
