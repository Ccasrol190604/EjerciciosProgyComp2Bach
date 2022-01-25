package capitulo04_OrientacionObjetos;

public class Ordenador {

	private int Ordenador;
	private int alturacm;
	private int anchuracm;
	private String color;
	private int esPortatil;
	private String marca;
	
	public String toString() {
		return "Las propiedades son: alturacm: " + alturacm + " / anchuracm: " + anchuracm + " / color: " + color + 
			" / esPortatil: " + esPortatil + " / marca: " + marca;
	}
	
	public void setAlturacm (int newAlturacm) {
		alturacm = newAlturacm;
	}
	
	public int getAlturacm () {
		return alturacm;
	}
	
	public void setAnchuracm (int newAnchuracm) {
		anchuracm = newAnchuracm;
	}
	
	public int getAnchuracm () {
		return anchuracm;
	}
	
	public void setcolor (String string) {
		color = string;
	}
	
	public String getcolor () {
		return color;
	}
	
	public void setEsPortatil (int newEsPortatil) {
		esPortatil = newEsPortatil;
	}
	
	public int getesPortatil () {
		return esPortatil;
	}
	
	public void setMarca (String string) {
		marca = string;
	}
	
	public String getmarca () {
		return marca;
	}

	public void setEsPortatil(String string) {
		
		
	}
}
