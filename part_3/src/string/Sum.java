package string;

public class Sum {
	public static void main(String[] args) {
		int[][] ref= {{1,2,3,4},{5,6,7,8}};
		int[][] ref1= {{5,6,7,8},{1,2,3,4}};
		
		for (int i = 0; i < ref.length; i++){
			for (int j = 0; j <ref1[i].length; j++) {
				System.out.print(ref[i][j]+ref1[i][j]+" ");
				
			}
		}
	}

}
