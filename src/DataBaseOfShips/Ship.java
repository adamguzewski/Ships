package DataBaseOfShips;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    private String name;
    private String size;
    private String type;
    private String weight;
    private String maxSpeed;
    private String maxCharge;
    private String numberOfCrew;

    private List<Employee> employees;

    public Ship(){
        this.employees= new ArrayList<Employee>();
    }

    private Harbour harbour;

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

    public Harbour getHarbour() {
        return harbour;
    }

    public void setHarbour(Harbour harbour) {
        this.harbour = harbour;
    }
}
