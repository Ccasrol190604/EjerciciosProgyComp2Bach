package capitulo04_OrientacionObjetos_Ejercicio05;

public class Mueble {

	protected String Color;
	protected String TipoMadera;
	
	
	public Mueble() {
		super();
	}
	
	public Mueble (String Color, String TipoMadera) {
		super();
		this.Color = Color;
		this.TipoMadera = TipoMadera;
		
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getTipoMadera() {
		return TipoMadera;
	}

	public void setTipoMadera(String tipoMadera) {
		TipoMadera = tipoMadera;
	}

	@Override
	public String toString() {
		return "Mueble [Color=" + Color + ", TipoMadera=" + TipoMadera + ", getColor()=" + getColor()
				+ ", getTipoMadera()=" + getTipoMadera() + "]";
	}
	
}


