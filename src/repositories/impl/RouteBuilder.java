package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import DataBaseOfShips.Route;

public class RouteBuilder implements IEntityBuilder<Route>{

	@Override
	public Route build(ResultSet rs) throws SQLException {
		Route route = new Route();
		route.setId(rs.getInt("id"));
		route.setName(rs.getString("name"));
		route.setLenght(rs.getString("lenght"));
		route.setTimeOfCrossing(rs.getString("timeOfCrossing"));
		route.setPrice(rs.getInt("price"));
		return route;
	}
	

}
