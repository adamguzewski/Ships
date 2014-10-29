package DataBaseOfShips;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Entity{

    private String firstName;
    private String surName;
    private String position;
    private String age;
    private String city;
    private String country;
    private String street;
    private String houseNumber;
    private String localNumber;
    private String postalCode;
    private User user;
    private List<Ship> ships;
    private Ship ship;
    private String actualShip;


/*
    public Employee(){
        firstName = "Jan";
        surName = "Kowalski";
        position = "Captain";
        age = "43";
        city = "Miami";
        country = "USA";
        street = "Beautiful st.";
        houseNumber = "3";
        localNumber = null;
        postalCode = "20-2020";
        setId(1);
        user = new User();
        this.ships = new ArrayList<Ship>();

    }
*/

    public String getActualShip() {
        return actualShip;
    }

    public void setActualShip(String actualShip) {
        this.actualShip = actualShip;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getLocalNumber() {
        return localNumber;
    }

    public void setLocalNumber(String localNumber) {
        this.localNumber = localNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }
}
