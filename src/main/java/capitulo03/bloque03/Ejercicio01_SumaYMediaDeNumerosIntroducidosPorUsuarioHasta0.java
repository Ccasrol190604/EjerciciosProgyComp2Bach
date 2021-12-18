package capitulo03.bloque03;

import java.util.Scanner;

public class Ejercicio01_SumaYMediaDeNumerosIntroducidosPorUsuarioHasta0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1, suma = 0;
		float media = 0;
		
		for (int i = 0; num != 0; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			suma += num;
			
			if (num != 0) {
				media = suma / (float) (i + 1);
			}
		}
		
		System.out.println("La media vale: " + media);
	}

}
