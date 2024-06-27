package login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Properties properties = new Properties();
		FileInputStream input = null;

		try {
			input = new FileInputStream("C:/Users/Admin/OneDrive/Desktop/db.properties");
			properties.load(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = properties.getProperty("db.url");
		String user = properties.getProperty("db.username");
		String pass = properties.getProperty("db.password");
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try (Connection conn = DriverManager.getConnection(url, user, pass);
					PreparedStatement psmt = conn
							.prepareStatement("Select * from clients where username=? and password=?");) {
				psmt.setString(1, username);
				psmt.setString(2, password);

				ResultSet rs = psmt.executeQuery();
				if (rs.next()) {
					HttpSession session = request.getSession();
					session.setAttribute("username", username);
					response.sendRedirect("Welcome.jsp");
				} else {
					request.setAttribute("message", "Invalid username or password.");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
