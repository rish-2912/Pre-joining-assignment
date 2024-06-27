package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CallableDemo {

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
				CallableStatement cst = conn.prepareCall("call insertpro(?,?,?)");) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cst.setInt(1, 4);
			cst.setString(2, "Ayush");
			cst.setInt(3, 38);

			cst.execute();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
