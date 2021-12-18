package capitulo05.bloque03;

import java.util.Iterator;

public class Ejercicio02_OrdenaciónPorSelección {

	public static void main(String[] args) {
		int array[] = new int[150];
		int menorDelIntervalo, posicionDelMenor;
		
		// inicializo el array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 1000);
		}
		
		//Muestro el array en pantalla
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array [i] + " / ");
		}
		System.out.println();
	
		for (int i = 0; i < array.length; i++) {
			menorDelIntervalo = array[i];
			posicionDelMenor = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < menorDelIntervalo) {
					menorDelIntervalo = array[j];
					posicionDelMenor = j;
				}
			}
			
			int aux = array[i];
			array[i] = array[posicionDelMenor] ;
			array[posicionDelMenor] = aux;
		}
		
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " / ");
		}
		System.out.println();
		
		
	}		
}		