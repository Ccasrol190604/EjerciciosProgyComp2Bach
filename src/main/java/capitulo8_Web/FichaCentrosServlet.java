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
		System.out.println(request.getParameter("id"));
		this.respuesta= "<!DOCTYPE html> "
				+ "<html>"
				+ "<head>"
				+ "<meta charset=\"ISO-8859-1\"> "
				+ "<title>Mi segundo servlet</title>"
				+ "</head>"
				+ "<body> ";
		
		mostrarUnCentro (Integer.parseInt(request.getParameter("id")) );
		
		this.respuesta += "</body>"
				+ "<html>";
		
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
				this.respuesta += "<h1>Ficha del centro</h1>" 
									+ "Id: " + rs.getString("id") + "</br>" 
									+ "Tipo: " + rs.getString("tipo") + "</br>"
									+ "Denominación: " + rs.getString("denominacion") + "</br>" 
									+ "Dirección: " + rs.getString("direccion") + "</br>" 
									+ "Población: " + rs.getString("poblacion") + "</br>"
									+ "Provincia: " + rs.getString("provincia") + "</br>";
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
}
