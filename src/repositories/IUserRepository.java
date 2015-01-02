package repositories;

import DataBaseOfShips.*;

import java.util.List;

public interface IUserRepository extends IRepository<User>{

    public User byEmployee(Employee employee);
    public User byEmployee(int employeeId);

}
