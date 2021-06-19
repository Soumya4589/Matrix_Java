package matrix;

public class Matrix {

	public static void main(String[] args) {
		// Matrix Addition
		int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
		int b[][]= {{1,3,4},{2,4,3},{1,2,4}};
		int s[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				s[i][j]=a[i][j]+b[i][j];	
			}
		}
		for(int i = 0;i<3;i++) {
			System.out.println();
			for(int j=0;j<3;j++) {
				System.out.print(s[i][j]+"\t");
			}
		}
		

	}

}
