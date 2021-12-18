package capitulo05_Arrays_y_colecciones_de_datos;

public class Ejercicio01_Suma_Media_MayorYMenorArrayGeneradoAlAzar {

	public static void main(String[] args) {
		int array[] = new int[150];
		int suma = 0;
		float media, mayor = 0, menor = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
			if (i == 0) {
				mayor = array[i];
				menor = array[i];
			}
			else {
				if (array[i] > mayor) {
					mayor = array[i];
				}
				if (array[i] < menor) {
					menor = array[i];
				}
			}
		}
		media = suma / (float) array.length;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "/ ");
		}
		System.out.println("\nLa suma es: " + suma +
				"\nLa media es: " + media +
				"\nEl mayor es: " + mayor + " y el menor es: " + menor);
	}

}
