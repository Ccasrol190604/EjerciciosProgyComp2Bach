package capitulo04_Ejemplo06.SegundaVentana;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MiCanvas extends Canvas {
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
	g.setColor(Color.BLACK);
	g.fillRect(100, 150, 100, 75);
	
	g.setColor(Color.BLUE);
	g.fillRect(200, 100, 150, 25);
	
	g.setColor(Color.RED);
	g.fillOval(300, 300, 100, 100);
	
	g.setColor(Color.MAGENTA);
	g.fillOval(300, 300, 100, 100);
	
	g.setColor(Color.DARK_GRAY);
	int x[] = new int[] {150, 200, 300};
	int y[] = new int[] {150, 200, 600};
	g.fillPolygon(x, y, 3);
	
	g.setColor(Color.GREEN);
	x = new int[] {150, 200, 200};
	y= new int[] {150, 200, 500};
	g.fillPolygon(x, y, 6);
	

	}

}
