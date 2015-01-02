package repositories.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import repositories.IRouteRepository;
import unitOfWork.IUnitOfWork;
import DataBaseOfShips.Employee;
import DataBaseOfShips.Route;

public class RouteRepository extends Repository<Route> implements IRouteRepository{

	public RouteRepository(Connection connection, IEntityBuilder<Route> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUpInsertQuery(Route entity) throws SQLException {
		insert.setString(1, entity.getName());
		insert.setString(2, entity.getLenght());
		insert.setString(3, entity.getTimeOfCrossing());
		insert.setInt(4, entity.getPrice());
		
	}

	@Override
	protected void setUpUpdateQuery(Route entity) throws SQLException {
		update.setString(1, entity.getName());
		update.setString(2, entity.getLenght());
		update.setString(3, entity.getTimeOfCrossing());
		update.setInt(4, entity.getPrice());
		update.setInt(5, entity.getId());
	}

	@Override
	protected String getInsertQuery() {

		return "INSERT INTO routes(name, lenght, timeOfCrossing, price) VALUES (?,?,?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "UPDATE routes SET (name, lenght, timeOfCrossing, price) = (?,?,?,?) WHERE id=?";
	}

	@Override
	protected String getTableName() {

		return "routes";
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Route> byShip(int shipId) {
		try {
			selectById.setInt(1, shipId);
			ResultSet rs = selectById.executeQuery();
			while(rs.next())
			{
				return (List<Route>) builder.build(rs);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
