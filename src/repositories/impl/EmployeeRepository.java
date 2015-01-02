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

	public EmployeeRepository(Connection connection, IEntityBuilder<Employee> builder, IUnitOfWork uow) {
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
		return "INSERT INTO employees(firstName, surName, age, actualShip) VALUES (?,?,?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "UPDATE employees SET (firstName, surName, age, actualShip) = (?,?,?,?) WHERE id=?";
		}

	@Override
	protected String getTableName() {

		return "employees";
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> ofShip(int shipId) {
		try {
			selectById.setInt(1, shipId);
			ResultSet rs = selectById.executeQuery();
			while(rs.next())
			{
				return (List<Employee>) builder.build(rs);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


}
