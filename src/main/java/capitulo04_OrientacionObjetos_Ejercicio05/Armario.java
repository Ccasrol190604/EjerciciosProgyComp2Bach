package capitulo04_OrientacionObjetos_Ejercicio05;

public class Armario extends Mueble{

private int NumeroPuertas;
	
	public Armario() {
		super();
	}

	public Armario (String Color,String TipoMadera, int NumeroPuertas) {
		super();
		this.NumeroPuertas = NumeroPuertas;
		}

	public int getNumeroPuertas() {
		return NumeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		NumeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return "Armario [Color=" + Color + ", TipoMadera=" + TipoMadera + ", NumeroPuertas=" + NumeroPuertas + "]";
	}
	
	}


