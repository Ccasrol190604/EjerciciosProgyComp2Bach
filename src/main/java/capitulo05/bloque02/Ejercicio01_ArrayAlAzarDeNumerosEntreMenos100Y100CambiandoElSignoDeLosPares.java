package capitulo05.bloque02;

import java.util.Iterator;

public class Ejercicio01_ArrayAlAzarDeNumerosEntreMenos100Y100CambiandoElSignoDeLosPares {

	public static void main(String[] args) {
		int array[] = new int [150];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - (-100)) + (-100));
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " / ");
		}
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] = -array[i];
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " / ");
		}

	}

}
