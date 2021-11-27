package capitulo03.bloque03;

import java.util.Scanner;

public class Ejercicio02_MayorYMenorValorDeNumerosIntroducidosPorUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros, num, mayor = 0, menor = 0;
		
		System.out.println("Introduzca cantidad de números: ");
		numeros = sc.nextInt();
		
		for (int i = 0; i < numeros; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
		
			
			if (i != 0) { 
				mayor = num;
				menor = num; 
			}
			
			else {
				if (num > mayor) {
					mayor = num;
					
				if (num < menor) {
					menor = num;
				}
			}
			}
			
		}
		System.out.println("El mayor número es: " + mayor + " - El menor número es: " + menor);
		

	}

	}

