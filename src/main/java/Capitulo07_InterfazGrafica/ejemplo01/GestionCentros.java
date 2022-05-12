package Capitulo07_InterfazGrafica.ejemplo01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;

public class GestionCentros {

	private JFrame frame;
	private JTextField jtfid;
	private JTextField jtftipo;
	private JTextField jtfdenominacion;
	private JTextField jtfdireccion;
	private JTextField jtfpoblacion;
	private JTextField jtfprovincia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionCentros window = new GestionCentros();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestionCentros() {
		initialize();
		mostrarPrimerCentro();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(175, 238, 238));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel_6 = new JLabel("GESTIÓN CENTROS");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.gridwidth = 2;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 0;
		frame.getContentPane().add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("id");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		jtfid = new JTextField();
		jtfid.setEnabled(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		frame.getContentPane().add(jtfid, gbc_textField);
		jtfid.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtftipo = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		frame.getContentPane().add(jtftipo, gbc_textField_1);
		jtftipo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Denominación");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfdenominacion = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		frame.getContentPane().add(jtfdenominacion, gbc_textField_2);
		jtfdenominacion.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Dirección");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfdireccion = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 4;
		frame.getContentPane().add(jtfdireccion, gbc_textField_3);
		jtfdireccion.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Población");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 5;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfpoblacion = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 5;
		frame.getContentPane().add(jtfpoblacion, gbc_textField_4);
		jtfpoblacion.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Provincia");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 6;
		frame.getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfprovincia = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 6;
		frame.getContentPane().add(jtfprovincia, gbc_textField_5);
		jtfprovincia.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 7;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		// BOTONES
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarPrimerCentro();
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarAnteriorCentro();
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(">");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarSiguienteCentro();
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(">>");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarUltimoCentro();
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			nuevo();}
		});
		btnNewButton_4.setIcon(new ImageIcon(GestionCentros.class.getResource("/tutorialJava/capitulo7_InterfazGrafica/res/nuevo.png")));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			guardar();}
		});
		btnNewButton_5.setIcon(new ImageIcon(GestionCentros.class.getResource("/tutorialJava/capitulo7_InterfazGrafica/res/guardar.png")));
		panel.add(btnNewButton_5);		
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar();
			}
		});
	
		btnNewButton_6.setIcon(new ImageIcon(GestionCentros.class.getResource("/tutorialJava/capitulo7_InterfazGrafica/res/eliminar.png")));
		panel.add(btnNewButton_6);
	}
	
	/**
	 * 
	 */
	private void mostrarPrimerCentro() {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			ResultSet rs = s.executeQuery ("select * from centro_educativo.centro order by id limit 1");
		   
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo.setText(rs.getString("Tipo"));
				jtfdenominacion.setText(rs.getString("Denominacion"));
				jtfdireccion.setText(rs.getString("Direccion"));
				jtfpoblacion.setText(rs.getString("Poblacion"));
				jtfprovincia.setText(rs.getString("Provincia"));
			}
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	private void mostrarUltimoCentro() {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			ResultSet rs = s.executeQuery ("select * from centro_educativo.centro order by id desc limit 1");
		   
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo.setText(rs.getString("Tipo"));
				jtfdenominacion.setText(rs.getString("Denominacion"));
				jtfdireccion.setText(rs.getString("Direccion"));
				jtfpoblacion.setText(rs.getString("Poblacion"));
				jtfprovincia.setText(rs.getString("Provincia"));
			}
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	private void mostrarAnteriorCentro() {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			ResultSet rs = s.executeQuery ("select * from centro_educativo.centro where id < " + jtfid.getText() + " order by id desc limit 1");
		   
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo.setText(rs.getString("Tipo"));
				jtfdenominacion.setText(rs.getString("Denominacion"));
				jtfdireccion.setText(rs.getString("Direccion"));
				jtfpoblacion.setText(rs.getString("Poblacion"));
				jtfprovincia.setText(rs.getString("Provincia"));
			}
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	private void mostrarSiguienteCentro() {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			ResultSet rs = s.executeQuery ("select * from centro_educativo.centro where id > " + jtfid.getText() + " order by id limit 1");
		   
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo.setText(rs.getString("Tipo"));
				jtfdenominacion.setText(rs.getString("Denominacion"));
				jtfdireccion.setText(rs.getString("Direccion"));
				jtfpoblacion.setText(rs.getString("Poblacion"));
				jtfprovincia.setText(rs.getString("Provincia"));
			}
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	private void guardar() {
		if (jtfid.getText().equals("0")) {
			insertar();
		}
		else {
			modificar();
		}
	}
	
	/**
	 * 
	 */	
	private void insertar() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement();
			
			int id = siguienteIdDisponible();
			String comando = "insert into centro_educativo.centro values (" + id + ", '" + jtftipo.getText() + "', '" +
					jtfdenominacion.getText() + "' , '" + jtfdireccion.getText() + "' , '" + jtfpoblacion.getText() + "' , '" 
					+ jtfprovincia.getText() + "')";
		
			int registrosmodificados = s.executeUpdate (comando);
		   
			if (registrosmodificados == 1) {
				jtfid.setText("" + id);
				JOptionPane.showMessageDialog(null, "Guardado correctamente");
			}
			else {
				JOptionPane.showMessageDialog(null, "Error al guardar");
			}
				
			s.close();
			conexion.close();}

		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	private int siguienteIdDisponible() {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			ResultSet rs = s.executeQuery ("select max(id) from centro_educativo.centro");
		   
			if (rs.next() == true) { 
				return rs.getInt(1) + 1;
			}
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return -1;
	}
	
	/**
	 * 
	 */
	private void modificar() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			int registrosmodificados = s.executeUpdate ("update centro_educativo.centro set tipo = '" + jtftipo.getText() + "', " + 
					"denominacion = '" + jtfdenominacion.getText() + "', direccion = '" + jtfdireccion.getText() + 
					"', poblacion = '" + jtfpoblacion.getText() + "', provincia = '" + jtfprovincia.getText() + "' " +
					" where id = " + jtfid.getText());
		   
			if (registrosmodificados == 1) {
				JOptionPane.showMessageDialog(null, "Guardado correctamente");
			}
			else {
				JOptionPane.showMessageDialog(null, "Error al guardar");
			}
				
			s.close();
			conexion.close();}

		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * 
	 */	
	private void eliminar() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			int registrosmodificados = s.executeUpdate ("delete from centro_educativo.centro " + "where id = " + jtfid.getText());
		   
			if (registrosmodificados == 1) {
				JOptionPane.showMessageDialog(null, "Eliminado correctamente");
				mostrarPrimerCentro();
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Error al eliminar");
			}
				
			s.close();
			conexion.close();}

		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	private void nuevo() {
		this.jtfid.setText("0");
		this.jtftipo.setText("");
		this.jtfdenominacion.setText("");
		this.jtfdireccion.setText("");
		this.jtfpoblacion.setText("");
		this.jtfprovincia.setText("");
	}

}
