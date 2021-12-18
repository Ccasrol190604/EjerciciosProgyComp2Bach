package capitulo05.bloque04;

public class Ejercicio01_ArrayDe150Posiciones_CalculaLaMediaYLosNumerosMenoresDeEseValor {

	public static void main(String[] args) {
		int array[] = new int[150];
		int suma = 0, contador = 0;
		float media;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);	
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " / ");
		}
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		media = suma / (float) array.length;
		System.out.println("La media es: " + media);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < media) {
				contador++;
			}
		}
		
		System.out.println("El porcentaje de números por debajo de la media es de: " + (contador * 100 / (float) array.length) + "%");
		
	}

}
