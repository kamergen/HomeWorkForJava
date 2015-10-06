package homeWork150915;


public class Mass {
	public static void main(String[] args) {
		
		massWork(5, 5);
		
	}
	
	public static void massWork(int first, int second) {
		
		int[][] matrix = new int[first][second];
		
		int a,b;
		
		for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix[i].length; j++) {
			
			if(i==j){
			    matrix[i][j]=1;
			    a=i;b=j;
			}

			System.out.print(matrix[i][j] + " ");	
		}
			System.out.println();	
		}
		
		}
		
		
}
