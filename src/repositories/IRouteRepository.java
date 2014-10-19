package repositories;

import DataBaseOfShips.*;


public interface IRouteRepository extends IRepository<Route>{

    public Route ofShip(Ship ship);
 //   public Route ofShip(int shipId);
    public Route ofHarbour(Harbour harbour);
    public Route ofHarbour(int harbourId);
}
