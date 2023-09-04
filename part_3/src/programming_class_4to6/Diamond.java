package programming_class_4to6;

public class Diamond {

	public static void main(String[] args) {
		int n=6;
		for (int row = 1; row <=2*n-1; row++) {
			for (int col = 1; col <=2*n-1; col++) {
				if (row+col>=n+1 && col-row<=n-1 && row-col<=n-1 && row+col<=3*n-1) {
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
