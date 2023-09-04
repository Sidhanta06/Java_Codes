package programming_class_4to6;

public class N_5 {

	public static void main(String[] args) {
		int n=4,i=1,j=2;

		for (int row = 1; row <=n; row++) {
			for (int col = 1; col <=n; col++) {
				if (row%2!=0) {
					System.out.print(i+" ");
					i+=n;
				}
				else
				{
					System.out.print(j+" ");
					j+=n;
				}
			}
			if (row%2==0) {
				j=row+2;
			}
		   if (row%2!=0) {
			i=row+2;
		}
			
			System.out.println();
		}
	}

}
