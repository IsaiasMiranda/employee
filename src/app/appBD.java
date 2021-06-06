package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbException;

public class appBD {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pst = null;

		try {
			conn = DB.openConnection();

			pst = conn.prepareStatement("INSERT INTO user (user, email) VALUES (?, ?)");

			pst.setString(1, "Fabio Miranda");
			pst.setString(2, "fb-naval@gmail.com");

			int validate = pst.executeUpdate();

			if (validate > 0)
				System.out.println("Done!");
			
		} catch (SQLException e) {
			//throw new DbException("Email já cadastrado!!");
			System.out.println("Email já cadastrado!!");
		}
		finally {
			DB.closeStatement(pst);
			DB.closeConnection();
		}
	}

}
