package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.techlabs.business.Account;
import com.techlabs.business.Transaction;

public class AccountRespository {
	private Connection con;

	public AccountRespository() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public boolean addToMaster(Account acc) {
		if (acc != null) {
			try {

				PreparedStatement stmt = con.prepareStatement("insert into Master values(?,?,?)");
				stmt.setString(1, acc.getName());
				stmt.setInt(2, acc.getBalance());
				stmt.setString(3, acc.getPassword());
				// ResultSet rs = stmt.executeQuery();
				int result = stmt.executeUpdate();
				System.out.println("Row Added To Master Table.");

				con.close();
				// rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			return true;
		} else {
			return false;
		}
	}

	public boolean register(Account acc) throws Exception {
		if (acc != null) {
			try {
				con.setAutoCommit(false);

				PreparedStatement stmt = con.prepareStatement("insert into Master values(?,?,?)");
				stmt.setString(1, acc.getName());
				stmt.setInt(2, acc.getBalance());
				stmt.setString(3, acc.getPassword());

				Date date = new Date();
				DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
				String strDate = dateFormat.format(date);
				PreparedStatement stmt1 = con.prepareStatement("insert into Transaction values(?,?,?,?)");
				stmt1.setString(1, acc.getName());
				stmt1.setInt(2, acc.getBalance());
				stmt1.setString(3, "Deposit");
				stmt1.setString(4, strDate);

				stmt.executeUpdate();
				stmt1.executeUpdate();
				con.commit();
				System.out.println("Row Added To Transaction Table.");
				System.out.println("Commit Transcation");

				con.close();
				// rs.close();
			} catch (Exception e) {
				con.rollback();
				System.out.println("Rolling Back Transaction");
				e.printStackTrace();
			}

			return true;
		} else {
			return false;
		}
	}

	public Account getLoginDetail(String name) {

		try {
			PreparedStatement stmt = con.prepareStatement("select * from Master where Name=?");
			stmt.setString(1, name);
			ResultSet rs = stmt.executeQuery();
			System.out.println(rs);

			Account account = null;
			while (rs.next()) {
				String username = rs.getString(1);
				int balance = rs.getInt(2);
				String password = rs.getString(3);
				account = new Account(username, balance, password);
			}
			con.close();
			rs.close();
			return account;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public boolean deposit(Account acc, int amount) throws Exception {
		if (acc != null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
			
				con.setAutoCommit(false);

				PreparedStatement stmt = con.prepareStatement("Update Master set Balance=? where Name=?");
				stmt.setInt(1, acc.getBalance() + amount);
				stmt.setString(2, acc.getName());

				Date date = new Date();
				DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
				String strDate = dateFormat.format(date);
				PreparedStatement stmt1 = con.prepareStatement("insert into Transaction values(?,?,?,?)");
				stmt1.setString(1, acc.getName());
				stmt1.setInt(2, amount);
				stmt1.setString(3, "Deposit");
				stmt1.setString(4, strDate);

				stmt.executeUpdate();
				stmt1.executeUpdate();
				con.commit();
				System.out.println("Row Added To Transaction Table.");
				System.out.println("Commit Transcation");

				// rs.close();
			} catch (Exception e) {
				con.rollback();
				System.out.println("Rolling Back Transaction");
				e.printStackTrace();
			}

			return true;
		} else {
			return false;
		}
	}
	public boolean withdraw(Account acc, int amount) throws Exception {
		if (acc != null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
			
				con.setAutoCommit(false);

				PreparedStatement stmt = con.prepareStatement("Update Master set Balance=? where Name=?");
				stmt.setInt(1, acc.getBalance() - amount);
				stmt.setString(2, acc.getName());

				Date date = new Date();
				DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
				String strDate = dateFormat.format(date);
				PreparedStatement stmt1 = con.prepareStatement("insert into Transaction values(?,?,?,?)");
				stmt1.setString(1, acc.getName());
				stmt1.setInt(2, amount);
				stmt1.setString(3, "Withdraw");
				stmt1.setString(4, strDate);

				stmt.executeUpdate();
				stmt1.executeUpdate();
				con.commit();
				System.out.println("Row Added To Transaction Table.");
				System.out.println("Commit Transcation");

			} catch (Exception e) {
				con.rollback();
				System.out.println("Rolling Back Transaction");
				e.printStackTrace();
			}

			return true;
		} else {
			return false;
		}
	}
	public List<Transaction> accountStatement(String name) throws SQLException{
		PreparedStatement statement=con.prepareStatement("select * from Transaction where name=?");
		statement.setString(1, name);
		ResultSet resultSet=statement.executeQuery();
		List<Transaction> transactionsList=new ArrayList<Transaction>();
		while(resultSet.next()) {
			Transaction transaction= new Transaction(resultSet.getString(1), resultSet.getString(3), resultSet.getInt(2), resultSet.getString(4));
			transactionsList.add(transaction);
		}
		return transactionsList;
		
	}
}
