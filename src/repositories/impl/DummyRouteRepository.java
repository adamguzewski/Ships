package repositories.impl;

import DataBaseOfShips.*;

import repositories.IRouteRepository;


import java.util.List;

public class DummyRouteRepository implements IRouteRepository{

    private DummyDb db;

    public DummyRouteRepository(DummyDb db){
        super();
        this.db = db;
    }

    @Override
    public Route ofShip(Ship ship) {
        for(Route i: db.routes){
            if(i.getShipsOnRoute()==ship)
                return i;
        }
        return null;
    }

    /*@Override
    public Route ofShip(int shipId) {
        for(Route i: db.routes){
            if(i.getRoute().getId==shipId)
                return i;
        }
        return null;
    }*/

    @Override
    public Route ofHarbour(Harbour harbour) {
        return null;
    }

    @Override
    public Route ofHarbour(int harbourId) {
        return null;
    }

    @Override
    public void add(Route entity) {
        db.routes.add(entity);
    }

    @Override
    public void update(Route route) {

    }

    @Override
    public void delete(Route entity) {
        db.routes.remove(entity);
    }

    @Override
    public Route get(int id) {
        for(Route i: db.routes){
            if(i.getId()==id)
                return i;
        }
        return null;
    }

    @Override
    public List<Route> getAll() {
        return db.routes;
    }
}
