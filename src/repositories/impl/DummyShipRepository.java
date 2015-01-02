package repositories.impl;

import repositories.IShipRepository;

import DataBaseOfShips.*;

import java.util.ArrayList;
import java.util.List;

public class DummyShipRepository implements IShipRepository{

    private DummyDb db;

    public DummyShipRepository(DummyDb db){
        super();
        this.db = db;
    }

/*  @Override
    public List<Ship> byRoute(Route route) {
        return byRoute(route.getId());
    }



    @Override
    public List<Ship> byRoute(int routeId) {
        for(Route r: db.routes){
            if(r.getId()==routeId){
                return r.getShips();
            }
        }
     return new ArrayList<Ship>();
    }

    @Override
    public Ship byEmployee(Employee employee) {
        return byEmployee(employee.getId());
    }
*/
    @Override
    public Ship byEmployee(int employeeId) {
        for(Employee s: db.employees){
            if(s.getId()==employeeId)
                return s.getShip();
                }
        return new Ship();
    }


    @Override
    public void add(Ship entity) {
        db.ships.add(entity);
    }

    @Override
    public void update(Ship entity) {

    }

    @Override
    public void delete(Ship entity) {
        db.ships.remove(entity);
    }

    @Override
    public Ship get(int id) {
        for (Ship s: db.ships){
            if(s.getId()==id)
                return s;
        }
        return null;
    }

    @Override
    public List<Ship> getAll() {
        return db.ships;
    }
}
