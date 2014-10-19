package repositories;

import DataBaseOfShips.*;

import java.util.List;

public interface IUserRepository extends IRepository<User>{

    public List<User> withEmployee(Employee employee);
    public List<User> withEmployee(String username);
    public List<User> withEmployee(int employeeId);

}
