package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DataBaseOfShips.User;
import repositories.IRepository;
import unitOfWork.IUnitOfWork;

public class UserRepository extends Repository<User>{

	protected UserRepository(Connection connection, IEntityBuilder<User> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUpInsertQuery(User entity) throws SQLException {
		insert.setString(1, entity.getLogin());
		insert.setString(2, entity.getPassword());
		
	}

	@Override
	protected void setUpUpdateQuery(User entity) throws SQLException {
		update.setString(1, entity.getLogin());
		update.setString(2, entity.getPassword());
		update.setInt(3, entity.getId());
		
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO users(login, password) VALUES (?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "UPDATE users SET (login password)= (?,?) WHERE id = ?";
	}

	@Override
	protected String getTableName() {
		return "users";
	}
	

	
}
