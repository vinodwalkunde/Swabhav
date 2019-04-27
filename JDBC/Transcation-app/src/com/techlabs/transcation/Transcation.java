package com.techlabs.transcation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.techlabs.model.Customer;
import com.techlabs.model.Merchant;

public class Transcation {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost:3306/swabhav";
	static final String USER = "root";
	static final String PASS = "root";
	static Connection conn = null;
	static Statement stmt = null;
	//Customer customer,Merchant merchant,int amount
	public static void doTranscation() throws Exception {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database...");
		     conn = DriverManager.getConnection(DB_URL,USER,PASS);
		      //conn = DriverManager.getConnection("jdbc:mysql://localhost/swabhav?" + "user=root&password=root");
		      conn.setAutoCommit(false);
		      
		      PreparedStatement statement= conn.prepareStatement("Update Customer set Balance=Balance-500 where CID=101"); 
		      PreparedStatement statement1= conn.prepareStatement("Update Merchant set Balance=Balance+500 where MID=201"); 
		      statement.executeUpdate();
		      statement1.executeUpdate();
		      
		      conn.commit();
		      System.out.println("Commit Transcation");
		      
		}catch(SQLException e) {
			e.printStackTrace();
			conn.rollback();
			System.out.println("Rolling Back Transaction");
		}
		 
	}
	
}
