package capitulo03.bloque01;

import java.util.Scanner;

public class Ejercicio02_SumaDeTantosNumerosComoIndiqueElUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0, num, repeticiones;
		
		System.out.println("Introduzca cuántos números desea incorporar a la suma: ");
		repeticiones = sc.nextInt();
		
		for (int i = 0; i < repeticiones; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			if (num > 10) {
				suma = suma + num;
			}
		}
		
		System.out.println("La suma de los números mayores de 10 es: " + suma);

	}

}
