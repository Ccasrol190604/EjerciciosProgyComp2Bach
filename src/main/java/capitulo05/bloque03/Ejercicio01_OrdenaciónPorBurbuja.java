package capitulo05.bloque03;

public class Ejercicio01_OrdenaciónPorBurbuja {

	public static void main(String[] args) {
		int array[] = new int[150];
		int aux;
		boolean hayIntercambios;
		
	for (int i = 0; i < array.length; i++) {
		array [i] = (int) Math.round(Math.random() * 1000);
	}
	
	System.out.print("Array: ");
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] + " / ");
	}
	System.out.println();
	
	do {
		hayIntercambios = false;
		for (int i = 0; i < (array.length-1); i++) {
			if (array[i + 1] < array[i]) {
				aux = array[i];
				array[i] = array[i+1];
				array[i+1] = aux;
				hayIntercambios = true;
			}
		}
	} while (hayIntercambios == true);
	
	System.out.print("Array : ");
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] + " / ");
	}
	System.out.println();

	}

}
