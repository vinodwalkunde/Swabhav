package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Department;

public class DepartmentRepository {

	private static List<Department> deptList;
	private Connection con;

	public DepartmentRepository() throws SQLException {
		deptList = new ArrayList<Department>();
		// con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav",
		// "root", "root");

	}

	public boolean addToDept(Department dept) {
		if (dept != null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
				PreparedStatement stmt = con.prepareStatement("insert into dept values(?,?,?)");
				stmt.setString(1, dept.getDeptno());
				stmt.setString(2, dept.getDname());
				stmt.setString(3, dept.getLocation());
				// ResultSet rs = stmt.executeQuery();
				int result = stmt.executeUpdate();
				System.out.println("Row Added To Deparment Table.");

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

	public List<Department> getList() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from dept");
			while (rs.next()) {
				String deptNo = rs.getString(1);
				String deptName = rs.getString(2);
				String location = rs.getString(3);
				Department department = new Department(deptNo, deptName, location);
				deptList.add(department);
			}

			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return deptList;
	}

	public void deleteDept(String deptNo) {
		try {
//		Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
			String sql = "DELETE FROM dept WHERE DEPTNO = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, deptNo);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateDept(String deptNo) {
		try {
//		Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
			String sql = "UPDATE  FROM dept WHERE DEPTNO = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, deptNo);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	public Department getDeptNo(String deptNo) {
//		System.out.println("reach here");
//		try {
////			Class.forName("com.mysql.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
//			PreparedStatement stmt = con.prepareStatement(" select * from dept where DEPTNO = "+deptNo+";");
//			System.out.println(" select * from dept where DEPTNO = "+deptNo);
//			ResultSet rs = stmt.executeQuery();
//			System.out.println(rs.getString("DEPTNO")+rs.getString("DNAME"));
//			con.close();
//			rs.close();
//			return  (Department) rs;
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
	
	public Department getDeptNo(String deptNo) {
		 ResultSet rs = null;
		    PreparedStatement pstmt = null;
		    try {
		    	Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
		      String query = "select DEPTNO, DNAME, LOC from dept where deptno = ?";

		      pstmt = conn.prepareStatement(query); // create a statement
		      pstmt.setString(1, deptNo); // set input parameter
		      rs = pstmt.executeQuery();
		      System.out.println(rs.toString());
		      // extract data from the ResultSet
		      while (rs.next()) {
		        String dbDeptNumber = rs.getString(1);
		        String dbDeptName = rs.getString(2);
		        String dbDeptLocation = rs.getString(3);
		        System.out.println(dbDeptNumber + "\t" + dbDeptName + "\t" + dbDeptLocation);
		        return new Department(dbDeptNumber ,dbDeptName , dbDeptLocation);
		      }
		      
		      rs.close();
		        pstmt.close();
		        conn.close();
		    } catch (Exception e) {
		      e.printStackTrace();
		    } finally {
		    }
			return null;
		  }
		
	

}