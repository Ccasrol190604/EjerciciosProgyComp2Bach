package capitulo05.bloque04;

import java.util.Scanner;

public class Ejercicio03_EliminarElementosDelArray {

	public static void main(String[] args) {
		int array[] = new int[10];
		int posicionAEliminar;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Ejercicio02_TresArrays.obtenerNumeroAlAzar();
		}
		
		Ejercicio02_TresArrays.muestraArray(array);
		
		posicionAEliminar = pideEnteroAlUsuario();
		
		for (int i = posicionAEliminar; i < array.length; i++) {
			array[i-1] = array[i];
		}
		
		array[array.length - 1] = Ejercicio02_TresArrays.obtenerNumeroAlAzar();
		
		Ejercicio02_TresArrays.muestraArray(array);
		
	}
		
		public static int pideEnteroAlUsuario() {
			Scanner sc = new Scanner(System.in);
			int entero;
			System.out.println("Introduzca un entero: ");
			entero = sc.nextInt();
			return entero;
		
	}

}
