package DataBaseOfShips;

import java.util.ArrayList;
import java.util.List;

public class Route extends Entity{

    private String lenght;
    private String name;
    private String timeOfCrossing;
    private int price;
    public List<Harbour> availablePorts;
    public List<Ship> ships;
    private Ship ship;
    public Route(){
        setId(1);
        name = "NewYork-Gdynia";
        timeOfCrossing = "80h";
        price = 340;
        this.availablePorts = new ArrayList<Harbour>();
        this.ships = new ArrayList<Ship>();
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
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

    public String getTimeOfCrossing() {
        return timeOfCrossing;
    }

    public void setTimeOfCrossing(String timeOfCrossing) {
        this.timeOfCrossing = timeOfCrossing;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }

    public void addShips(Ship ship){
        this.ships.add(ship);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Harbour> getAvailablePorts() {
        return availablePorts;
    }

    public void setAvailablePorts(List<Harbour> availablePorts) {
        this.availablePorts = availablePorts;
    }

    public void addAvailablePorts(Harbour harbour){
        this.availablePorts.add(harbour);
    }

}
