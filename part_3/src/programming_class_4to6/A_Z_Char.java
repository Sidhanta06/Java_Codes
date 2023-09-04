package programming_class_4to6;

public class A_Z_Char {

	public static void main(String[] args) {
		int n=6;
		
		for (int row = 1; row <=2*n-1; row++) {
			//for S
			for (int col = 1; col <=2*n-3; col++) {
				if ((row==1 && col>1) || (row==n && (col>1 && col<2*n-3)) || (row==2*n-1 && col<2*n-3) || (col==1 && (row>1 && row<n)) || (col==2*n-3 && (row<2*n-1 && row >n)) ) {
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			//for I
				for (int col = 1; col <=2*n-3; col++) {
					if (row==1 || row ==2*n-1 || col==(2*n-2)/2 ) {
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.print("   ");
				
			
			System.out.println();
		}
	}

}
