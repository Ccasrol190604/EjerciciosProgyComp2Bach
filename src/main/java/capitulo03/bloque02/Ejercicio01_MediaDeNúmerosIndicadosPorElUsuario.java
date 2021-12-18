package capitulo03.bloque02;

import java.util.Scanner;

public class Ejercicio01_MediaDeNúmerosIndicadosPorElUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidadDeNumeros, num, suma = 0;
		float media;
		
		System.out.println("Introduzca la cantidad de números: ");
		cantidadDeNumeros = sc.nextInt();
		
		for (int i = 0; i < cantidadDeNumeros; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			suma += num;
		}
		
		media = suma / (float) cantidadDeNumeros;
		System.out.println("La media es: " + media);

	}

}
