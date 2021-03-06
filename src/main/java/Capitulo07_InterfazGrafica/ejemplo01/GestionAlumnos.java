package Capitulo07_InterfazGrafica.ejemplo01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class GestionAlumnos {

	private JFrame frame;
	private JTextField jtfid;
	private JTextField jtfnombre;
	private JTextField jtfapellidos;
	private JTextField jtfNIF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionAlumnos window = new GestionAlumnos();
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
	public GestionAlumnos() {
		initialize();
		mostrarPrimerAlumno();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(175, 238, 238));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setForeground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Gestión de alumnos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(15, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("id:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfid = new JTextField();
		jtfid.setEnabled(false);
		GridBagConstraints gbc_jtfid = new GridBagConstraints();
		gbc_jtfid.insets = new Insets(0, 0, 5, 0);
		gbc_jtfid.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfid.gridx = 1;
		gbc_jtfid.gridy = 1;
		frame.getContentPane().add(jtfid, gbc_jtfid);
		jtfid.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre: ");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfnombre = new JTextField();
		GridBagConstraints gbc_jtfnombre = new GridBagConstraints();
		gbc_jtfnombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfnombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfnombre.gridx = 1;
		gbc_jtfnombre.gridy = 2;
		frame.getContentPane().add(jtfnombre, gbc_jtfnombre);
		jtfnombre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfapellidos = new JTextField();
		GridBagConstraints gbc_jtfapellidos = new GridBagConstraints();
		gbc_jtfapellidos.insets = new Insets(0, 0, 5, 0);
		gbc_jtfapellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfapellidos.gridx = 1;
		gbc_jtfapellidos.gridy = 3;
		frame.getContentPane().add(jtfapellidos, gbc_jtfapellidos);
		jtfapellidos.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("NIF: ");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfNIF = new JTextField();
		GridBagConstraints gbc_jtfNIF = new GridBagConstraints();
		gbc_jtfNIF.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNIF.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNIF.gridx = 1;
		gbc_jtfNIF.gridy = 4;
		frame.getContentPane().add(jtfNIF, gbc_jtfNIF);
		jtfNIF.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setForeground(Color.BLACK);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 5;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//Botones
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarPrimerAlumno();
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarAnteriorAlumno();
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton(">>");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarUltimoAlumno();
			}
		});
		
		JButton btnNewButton_4 = new JButton(">");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarSiguienteAlumno();
			}
		});
		panel.add(btnNewButton_4);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevo();
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(GestionAlumnos.class.getResource("/tutorialJava/capitulo7_InterfazGrafica/res/nuevo.png")));
		panel.add(btnNewButton_5);
		btnNewButton_2.setIcon(new ImageIcon(GestionAlumnos.class.getResource("/tutorialJava/capitulo7_InterfazGrafica/res/guardar.png")));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar ();
			}
		});
		
		btnNewButton_6.setIcon(new ImageIcon(GestionAlumnos.class.getResource("/tutorialJava/capitulo7_InterfazGrafica/res/eliminar.png")));
		btnNewButton_6.setSelectedIcon(new ImageIcon(GestionAlumnos.class.getResource("/tutorialJava/capitulo7_InterfazGrafica/res/eliminar.png")));
		panel.add(btnNewButton_6);
	}
	
	/**
	 * 
	 */
	private void mostrarPrimerAlumno() {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno order by id limit 1");
		   
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtfnombre.setText(rs.getString("Nombre"));
				jtfapellidos.setText(rs.getString("Apellidos"));
				jtfNIF.setText(rs.getString("NIF"));
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
	private void mostrarUltimoAlumno() {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno order by id desc limit 1");
		   
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtfnombre.setText(rs.getString("Nombre"));
				jtfapellidos.setText(rs.getString("Apellidos"));
				jtfNIF.setText(rs.getString("NIF"));
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
	private void mostrarAnteriorAlumno() {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno where id < " + jtfid.getText() + " order by id desc limit 1");
		   
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtfnombre.setText(rs.getString("Nombre"));
				jtfapellidos.setText(rs.getString("Apellidos"));
				jtfNIF.setText(rs.getString("NIF"));
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
	private void mostrarSiguienteAlumno() {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno where id > " + jtfid.getText() + " order by id limit 1");
		   
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtfnombre.setText(rs.getString("Nombre"));
				jtfapellidos.setText(rs.getString("Apellidos"));
				jtfNIF.setText(rs.getString("NIF"));
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
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement();
			
			int id = siguienteIdDisponible();
			String comando = "insert into alumnos.alumno values (" + id + ", '" + jtfnombre.getText() + "', '" +
					jtfapellidos.getText() + "' , '" + jtfNIF.getText() +"')";
		
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
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			ResultSet rs = s.executeQuery ("select max(id) from alumnos.alumno");
		   
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
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			int registrosmodificados = s.executeUpdate ("update alumnos.alumno set nombre = '" + jtfnombre.getText() + "', " + 
					"apellidos = '" + jtfapellidos.getText() + "', nif = '" + jtfNIF.getText() + "' " +
					"where id = " + jtfid.getText());
		   
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
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			int registrosmodificados = s.executeUpdate ("delete from alumnos.alumno " + "where id " + jtfid.getText());
		   
			if (registrosmodificados == 1) {
				JOptionPane.showMessageDialog(null, "Eliminado correctamente");
				mostrarPrimerAlumno();
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
		this.jtfnombre.setText("");
		this.jtfapellidos.setText("");
		this.jtfNIF.setText("");
	}
}
