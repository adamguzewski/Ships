package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import DataBaseOfShips.Employee;

public class EmployeeBuilder implements IEntityBuilder<Employee>{

	@Override
	public Employee build(ResultSet rs) throws SQLException {
		Employee employee = new Employee();
		employee.setId(rs.getInt("id"));
		employee.setFirstName(rs.getString("firstName"));
		employee.setSurName(rs.getString("surName"));
		employee.setActualShip(rs.getString("actualShip"));
		employee.setAge(rs.getString("age"));
		return employee;
	}

}
