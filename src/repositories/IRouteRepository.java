package repositories;

import DataBaseOfShips.*;


public interface IRouteRepository extends IRepository<Route>{

    public Route byShip(Ship ship);
    public Route byShip(int shipId);
    public Route byHarbour(Harbour harbour);
    public Route byHarbour(int harbourId);
}
