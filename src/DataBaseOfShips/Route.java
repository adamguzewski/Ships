package DataBaseOfShips;

import java.util.ArrayList;
import java.util.List;

public class Route {

    private String lenght;
    private String name;
    private String availablePorts;
    private String timeOfCrossing;

    public List<Ship> shipsOnRoute;

    public Route(){
        this.shipsOnRoute = new ArrayList<Ship>();
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvailablePorts() {
        return availablePorts;
    }

    public void setAvailablePorts(String availablePorts) {
        this.availablePorts = availablePorts;
    }

    public String getTimeOfCrossing() {
        return timeOfCrossing;
    }

    public void setTimeOfCrossing(String timeOfCrossing) {
        this.timeOfCrossing = timeOfCrossing;
    }

    public List<Ship> getShipsOnRoute() {
        return shipsOnRoute;
    }

    public void setShipsOnRoute(List<Ship> shipsOnRoute) {
        this.shipsOnRoute = shipsOnRoute;
    }
}
