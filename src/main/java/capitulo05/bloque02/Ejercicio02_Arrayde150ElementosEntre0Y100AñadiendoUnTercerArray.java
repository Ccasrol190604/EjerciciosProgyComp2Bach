package capitulo05.bloque02;

import java.util.Iterator;

public class Ejercicio02_Arrayde150ElementosEntre0Y100AñadiendoUnTercerArray {

	public static void main(String[] args) {
		int array[] = new int[150];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		

	}

}
