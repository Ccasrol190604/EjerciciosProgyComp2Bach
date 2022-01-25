package capitulo04_OrientacionObjetos.Ejercicio03;

public class Mineral {
	

		protected float Dureza();
		protected  String Color();
		
		public Mineral() {
		super();
		}
		
		public Mineral (float Dureza, String Color) {
			super();
			this.Dureza = Dureza;
			this.Color = Color;
  		}
		
		public float getDureza() {
			return Dureza;
		}
		
		public void setDureza(float Dureza) {
			this.Dureza = Dureza;
		}
		
		public String getColor() {
			return Color;
		}
		
		public void Color(String Color) {
			this.Color = Color;
		}
		@Override
		public String toString() {
			return "Mineral [Dureza=" + Dureza() + ", Color=" + Color() + "]";
		}
		
		
		
		
		
		
		

}
	


