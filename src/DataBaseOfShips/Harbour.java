package DataBaseOfShips;

import java.util.ArrayList;
import java.util.List;

public class Harbour extends Entity{

    public List<Ship> ships;
    public List<Route> routes;

    private Route route;

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Harbour(){
        setId(1);
        name = "QueensPort";
        place = "London";
        size = "200";
        numberOfShips = "20";
        numberOfEmployees = "300";
        this.ships = new ArrayList<Ship>();
        this.routes = new ArrayList<Route>();
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public void addRoutes(Route route){
        this.routes.add(route);
    }

    private String place;
    private String size;
    private String numberOfShips;
    private String numberOfEmployees;
    private String name;

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNumberOfShips() {
        return numberOfShips;
    }

    public void setNumberOfShips(String numberOfShips) {
        this.numberOfShips = numberOfShips;
    }

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(String numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
