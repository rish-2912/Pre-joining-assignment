package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCDemo {

	public static void main(String[] args) {
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
		String username = properties.getProperty("db.username");
		String password = properties.getProperty("db.password");
		try (Connection conn = DriverManager.getConnection(url, username, password);
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("Select * from student");) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			while (rs.next()) {
				System.out.println("ROLLNO: " + rs.getInt("ROLLNO") + " NAME: " + rs.getString("NAME") + " MARKS: "
						+ rs.getInt("MARKS"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
