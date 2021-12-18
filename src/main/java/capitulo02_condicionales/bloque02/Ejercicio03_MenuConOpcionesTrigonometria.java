package capitulo02_condicionales.bloque02;

import java.util.Scanner;

public class Ejercicio03_MenuConOpcionesTrigonometria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int opcion;
		
		System.out.println("Menú de la calculadora");
		System.out.println("\n0.- Salir");
		System.out.println("1.- Hipotenusa de un triángulo rectángulo");
		System.out.println("2.- Superficie de un círculo");
		System.out.println("3.- Perímetro de una circunferencia");
		System.out.println("4.- Área de un rectángulo");
		System.out.println("5.- Área de un triángulo");
		System.out.println("\nIntroduzca opción: ");
			opcion = sc.nextInt();
			
		switch (opcion) {
		case 0: System.out.println("Adiós");
		case 1: System.out.println("Introduzca el primer cateto: ");
					num1 = sc.nextInt();
				System.out.println("Introduzca el segundo cateto:");
					num2 = sc.nextInt();
				System.out.println("La hipotenusa es: " + Math.hypot(num1, num2));
		
		case 2: System.out.println("Introduzca el radio: ");
					num1 = sc.nextInt();
				System.out.println("La superficie es: " + (Math.PI * num1 * num1));
		
		case 3: System.out.println("Introduzca el radio: ");
					num1 = sc.nextInt();
				System.out.println("La superficie es: " + (2 * Math.PI * num1));
		
		case 4: System.out.println("Introduzca la base: ");
		 			num1 = sc.nextInt();
		 		System.out.println("Introduzca la altura: ");
		 		 	num2 = sc.nextInt();
		 		 System.out.println("El área es : " + (num1 * num2));
		
		case 5: System.out.println("Introduzca la base: ");
					num1 = sc.nextInt();
				System.out.println("Introduzca la altura: ");
					num2 = sc.nextInt();
				System.out.println("El área es: " + (num1 * num2 / 2));		
		}

	}

}
