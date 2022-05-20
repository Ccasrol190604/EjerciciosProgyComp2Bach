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
 * Servlet implementation class ListadoDeCentrosServlet
 */
@WebServlet("/ListadoDeCentrosServlet")
public class ListadoDeCentrosServlet extends HttpServlet {
	
	String respuesta = " ";

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoDeCentrosServlet() {
}
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		mostrarTodosCentros();
		this.respuesta= "<!DOCTYPE html> "
				+ "<html>"
				+ "<head>"  
				+ "<meta charset=\"ISO-8859-1\"> "
				+ "<title>Mi segundo servlet</title>"
				+ "</head>"
				+ "<body> "
				+ "<h1>Listado de centros</h1>"
				+ "<table width= '100%' border='1'>" ;
		
		mostrarTodosCentros();
		
		this.respuesta += "</table></body>"
				+ "<html>";
		
		response.getWriter().append(this.respuesta);
		
	}
	
	/**
	 * 
	 */
	private void mostrarTodosCentros() {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
		
			ResultSet rs = s.executeQuery ("select * from centro_educativo.centro");
		   
			while (rs.next() == true) { 
				this.respuesta += "<tr>" + "<td>" + "<a href= 'FichaCentrosServlet?id=" + rs.getInt("id") + "'>" +  rs.getString("denominacion") + "</a></td>" 
										 + "<td>" + rs.getString("tipo") + "</td>" 
										 + "<td>" + rs.getString("poblacion")	+ "</td>" 
										 + "<td>" + rs.getString("provincia")	+ "</td>" 
										 + "<td>" + rs.getInt("id")	+ "</td>" 	+ "</tr>";
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