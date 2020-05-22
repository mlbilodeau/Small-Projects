package practice;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateMatrix rm = new RotateMatrix();
		
		int[][] m = new int[][] {{1,0,1,1},{1,1,1,1},{1,1,0,0},{0,1,0,0}};
		rm.printMatrix(m);
		rm.printMatrix(rm.rotate(m));
	}
	
	
	public int[][] rotate(int[][] mat){
		for(int layer=0; layer<mat.length/2; layer++) {
			int first = layer;
			int last = mat.length-1-layer;
			for(int i=first; i<last; i++) {
				int offset = i - first;
				//save top
				int top = mat[first][i];

				//left to top.
				mat[first][i] = mat[last-offset][first];
				//bottom to left
				mat[last-offset][first] = mat[last][last-offset];
				//right to bottom
				mat[last][last-offset] = mat[i][last];
				//top to right
				mat[i][last] = top;
			}
		}
		return mat;
		
	}
	
	
	public void printMatrix(int[][] mat) {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		System.out.println("____________");
	}

}
