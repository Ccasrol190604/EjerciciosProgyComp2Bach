package capitulo03.bloque02;

import java.util.Scanner;

public class Ejercicio02_MayorYMenorDeNumerosIntroducidosPorUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidadDeNumeros, num, mayor = 0, menor = 0;
		
		System.out.println("Introduzca una cantidad de números: ");
		cantidadDeNumeros = sc.nextInt();
		
		for (int i = 0; i < cantidadDeNumeros; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			
			if (i == 0) {
				mayor = num;
				menor = num;
			}
			
			else {
				if (num > mayor) {
					mayor = num;
				}
				if (num < menor) {
					menor = num;
				}
			}
		}
		
		System.out.println("El mayor es: " + mayor + " / El menor es: " + menor);
	}

}
