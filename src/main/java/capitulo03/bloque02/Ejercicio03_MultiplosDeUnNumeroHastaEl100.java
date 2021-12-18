package capitulo03.bloque02;

import java.util.Scanner;

public class Ejercicio03_MultiplosDeUnNumeroHastaEl100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		for (int i = 0; (num * 1) < 100; i++) {
			System.out.println("Múltiplo de " + num + ": " + (num * i));
		}
	}

}
