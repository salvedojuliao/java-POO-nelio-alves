package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

public class program {

	public static void main(String[] args) {
		
			Connection conn = null;
			
			Statement st = null;
			
			try {
				conn = DB.getConnection();
				
				conn.setAutoCommit(false); 
				// assim indigo que não devo confirmar a operação automaticamente
				
				st = conn.createStatement();
				
				int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
//				int x = 1;
//				if (x < 2) throw new SQLException("Fake Error");
				
				int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
				
				conn.commit(); 
				// somente após todas as operações eu indico confirmando que as transações terminaram
				
				System.out.println("rows 1 = " + rows1);
				System.out.println("rows 2 = " + rows2);
			}catch(SQLException e) {
				// aqui eu coloco uma lógica para voltar p/ a oepração
				try {
					conn.rollback();
					throw new DbException("Transacton rolled back! Caused by: " + e.getMessage());
				}catch(SQLException e1) {
					throw new DbException("Error trying to rollback! Cauded by " + e1.getMessage());
				}	
			} 
			finally {
				DB.closeStatement(st);
				DB.closeConnection();
			}
		
	}

}