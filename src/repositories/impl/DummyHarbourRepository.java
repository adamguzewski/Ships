package repositories.impl;

import DataBaseOfShips.Harbour;
import DataBaseOfShips.Ship;
import repositories.IHarbourRepository;

import java.util.List;

public class DummyHarbourRepository implements IHarbourRepository{

    private DummyDb db;

    public DummyHarbourRepository(DummyDb db){
        super();
        this.db = db;
    }

    @Override
    public List<Harbour> ofShips(Ship ship) {
        return null;
    }

    @Override
    public List<Harbour> ofShips(int shipId) {
        return null;
    }

    @Override
    public List<Harbour> ofNumberOfShips(String numberOfShips) {
        return null;
    }

    @Override
    public List<Harbour> ofNumberOfShips(int numberOfShipsId) {
        return null;
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
