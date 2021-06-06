package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class appBDUpdate {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pst = null;

		try {
			conn = DB.openConnection();

			String sql = "UPDATE user SET user=? WHERE id=?";

			pst = conn.prepareStatement(sql);

			pst.setString(1, "Isaias Miranda");
			pst.setInt(2, 1);

			int validate = pst.executeUpdate();

			if (validate > 0)
				System.out.println("Registration updated successfully!!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(pst);
			DB.closeConnection();
		}

	}

}
