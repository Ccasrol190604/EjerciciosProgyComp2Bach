package capitulo03.bloque02;

import java.util.Scanner;

public class Ejercicio04_MultiplosDeUnNumeroHastaUnLimiteEstablecidoPorElUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, limite;
		
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		System.out.println("Introduzca un límite: ");
		limite = sc.nextInt();
		
		for (int i = 0; (num * i) < limite; i++) {
			System.out.println("Múltiplo de " + num + ": " + (num * i));
		}
	}

}
