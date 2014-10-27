package repositories;

import DataBaseOfShips.*;

import java.util.List;


public interface IRouteRepository extends IRepository<Route>{

    public List<Route> byShip(Ship ship);
    public List<Route> byShip(int shipId);
    public Route byHarbour(Harbour harbour);
    public Route byHarbour(int harbourId);
}
