package capitulo05.bloque02;

import java.util.Scanner;

public class Ejercicio03_ArrayDe150ElementosMultiplicadosPorUnNumeroDadoPorElUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int array[] = new int[150];
	int multiplicación = 0, num;
	
	for (int i = 0; i < array.length; i++) {
		array[i] = (int) Math.round(Math.random() * 100);
	}
	
	
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] + " / ");
		}
	
	System.out.println("\nIntroduzca el número por el que desea multiplicar: ");
	num = sc.nextInt();
	
	for (int i = 0; i < array.length; i++) {
	System.out.print(array [i] * num + " / ");
		}
	
	}

}
