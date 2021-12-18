package capitulo03.bloque04;

import java.util.Scanner;

public class Ejercicio3_ImprimirTablaDeMultiplicarDel1Al15BucleDo_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int Multiplicando;
		
		System.out.println("Tabla del 1");
		Scanner valor1 = new Scanner (System.in);
		Multiplicando = valor1.nextInt();
		
		int multiplicador = 1;
		do {System.out.println(Multiplicando + " X " + multiplicador + " = " + Multiplicando * multiplicador);
			multiplicador += 1;
		} while (multiplicador<=10);
		
		

	}

}
