package org.ncu.springwebapp3.database;

import java.sql.*;
import java.util.*;

class Sql {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aadhar_veri", "root", "Vijay#3366");
		con.setAutoCommit(false);
		PreparedStatement stm = con.prepareStatement("INSERT into person values(?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id. : ");
		int ido = sc.nextInt();
		stm.setInt(1, ido);
		System.out.println("Enter emp-name : ");
		String emp_name = sc.next();
		stm.setString(2, emp_name);

		System.out.println("Enter emp-Salary : ");
		int emp_sal = sc.nextInt();
		stm.setInt(3, emp_sal);
		System.out.println("Are you sure about the details?(1/0) ");
		int choice = sc.nextInt();
		if (choice == 1) {
			int a = stm.executeUpdate();
			con.commit();
			if (a != 0)
				System.out.println("Updated Successfully!!");
			else
				System.out.println("Not Updated");
		} else
			con.rollback();
	}
}
