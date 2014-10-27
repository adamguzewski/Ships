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
    public Route byShip(Ship ship) {
        for(Route r: db.routes){
            if(r.getShipsOnRoute().contains(ship)){
              return r;
            }
        }
        return null;
    }

    @Override
    public Route byShip(int shipId) {
        for(Route r: db.routes){
            for(Ship s: r.getShipsOnRoute()){
                if(s.getId()==shipId){
                    return r;
                }
            }
        }
        return null;
    }

    @Override
    public Route byHarbour(Harbour harbour) {
        for(Route r: db.routes){
            if(r.getAvailablePorts().contains(harbour)){
                return r;
            }
        }
        return null;
    }

    @Override
    public Route byHarbour(int harbourId) {
        for(Route r: db.routes){
            for(Harbour h: r.getAvailablePorts()){
                if(h.getId()==harbourId){
                    return r;
                }
            }
        }
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
