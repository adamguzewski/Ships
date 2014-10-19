package repositories.impl;

import repositories.IShipRepository;

import DataBaseOfShips.*;

import java.util.List;

public class DummyShipRepository implements IShipRepository{

    private DummyDb db;

    public DummyShipRepository(DummyDb db){
        super();
        this.db = db;
    }


    @Override
    public Ship byRoute(Route route) {
        for(Ship i: db.ships){
            if(i.getRoute()==route)
                return i;
        }
        return null;
    }

    @Override
    public Ship byRoute(int routeId) {
        for(Ship i: db.ships){
            if(i.getRoute().getId()==routeId)
                return i;
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
        for (Ship i: db.ships){
            if(i.getId()==id)
                return i;
        }
        return null;
    }

    @Override
    public List<Ship> getAll() {
        return db.ships;
    }
}
