package repositories.impl;

import DataBaseOfShips.Harbour;
import DataBaseOfShips.Route;
import DataBaseOfShips.Ship;
import repositories.IHarbourRepository;

import java.util.ArrayList;
import java.util.List;

public class DummyHarbourRepository implements IHarbourRepository{

    private DummyDb db;

    public DummyHarbourRepository(DummyDb db){
        super();
        this.db = db;
    }

    @Override
    public List<Harbour> ofShips(Ship ship) {
        return ofShips(ship.getId());
    }

    @Override
    public List<Harbour> ofShips(int shipId) {
        for(Ship s: db.ships){
            if(s.getId()==shipId){
                return s.getHarbours();
            }
        }
        return new ArrayList<Harbour>();
    }

    @Override
    public List<Harbour> ofRoute(Route route) {
        return ofRoute(route.getId());
    }

    @Override
    public List<Harbour> ofRoute(int routeId) {
        for(Route r: db.routes){
            if(r.getId()==routeId){
                return r.getAvailablePorts();
            }
        }
        return new ArrayList<Harbour>();
    }


    @Override
    public void add(Harbour entity) {
        db.harbours.add(entity);
    }

    @Override
    public void update(Harbour harbour) {

    }

    @Override
    public void delete(Harbour entity) {
        db.harbours.remove(entity);
    }

    @Override
    public Harbour get(int id) {
        for(Harbour i: db.harbours){
            if (i.getId()==id)
                return i;
        }
        return null;
    }

    @Override
    public List<Harbour> getAll() {
        return db.harbours;
    }
}
