package repositories;

import DataBaseOfShips.*;

import java.util.List;

public interface IShipRepository extends IRepository<Ship>{

    public Ship byRoute(Route route);
    public Ship byRoute(int routeId);

    public Ship byEmployee(Employee employee);
    public Ship byEmployee(int employeeId);

}

