package model.dao;

import java.util.List;

import model.entities.User;

public interface UserDao {

	void inserir(User user);

	void update(User user);

	void deleteById(Integer id);

	User findById(Integer id);

	List<User> findAll();

}
