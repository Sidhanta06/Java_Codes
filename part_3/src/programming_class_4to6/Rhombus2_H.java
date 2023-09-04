package programming_class_4to6;

public class Rhombus2_H {

	public static void main(String[] args) {
        int n=5;
		
		for (int row = 1; row <=n; row++) {
			for (int col = 1; col <= 2*n-1; col++) {
				if (row==col || col-row==n-1 || (row==1 && col<=n) || (row==n && col>=n)) {
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
