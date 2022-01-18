package capitulo04_OrientacionObjetos;

public class Ejercicio01_InstanciarOrdenadorJava {

	public static void main(String[] args) {
		Ordenador java = new Ordenador();
		
		java.setAlturacm(40);
		java.setAnchuracm(60);
		java.setcolor("negro");
		java.setEsPortatil("esPortatil");
		java.setMarca("Fujitsu");
		
		System.out.println(java.toString());
	}

}
