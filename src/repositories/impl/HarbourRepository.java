package repositories.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import DataBaseOfShips.Harbour;
import DataBaseOfShips.Route;
import repositories.IHarbourRepository;
import unitOfWork.IUnitOfWork;

public class HarbourRepository extends Repository<Harbour> implements IHarbourRepository{

	public HarbourRepository(Connection connection, IEntityBuilder<Harbour> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
	}
	@Override
	protected void setUpInsertQuery(Harbour entity) throws SQLException {
		insert.setString(1, entity.getName());
		insert.setString(2, entity.getNumberOfEmployees());
		insert.setString(3, entity.getPlace());
		insert.setString(4, entity.getSize());
		
		
	}

	@Override
	protected void setUpUpdateQuery(Harbour entity) throws SQLException {
		update.setString(1, entity.getName());
		update.setString(2, entity.getNumberOfEmployees());
		update.setString(3, entity.getPlace());
		update.setString(4, entity.getSize());
		update.setInt(5, entity.getId());
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO harbours(name, numberOfEmployees, place, size) VALUES (?,?,?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "UPDATE harbours SET (name, numberOfEmployees, place, size) = (?,?,?,?) WHERE id=?";
	}

	@Override
	protected String getTableName() {
		return "harbours";
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Harbour> ofRoute(int routeId) {
		try {
			selectById.setInt(1, routeId);
			ResultSet rs = selectById.executeQuery();
			while(rs.next())
			{
				return (List<Harbour>) builder.build(rs);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
