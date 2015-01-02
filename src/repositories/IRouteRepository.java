package repositories;

import DataBaseOfShips.*;

import java.util.List;


public interface IRouteRepository extends IRepository<Route>{

//    public List<Route> byShip(Ship ship);
    public List<Route> byShip(int shipId);
//   public List<Route> byHarbour(Harbour harbour);
//  public List<Route> byHarbour(int harbourId);
}
