package repositories.impl;

import repositories.*;

public class DummyRepositoriesCatalog implements IRepositoriesCatalog{

    DummyDb db = new DummyDb();

    @Override
    public IEmployeeRepository getEmployee() {
        return new DummyEmployeeRepository(db);
    }

    @Override
    public IRouteRepository getRoute() {
        return new DummyRouteRepository(db);
    }

    @Override
    public IShipRepository getShip() {
        return new DummyShipRepository(db);
    }

    @Override
    public IUserRepository getUser() {
        return new DummyUserRepository(db);
    }

    @Override
    public IHarbourRepository getHarbour() {
        return new DummyHarbourRepository(db);
    }
}
