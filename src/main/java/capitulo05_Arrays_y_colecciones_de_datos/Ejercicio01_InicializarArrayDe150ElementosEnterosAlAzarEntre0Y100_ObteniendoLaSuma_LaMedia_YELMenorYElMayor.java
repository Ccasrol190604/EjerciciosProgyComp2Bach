package capitulo05_Arrays_y_colecciones_de_datos;

import java.util.Scanner;

public class Ejercicio01_InicializarArrayDe150ElementosEnterosAlAzarEntre0Y100_ObteniendoLaSuma_LaMedia_YELMenorYElMayor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[150], suma = 0, mayor = 0, menor = 0;
		float media;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " / ");
		}
		
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		System.out.println("Suma: " + suma);
		
		media = suma / (float) array.length;
		System.out.println("La media es: " + media);
		
		
			for (int i = 0; i < array.length; i++) {
				array [i] = sc.nextInt(); 
			
			if (array [i] > mayor) {
				mayor = array [i];
			}
			if (array [i] < menor) {
				menor = array [i];
			}
			System.out.println("Mayor: " + mayor + " - Menor: " + menor);
			
			
				}
			}
		}
