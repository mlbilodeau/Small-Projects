package practice;

public class ZeroMatrix {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZeroMatrix rm = new ZeroMatrix();
		
		int[][] m = new int[][] {{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1},{1,1,1,1,0,1,1,1,1},{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1}};
		rm.printMatrix(m);
		rm.printMatrix(rm.zeroOut(m));
	}
	
	public int[][] zeroOut(int[][] matrix){
		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];
		for(int i=0; i<matrix.length;i++) { // 0,1,2,3
			for(int j=0; j<matrix[0].length; j++) {
				if(matrix[i][j] == 0 && row[i]!=1 && col[j] != 1) {
					//zero out rows and columns
					row[i] = 1;
					col[j] = 1;
					
					for(int r=0; r<matrix.length; r++) {
						matrix[r][j]=0;
					}
					for(int c=0; c<matrix[0].length; c++) {
						matrix[i][c]=0;
					}
				} 
			}
		}
		
		
		return matrix;
	}
	
	
	
	public void printMatrix(int[][] mat) {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		System.out.println("____________");
	}

}
