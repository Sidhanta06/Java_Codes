package programming_class_4to6;

public class Rhombus {

	public static void main(String[] args) {
		int n=3;
		
		for (int row = 1; row <=n; row++) {
			for (int col = 1; col <= 2*n-1; col++) {
				if (row+col>=n+1 && row+col<=2*n) {
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
