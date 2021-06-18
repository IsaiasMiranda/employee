package app;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.UserDao;
import model.entities.User;

public class app {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o ID do usuário: ");
		int id = sc.nextInt();

		UserDao userDao = DaoFactory.createUserDao();

		User user = userDao.findById(id);

		if (user == null)
			System.out.println("Usuário não encontrado!!");
		else
			System.out.println(user);

	}

}
