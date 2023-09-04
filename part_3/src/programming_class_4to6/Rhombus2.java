package programming_class_4to6;

public class Rhombus2 {

	public static void main(String[] args) {
        int n=3;
		
		for (int row = 1; row <=n; row++) {
			for (int col = 1; col <= 2*n-1; col++) {
				if (row<=col && col-row<=n-1) {
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
