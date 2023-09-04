package programming_class_4to6;


public class Butterfly {

	public static void main(String[] args) {
		int n=3;
		for (int row = 1; row <= 2*n-1; row++) {
			for (int col = 1; col <=2*n-1; col++) {
				if (((row>=col || row+col>=2*n)&& row<=n)||((row+col<=2*n || col>=row) && row>=n)) {
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
