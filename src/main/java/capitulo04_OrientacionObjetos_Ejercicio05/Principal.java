package capitulo04_OrientacionObjetos_Ejercicio05;

import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcionElegida;
		
		do {
			opcionElegida = menu();
			
			switch (opcionElegida) {
			case 1: // 
				Silla silla = new Silla();
				
				System.out.println("Introduzca el color: ");
				silla.setColor(sc.next());
				
				System.out.println("Introduzca el tipo de madera: ");
				silla.setTipoMadera(sc.next());
				
				System.out.println("Introduzca el número de patas: ");
				silla.setNumeroPatas(sc.nextInt());
				
				System.out.println("Silla creada: " + silla.toString());
				
				
			case 2: 
				Armario armario = new Armario();
				
				System.out.println("Introduzca el color: ");
				armario.setColor(sc.next());
				
				System.out.println("Introduzca el tipo de madera: ");
				armario.setTipoMadera(sc.next());
				
				System.out.println("Introduzca el número de puertas: ");
				armario.setNumeroPuertas(sc.nextInt());
				
				System.out.println("Armario creado: " + armario.toString());
				
			}

			} while (opcionElegida != 0);
	}

		
		/**
		 * 
		 * @return
		 */
		public static int menu () {
			int opcion;
			Scanner sc = new Scanner(System.in);
			
			String textoMenu = "\n\n\tMENÚ" +
					"\n0.- Salir" + 
					"\n1.- Crear Silla" + 
					"\n2.- Crear Armario";
			
			System.out.println(textoMenu);
			opcion = sc.nextInt();
			return opcion;		
		}
	}