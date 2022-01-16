package capitulo05.bloque05_Matrices;

public class Ejercicio01_Matriz5x5 {

	public static void main(String[] args) {
		int array[] = new int[] {0, 1, 2, 3, 4};
		
		int matriz[][] = new int[][] {{10, 11, 12, 13, 14},
			                          {15, 16, 17, 18, 19},
			                          {20, 21, 22, 23, 24},
			                          {25, 26, 27, 28, 29},
			                          {30, 31, 32, 33, 34}};
	    
		muestroMatriz(matriz);	
		
		System.out.println("\nMatriz positiva: " +esMatrizPositiva(matriz));
	}  
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean esMatrizPositiva(int matriz[][]) {
		boolean resultado = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					resultado = false;
				}
			}
		}
		return resultado;
	}
			    
		

	
	/**
	 * 
	 * @param matriz
	 */
	public static void muestroMatriz (int matriz [][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
