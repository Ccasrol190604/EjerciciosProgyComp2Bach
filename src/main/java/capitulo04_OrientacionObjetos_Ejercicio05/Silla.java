package capitulo04_OrientacionObjetos_Ejercicio05;

public class Silla extends Mueble{
	
	private int NumeroPatas;
	
	public Silla() {
		super();
	}

	public Silla (String Color,String TipoMadera, int NumeroPatas) {
		super();
		this.NumeroPatas = NumeroPatas;
		
		}

	public int getNumeroPatas() {
		return NumeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		NumeroPatas = numeroPatas;
	}

	@Override
	public String toString() {
		return "Silla [Color=" + Color + ", TipoMadera=" + TipoMadera + ", NumeroPatas=" + NumeroPatas + "]";
	}
	
	
}