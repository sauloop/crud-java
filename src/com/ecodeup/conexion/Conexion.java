package com.ecodeup.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.SQLException;
//import javax.sql.DataSource;
//import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class Conexion {

//	private static BasicDataSource dataSource = null;
//
//	private static DataSource getDataSource() {
//		if (dataSource == null) {
//			dataSource = new BasicDataSource();
//			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//			dataSource.setUsername("root");
//			dataSource.setPassword("");
//			dataSource.setUrl("jdbc:mysql://localhost:3306/crud");
//			dataSource.setInitialSize(20);
//			dataSource.setMaxIdle(15);
//			dataSource.setMaxTotal(20);
//			dataSource.setMaxWaitMillis(5000);
//		}
//		return dataSource;
//	}
//
//	public static Connection getConnection() throws SQLException {
//		return getDataSource().getConnection();
//	}

	public static Connection getConnection() {

		// Dev

		String url = "jdbc:mysql://localhost:3306/crud";
		String user = "root";
		String pass = "";

		// Prod

//		String url = "jdbc:mysql://r42ii9gualwp7i1y.chr7pe7iynqr.eu-west-1.rds.amazonaws.com:3306/lmupva5bdjr1mdw9";
//		String user = "wbbd4ix2tkuhv33q";
//		String pass = "syz56f5pn4im9fe1";

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
}
