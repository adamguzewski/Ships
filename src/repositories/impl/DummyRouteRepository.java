package repositories.impl;

import DataBaseOfShips.*;

import repositories.IRouteRepository;


import java.util.ArrayList;
import java.util.List;

public class DummyRouteRepository implements IRouteRepository{

    private DummyDb db;

    public DummyRouteRepository(DummyDb db){
        super();
        this.db = db;
    }

//    @Override
//    public List<Route> byShip(Ship ship) {
//        return byShip(ship.getId());
//    }

    @Override
    public List<Route> byShip(int shipId) {
        for(Ship s: db.ships){
            if(s.getId()==shipId){
                return s.getRoutes();
            }
        }
        return new ArrayList<Route>();
    }

//    @Override
//    public List<Route> byHarbour(Harbour harbour) {
//        return byHarbour(harbour.getId());
//    }

//    @Override
//    public List<Route> byHarbour(int harbourId) {
//       for(Harbour h: db.harbours){
//            if(h.getId()==harbourId){
 //               return h.getRoutes();
 //           }
   //     }
     //   return new ArrayList<Route>();
   // }

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
