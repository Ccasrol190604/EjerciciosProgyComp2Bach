package capitulo8_Web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FichaCentrosServlet
 */
@WebServlet("/FichaCentrosServlet")
public class FichaCentrosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String respuesta = " ";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FichaCentrosServlet() {
    	super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String tipo = request.getParameter("tipo");
		String denominacion = request.getParameter("denominacion");
		String direccion = request.getParameter("direccion");
		String poblacion = request.getParameter("poblacion");
		String provincia = request.getParameter("provincia");
		
		
		
		this.respuesta= "<!DOCTYPE html> "
				+ "<html>"
				+ "<head>"
				+ "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />"
				+ "<meta charset=\"ISO-8859-1\"> "
				+ "<title>Mi segundo servlet</title>"
				+ "</head>"
				+ "<body> "
				+ "<h1>Ficha del centro/a</h1>"
				+ "<form method='GET' action='FichaCentrosServlet'>";
		
		if (tipo != null) {
			modificar(id, tipo, denominacion, direccion, poblacion, provincia);
		}
		
		mostrarUnCentro (id);
		
		this.respuesta += "<br><button type='submit'>Enviar formulario</button></form></body>"
							+ "</html>";
		
		response.getWriter().append(this.respuesta);
		
	}

	/**
	 * 
	 */
	private void mostrarUnCentro(int id) {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			ResultSet rs = s.executeQuery ("select * from centro_educativo.centro where id = " + id);
		   
			if (rs.next() == true) { 
				this.respuesta += "<h1>Ficha del centro</h1>" +
						"<input type='hidden' name='id' value='" + id + "'>" + 
						"Tipo: <input type='text' name='tipo' value='" + rs.getString("tipo") + "'><br/>" +
						"Denominacion: <input type='text' name='denominacion' value='" + rs.getString("denominacion") + "'><br/>" + 
						"Direccion: <input type='text' name='direccion' value='" + rs.getString("direccion") + "'>" +
						"Poblacion: <input type='text' name='poblacion' value='" + rs.getString("poblacion") + "'>" +
						"Provincia: <input type='text' name='provincia' value='" + rs.getString("provincia") + "'>";
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
	private void modificar (int id, String tipo, String denominacion, String direccion, String poblacion, String provincia) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			String sql = "update centro_educativo.centro set tipo = '" + tipo + "', " + 
					"denominacion = '" + denominacion + "', " +
					"direccion = '" + direccion + "' , " +
					"poblacion = '" + poblacion + "' , " + 
					"provincia = '" + provincia + "' " +
					"where id = " + id;
			
			System.out.println(sql);
			int registrosModificados = s.executeUpdate (sql);
		   
			if (registrosModificados == 1) {
//				JOptionPane.showMessageDialog(null, "Guardado correctamente");
			}
			else {
//				JOptionPane.showMessageDialog(null, "Error al guardar");
			}
			
			// Cierre de los elementos
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
}
