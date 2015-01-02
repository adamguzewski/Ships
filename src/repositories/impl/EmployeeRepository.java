package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DataBaseOfShips.Employee;
import DataBaseOfShips.Ship;
import repositories.IEmployeeRepository;
import repositories.IRepository;
import unitOfWork.IUnitOfWork;


public class EmployeeRepository extends Repository<Employee> implements IEmployeeRepository{

	protected EmployeeRepository(Connection connection, IEntityBuilder<Employee> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUpInsertQuery(Employee entity) throws SQLException {
		insert.setString(1, entity.getFirstName());
		insert.setString(2, entity.getSurName());
		insert.setString(3, entity.getAge());
		insert.setString(4, entity.getActualShip());

	}

	@Override
	protected void setUpUpdateQuery(Employee entity) throws SQLException {
		update.setString(1, entity.getFirstName());
		update.setString(2, entity.getSurName());
		update.setString(3, entity.getAge());
		update.setString(4, entity.getActualShip());
		update.setInt(5, entity.getId());
	}

	@Override
	protected String getInsertQuery() {
		return null;
	}

	@Override
	protected String getUpdateQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getTableName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> ofShip(int shipId) {
		// TODO Auto-generated method stub
		return null;
	}


}
