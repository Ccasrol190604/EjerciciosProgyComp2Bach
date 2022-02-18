package capitulo04_Ejemplo06.PrimeraVentana;

import java.awt.Canvas;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Principal {
	
	public static void main (String[] args) {
		JFrame ventana = new JFrame();
		ventana.setBounds(0, 0, 800, 600);
		
		ventana.getContentPane().setBackground(Color.decode("#2be0d4"));
		
		ventana.getContentPane().setLayout(new BorderLayout());
		
		MiCanvas canvas = new MiCanvas();
		ventana.getContentPane().add(canvas, BorderLayout.NORTH);
		ventana.getContentPane().add(canvas, BorderLayout.EAST);
		ventana.getContentPane().add(canvas, BorderLayout.WEST);
		ventana.getContentPane().add(canvas, BorderLayout.CENTER);
	
		JButton jbt = new JButton("Esto es un botón");
		ventana.getContentPane().add(jbt, BorderLayout.NORTH);
		
		ventana.setVisible(true);
	
	
	
	
	}
}
