package capitulo03.bloque03;

import java.util.Scanner;

public class Ejercicio02_MayorYMenorDeNumerosIntroducidosPorElUsuarioHasta0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidadDeNumeros, num = 1, mayor = 0, menor = 0;
		
		System.out.println("Introduzca una cantidad de números: ");
		cantidadDeNumeros = sc.nextInt();
		
		for (int i = 0; num != 0; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			
			if (num != 0) {
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
