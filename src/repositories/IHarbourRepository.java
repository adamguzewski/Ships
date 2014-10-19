package repositories;


import DataBaseOfShips.*;

import java.util.List;

public interface IHarbourRepository extends IRepository<Harbour>{

    public List<Harbour> ofShips(Ship ship);
    public List<Harbour> ofShips(int shipId);
    public List<Harbour> ofNumberOfShips(String numberOfShips);
    public List<Harbour> ofNumberOfShips(int numberOfShipsId);

}

