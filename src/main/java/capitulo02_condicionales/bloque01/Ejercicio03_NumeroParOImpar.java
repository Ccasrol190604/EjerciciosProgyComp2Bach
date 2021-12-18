package capitulo02_condicionales.bloque01;

import java.util.Scanner;

public class Ejercicio03_NumeroParOImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El número " + num + " es par");
		}
		else {
			System.out.println("El número " + num + " es impar");
		}
		

	}

}
