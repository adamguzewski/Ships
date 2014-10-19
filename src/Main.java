import DataBaseOfShips.*;
import repositories.IRepositoriesCatalog;
import repositories.impl.DummyRepositoriesCatalog;

import java.util.List;


public class Main {
    public static void main(String args[]){

        Ship titanic = new Ship();
        Route dookolaswiata = new Route();
        User admin = new User();
        Employee nowak = new Employee();
        Harbour londyn = new Harbour();
        Harbour gda = new Harbour();

        Ship liniowiec1 = new Ship();
        Ship liniowiec2 = new Ship();

        liniowiec1.setName("Liniowiec 1");
        liniowiec1.setId(4);
        liniowiec2.setName("Liniowiec 2");
        liniowiec2.setId(5);

        titanic.setId(2);
        titanic.setMaxCharge("5555");
        titanic.setMaxSpeed("90");
        titanic.setNumberOfCrew("50");
        titanic.setName("Titanic");

        dookolaswiata.setName("Dluga");
        dookolaswiata.setId(1);
        dookolaswiata.addAvailablePorts(londyn);
        dookolaswiata.addShipsOnRoute(liniowiec1);
        dookolaswiata.addShipsOnRoute(titanic);

        londyn.setNumberOfEmployees("20");

        IRepositoriesCatalog catalog = new DummyRepositoriesCatalog();
        catalog.getShip().add(titanic);
        catalog.getHarbour().add(londyn);
        catalog.getShip().add(liniowiec1);
        catalog.getRoute().add(dookolaswiata);

        System.out.println(catalog.getShip().get(2).getName()+" "+catalog.getShip().byRoute(1).getName());

    }
}
