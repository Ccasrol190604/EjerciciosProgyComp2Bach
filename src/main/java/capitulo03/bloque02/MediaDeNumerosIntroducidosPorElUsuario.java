package capitulo03.bloque02;

import java.util.Scanner;

public class MediaDeNumerosIntroducidosPorElUsuario {

	public static void main(String[] args) {
		int suma = 0, num, repeticiones;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca cuántos números desea incorporar a la suma: ");
		repeticiones = sc.nextInt();
		
		for (int i = 0; i < repeticiones; i++) {
			System.out.println("Introduzca un número");
			num = sc.nextInt();
			if (num > 0) {
				suma = suma + num;
			}
		}
		
        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("La media de la suma es: " + suma / repeticiones);
	}

}
