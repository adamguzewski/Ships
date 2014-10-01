package DataBaseOfShips;

import java.util.ArrayList;
import java.util.List;

public class Harbour {

    public List<Ship> ships;

    public Harbour(){
        this.ships = new ArrayList<Ship>();
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
