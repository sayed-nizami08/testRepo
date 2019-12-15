package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtilities {
	//Creating private static obj of Connection class
		// it is used to create connection with database
		private static Connection conn;
		
		//Creating private static obj of Statement class
		//Creating private static obj of Statement class
		private static Statement stmt;
		
		// Creating private static obj of ResultSet class
		// it is used to create a resultSet to store query result;
		private static ResultSet resultSet;
		
		// create db url
		// syntax for db url conection or url String
		// jdbc:typeofdatabase://host:port/databasename
		private static String dbURL="jdbc:postgresql://localhost:5432/dvdrental";
		
		//database user username
		private static String dbUserName="postgres";
		
		//database user password;
		private static String dbPassword="123456";
		
		//sql query
		private static String dbQuery="select * from city";
		
		public static void setupConnection() {
			try {
				conn =DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		}
		
		public static void closeConnection() {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}
		
		public static ResultSet runQuery(String query) {

			try {

				stmt = conn.createStatement();
				resultSet = stmt.executeQuery(query);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return resultSet;

		}
		
		public void writeResultToCSV() {
			
		}
}


