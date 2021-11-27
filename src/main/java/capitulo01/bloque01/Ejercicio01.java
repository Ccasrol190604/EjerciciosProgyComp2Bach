package capitulo01.bloque01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); // Consigo leer del teclado
	
	     System.out.println("Introduzca un número entero: ");
	     int numEntero = sc.nextInt();
	     System.out.println("El número introducido es:" +numEntero);
	     

	     System.out.println("Introduzca un número flotante: ");
         float numFlotante = sc.nextFloat();
         System.out.println("El numero introducido es:" +numFlotante);
         

         System.out.println("Introduzca un número double: ");
         double numDouble = sc.nextDouble();
         System.out.println("El numero introducido es:" +numDouble);
         
}

}
