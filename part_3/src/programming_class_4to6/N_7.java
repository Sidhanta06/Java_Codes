package programming_class_4to6;

public class N_7 {

	public static void main(String[] args) {
		int n=5,num=1;
		
		for (int row = 1; row <=n; row++) {
			int x=n-1;
			
			for (int col = 1; col <=n; col++) {
				if (row>=col) {
					System.out.print(num+" ");
					num+=x;
					x--;
				}
			}
			num=row+1;
			System.out.println();
		}

	}

}
