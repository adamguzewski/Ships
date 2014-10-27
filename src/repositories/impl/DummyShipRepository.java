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


    @Override
    public List<Ship> byRoute(Route route) {
        return byRoute(route.getId());
    }



    @Override
    public List<Ship> byRoute(int routeId) {
     return null;
    }

    @Override
    public Ship byEmployee(Employee employee) {
        for(Ship s: db.ships){
            if(s.getEmployees().contains(employee)){
                return s;
            }
        }
        return null;
    }

    @Override
    public Ship byEmployee(int employeeId) {
        for(Ship s: db.ships){
            for(Employee e: s.getEmployees()){
                if(e.getId()==employeeId){
                    return s;
                }
            }
        }
        return null;
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
