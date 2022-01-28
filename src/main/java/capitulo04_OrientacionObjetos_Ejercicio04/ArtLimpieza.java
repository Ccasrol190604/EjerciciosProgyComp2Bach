package capitulo04_OrientacionObjetos_Ejercicio04;

public class ArtLimpieza extends Articulo {
	
	private boolean Ignifugo;

	public ArtLimpieza() {
		super();
	}

	public ArtLimpieza(String Nombre, int Codigo, float Precio, boolean Ignifugo) {
		super();
		this.Ignifugo = Ignifugo;
	}

	public boolean isIgnifugo() {
		return Ignifugo;
	}

	public void setIgnifugo(boolean ignifugo) {
		Ignifugo = ignifugo;
	}

	@Override
	public String toString() {
		return "ArtLimpieza [Nombre=" + Nombre + ", Codigo=" + Codigo + ", Precio=" + Precio + ", Ignifugo=" + Ignifugo
				+ "]";
	}

}
