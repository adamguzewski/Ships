package repositories;

public interface IRepositoriesCatalog {

    public IEmployeeRepository getEmployee();
    public IRouteRepository getRoute();
    public IShipRepository getShip();
    public IUserRepository getUser();
    public IHarbourRepository getHarbour();

}