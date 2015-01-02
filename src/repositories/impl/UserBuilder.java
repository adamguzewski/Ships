package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import DataBaseOfShips.User;

public class UserBuilder implements IEntityBuilder<User>{

	@Override
	public User build(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setLogin(rs.getString("login"));
		user.setPassword(rs.getString("password"));
		return user;
	}
	

}
