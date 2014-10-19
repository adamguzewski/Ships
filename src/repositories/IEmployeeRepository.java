package repositories;

import DataBaseOfShips.*;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee>{

        public List<Employee> ofUser(User user);
        public List<Employee> ofUser(int userId);
        public List<Employee> ofUser(String age);
        public List<Employee> ofShip(Ship ship);
        public List<Employee> ofShip(int shipId);

}
