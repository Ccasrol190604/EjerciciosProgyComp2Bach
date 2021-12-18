package capitulo05.bloque04;

public class Ejercicio02_TresArrays {

	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = new int[5], array2 = new int[5];
		float medias[] = new float[5];
		
		for (int i = 0; i < medias.length; i++) {
			array1[i] = obtenerNumeroAlAzar();
			array2[i] = obtenerNumeroAlAzar();
		}
		
		muestraArray(array1);
		muestraArray(array2);
		
		for (int i = 0; i < array1.length; i++) {
			medias[i] = (array1[i] + array2[i] / 2f);
		}
		
		for (int i = 0; i < medias.length; i++) {
			System.out.print(medias[i] + " / ");
		}
		
	}

	/**
	 * 
	 * @param array
	 */
	public static void muestraArray (int array[]) {
		System.out.print("Array : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " / ");
		}
		System.out.println();
	}
	
	/**
	 * 
	 * @return
	 */
	public static int obtenerNumeroAlAzar() {
		int numAzar = (int) Math.round(Math.random() * 100);
		return numAzar;
	}	
}
