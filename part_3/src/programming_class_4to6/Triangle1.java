package programming_class_4to6;

public class Triangle1 {

	public static void main(String[] args) {
		int n=4;
		int n1=n+1;
		for (int row = 1; row <=n; row++) {
			for (int col = 1; col <=2*n-1; col++) {
				if (row+col>=n+1 && col-row<=n-1 && row+col==n1) {
					System.out.print("* ");
					n1+=2;
				}
				else
				{
					System.out.print("  ");
				}
			} 
			System.out.println();
			n1=n+1;
		}

	}

}
