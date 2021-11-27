package capitulo05_Arrays_y_colecciones_de_datos;

public class Ejercicio02_ArrayDe150ElementosEnterosAlAzarEntre0Y100_ImprimirElArrayEnOrdenInverso {

	public static void main(String[] args) {
		int array[] = new int[150];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " / ");
		}

		System.out.println("Números en orden inverso");
		for (int i = array.length -1; i >= 0; i--) {
			System.out.print(array[i] + " / ");
			
		}
	}
}
