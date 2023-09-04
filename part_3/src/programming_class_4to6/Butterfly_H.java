package programming_class_4to6;

public class Butterfly_H {

	public static void main(String[] args) {
		int n=10;
		for (int row = 1; row <= 2*n-1; row++) {
			for (int col = 1; col <=2*n-1; col++) {
				if (row==col || row+col==2*n || col==1 || col==n*2-1) {
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
