package capitulo02_condicionales.bloque02;


import java.util.Scanner;

public class Ejercicio04_CambioEnMonedas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidadaPagar, cantidadPagada, cantidadaDevolver;
		
		System.out.println("Introduzca la cantidad a pagar: ");
		cantidadaPagar = sc.nextInt();
		
		System.out.println("Introduzca la cantidad pagada: ");
		cantidadPagada = sc.nextInt();
		
		cantidadaDevolver = cantidadPagada - cantidadaPagar;
		
		System.out.println((cantidadaDevolver / 100) + " monedas de 100");
			cantidadaDevolver = cantidadaDevolver % 100;
		System.out.println((cantidadaDevolver / 50) + " monedas de 50");
			cantidadaDevolver = cantidadaDevolver % 50;
		System.out.println((cantidadaDevolver / 25) + " monedas de 25");
			cantidadaDevolver = cantidadaDevolver % 25;
		System.out.println((cantidadaDevolver / 5) + " monedas de 5");
			cantidadaDevolver = cantidadaDevolver % 5;
		System.out.println(cantidadaDevolver + " monedas de 1");
		
		
		
		
	}

}
