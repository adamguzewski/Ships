package repositories;


import DataBaseOfShips.*;

import java.util.List;

public interface IHarbourRepository extends IRepository<Harbour>{

    public List<Harbour> ofShips(Ship ship);
    public List<Harbour> ofShips(int shipId);
    public List<Harbour> ofRoute(Route route);
    public List<Harbour> ofRoute(int routeId);



}

