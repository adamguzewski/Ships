package DataBaseOfShips;

import java.util.ArrayList;
import java.util.List;

public class Ship extends Entity{

    private String name;
    private String size;
    private String type;
    private String weight;
    private String maxSpeed;
    private String maxCharge;
    private String numberOfCrew;
    private Route route;
    private List<Route> routes;
    private List<Employee> employees;
    private List<Harbour> harbours;
    public Ship(){
        setId(1);
        name = "Titanic";
        size = "450m";
        type = "Tourist";
        weight = "2000T";
        maxSpeed = "40mph/h";
        maxCharge = "Unknown";
        numberOfCrew = "220";
        this.employees= new ArrayList<Employee>();
        this.routes = new ArrayList<Route>();

    }
    //private Harbour harbour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getMaxCharge() {
        return maxCharge;
    }

    public void setMaxCharge(String maxCharge) {
        this.maxCharge = maxCharge;
    }

    public String getNumberOfCrew() {
        return numberOfCrew;
    }

    public void setNumberOfCrew(String numberOfCrew) {
        this.numberOfCrew = numberOfCrew;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Harbour> getHarbours() {
        return harbours;
    }

    public void setHarbours(List<Harbour> harbours) {
        this.harbours = harbours;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public void addEmployees(Employee employee){
        this.employees.add(employee);
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public void addRoute(Route route){
        this.routes.add(route);
    }
}
