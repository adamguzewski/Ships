package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DataBaseOfShips.*;
import repositories.IRepository;
import repositories.IShipRepository;
import unitOfWork.IUnitOfWork;

public class ShipRepository extends Repository<Ship> implements IShipRepository{

	protected ShipRepository(Connection connection, IEntityBuilder<Ship> builder, IUnitOfWork uow) {
		super(connection, builder, uow);

	}

	@Override
	public Ship byEmployee(int employeeId) {
		try {
			selectById.setInt(1, employeeId);
			ResultSet rs = selectById.executeQuery();
			while(rs.next())
			{
				return builder.build(rs);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected void setUpInsertQuery(Ship entity) throws SQLException {
		insert.setString(1, entity.getName());
		insert.setString(2, entity.getMaxCharge());
		insert.setString(3, entity.getMaxSpeed());
		insert.setString(4, entity.getNumberOfCrew());
		insert.setString(5, entity.getSize());
		insert.setString(6, entity.getType());
	}

	@Override
	protected void setUpUpdateQuery(Ship entity) throws SQLException {
		update.setString(1, entity.getName());
		update.setString(2, entity.getMaxCharge());
		update.setString(3, entity.getMaxSpeed());
		update.setString(4, entity.getNumberOfCrew());
		update.setString(5, entity.getSize());
		update.setString(6, entity.getType());
		update.setInt(7, entity.getId());
		
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO ships(name, maxCharge, maxSpeed, numberOfCrew, size, type"
				+ "VALUES(?,?,?,?,?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "UPDATE ships SET name=?, maxCharge=?, maxSpeed=?, numberOfCrew=?, size=?, type=?"
				+"WHERE id=?";
	}

	@Override
	protected String getTableName() {
		return "ships";
	}
}
