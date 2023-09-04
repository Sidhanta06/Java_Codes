package programming_class_4to6;

public class N_4 {

	public static void main(String[] args) {
		int n=4;
		for (int row = 1; row <=n; row++) {
			for (int col = 1; col <=n; col++) {
				if (row%2!=0) {
					System.out.print(row+" ");
				}
				else
					System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

}
