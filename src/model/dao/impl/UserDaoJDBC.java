package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DbException;
import model.dao.UserDao;
import model.entities.User;

public class UserDaoJDBC implements UserDao {

	private static Connection conn;

	public UserDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void inserir(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findById(Integer id) {
		PreparedStatement pst = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM ismtech.user\n" 
						+ "	WHERE ismtech.user.id = ?";

		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			
			rs = pst.executeQuery();

			if (rs.next()) {
				User user = carregarUser(rs);

				return user;
			}
			
			return null;

		} catch (SQLException e) {
			throw new DbException("Erro: " + e.getMessage());
		}

	}

	private User carregarUser(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setNome(rs.getString("user"));
		user.setEmail(rs.getString("email"));

		return user;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
