package com.sathya.servlet;
import java.sql.*;
public class DatabaseUtils {

		public static Connection createConnection()
		{
			Connection connection = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
			}
			catch(ClassNotFoundException | SQLException e)
			{
				e.printStackTrace();
			}
			return connection;
	}

	}

