package capitulo05.bloque02;

import java.util.Scanner;

public class Ejercicio04_ArrayDe5ElementosAzarEntre0Y100DesplazamientoCircular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int ultimo;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " / ");
		}
		
	
		
		
		
		
		
		

	}

}
