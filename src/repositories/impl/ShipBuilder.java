package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import DataBaseOfShips.Ship;

public class ShipBuilder implements IEntityBuilder<Ship>{

	@Override
	public Ship build(ResultSet rs) throws SQLException {
		Ship ship = new Ship();
		ship.setId(rs.getInt("id"));
		ship.setName(rs.getString("name"));
		ship.setMaxSpeed(rs.getString("maxSpeed"));
		ship.setSize(rs.getString("size"));
	
		return ship;
	}
}
