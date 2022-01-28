package capitulo04_OrientacionObjetos_Ejercicio04;

public class Articulo {
	
	protected String Nombre;
	protected int Codigo;
	protected float Precio;
	
	public Articulo() {
		super();
	}
	
	public Articulo (String Nombre, int Codigo, float Precio) {
		super();
		this.Nombre = Nombre;
		this.Codigo = Codigo;
		this.Precio = Precio;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public int getCodigo() {
		return Codigo;
	}
	
	public void setCodigo(int Codigo) {
		this.Codigo = Codigo;
	}
	
	
	public float getPrecio() {
		return Precio;
	}
	
	public void setPrecio(float Precio) {
		this.Precio = Precio;
	}

	@Override
	public String toString() {
		return "Articulo [Nombre=" + Nombre + ", Codigo=" + Codigo + ", Precio=" + Precio + "]";
	}	

}
