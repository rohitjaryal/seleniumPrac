package utility.seleniumPraC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlHandler {
	public static void main(String[] args) {
		fetchResultFromMysql();
	}

	public static void fetchResultFromMysql() {
		System.out.println("Initialize");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// jdbc:mysql://localhost:3306/EMPLOYEE

			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement
					.executeQuery("SELECT * FROM testdb.tb1");
			while (resultSet.next()) {
				// System.out.println(“EMPLOYEE NAME:”+
				// resultSet.getString(“EMPNAME”));
				System.out.println("Employee name"
						+ resultSet.getString("ename") + "::department"
						+ resultSet.getString("department"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
