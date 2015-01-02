package repositories;

import DataBaseOfShips.*;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee> {
/*
	public List<Employee> ofShip(Ship ship);
*/
	public List<Employee> ofShip(int shipId);

}
