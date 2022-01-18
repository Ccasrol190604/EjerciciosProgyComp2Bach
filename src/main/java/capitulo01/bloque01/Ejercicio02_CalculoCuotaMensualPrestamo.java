package capitulo01.bloque01;

import java.util.Scanner;

public class Ejercicio02_CalculoCuotaMensualPrestamo {

	public static void main(String[] args) {
		int meses;
		float capital, euribor, diferencial;
		Scanner sc = new Scanner(System.in);
		float interesAnual, interesMensual, auxiliar, cuotaMensual;
		
		System.out.println("Introduzca capital: ");
		capital = sc.nextFloat();
		System.out.println("El capital es: " + capital);
		
		System.out.println("Introduzca meses: ");
		meses = sc.nextInt();
		System.out.println("Los meses son: " + meses);
		
		System.out.println("Introduzca eurilor: ");
		euribor = sc.nextFloat();
		System.out.println("El eurilor es: " + euribor);
		
		System.out.println("Introduzca diferencial: ");
		diferencial = sc.nextFloat();
		System.out.println("El ciferencial es: " + diferencial);
		
		// Comenzamos los cálculos
		interesAnual = euribor + diferencial;
		interesMensual = interesAnual /12 /100;
		auxiliar = (float) Math.pow(1 + interesMensual, meses);
		cuotaMensual = capital * (interesMensual * auxiliar) / (auxiliar -1);
		System.out.println("Debes pagar " + cuotaMensual + "euros cada mes");
		
		
		
		
	}

}
