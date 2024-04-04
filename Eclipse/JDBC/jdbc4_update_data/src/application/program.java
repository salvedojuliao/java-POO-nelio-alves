package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class program {

	public static void main(String[] args) {
		
		// Objetivo: atualizar o salário de um vendedor
		
		Connection conn = null;
		
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ? " // esse seria o valor novo de soma
					+ "WHERE "
					+ "(DepartmentId) = ?");
			
			st.setDouble(1, 200.00);
			st.setInt(2, 2);
		
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		}catch(SQLException e) {
			e.printStackTrace();
		} 
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
