package capitulo04_OrientacionObjetos_Ejercicio04;

public class ArtComestible extends Articulo {
	
	private int FechaCaducidad;

	public ArtComestible() {
		super();
	}

	public ArtComestible(String Nombre, int Codigo, float Precio, int FechaCaducidad) {
		super();
		this.FechaCaducidad = FechaCaducidad;
	}

	public int getFechaCaducidad() {
		return FechaCaducidad;
	}

	public void setFechaCaducidad(int fechaCaducidad) {
		FechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "ArtComestible [Nombre=" + Nombre + ", Codigo=" + Codigo + ", Precio=" + Precio + ", FechaCaducidad="
				+ FechaCaducidad + "]";
	}	

}
