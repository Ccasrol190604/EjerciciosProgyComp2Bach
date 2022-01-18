package capitulo04_OrientacionObjetos;

public class Ordenador {

	int Ordenador;
	int alturacm;
	int anchuracm;
	String color;
	boolean esPortatil;
	String marca;
	
	public void ImprimePropiedades() {
		System.out.println("Las propiedades son: alturacm: " + alturacm + " / anchuracm: " + anchuracm + " / color: " + color + 
			" / esPortatil: " + esPortatil + " / marca: " + marca);
	}
}
