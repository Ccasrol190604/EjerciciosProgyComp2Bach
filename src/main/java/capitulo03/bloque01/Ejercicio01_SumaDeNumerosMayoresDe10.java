package capitulo03.bloque01;

import java.util.Scanner;

public class Ejercicio01_SumaDeNumerosMayoresDe10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0, num;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			if (num > 10) {
				suma = suma + num;
			}
		}
		
		System.out.println("La suma de los números mayores de 10 es: " + suma);
		

	}

}
