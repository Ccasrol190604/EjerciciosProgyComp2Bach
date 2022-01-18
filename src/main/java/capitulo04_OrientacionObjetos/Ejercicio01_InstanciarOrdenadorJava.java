package capitulo04_OrientacionObjetos;

public class Ejercicio01_InstanciarOrdenadorJava {

	public static void main(String[] args) {
		Ordenador java = new Ordenador();
		
		java.alturacm = 40;
		java.anchuracm= 60;
		java.color = "negro";
		java.esPortatil = "sobremesa" != null ;
		java.marca = "Fujitsu";
		
		java.ImprimePropiedades();
	}

}
