package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import DataBaseOfShips.Harbour;

public class HarbourBuilder implements IEntityBuilder<Harbour>{

	@Override
	public Harbour build(ResultSet rs) throws SQLException {
		Harbour harbour = new Harbour();
		harbour.setId(rs.getInt("id"));
		harbour.setName(rs.getString("name"));
		harbour.setPlace(rs.getString("place"));
		harbour.setNumberOfEmployees(rs.getString("numberOfEmployees"));
		return harbour;
	}

}
