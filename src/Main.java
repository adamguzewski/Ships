import DataBaseOfShips.*;
import repositories.IRepositoriesCatalog;
import repositories.impl.DummyRepositoriesCatalog;

import java.util.List;


public class Main {
    public static void main(String args[]){


        Employee pracownik = new Employee();
        pracownik.setFirstName("Janek");
        pracownik.setSurName("Kowal");
        Employee kowalski = new Employee();

        kowalski.setSurName("Nowak");
        kowalski.setFirstName("Edward");
        kowalski.setId(2);


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

        catalog.getEmployee().add(pracownik);

        catalog.getShip().add(titanic);
        catalog.getHarbour().add(londyn);
        catalog.getShip().add(liniowiec1);
        catalog.getRoute().add(dookolaswiata);
        titanic.addEmployees(pracownik);
        kowalski.setShip(liniowiec1);
        liniowiec1.addEmployees(kowalski);

        pracownik.setShip(titanic);
        titanic.addEmployees(kowalski);
        pracownik.setId(1);

        for(Employee e: titanic.getEmployees()){
            System.out.println(e.getFirstName());
        }

        System.out.println(titanic.getEmployees());
        /*
        System.out.println(catalog.getShip().byEmployee(1).getName());
        System.out.println(catalog.getShip().byEmployee(pracownik).getName());
        System.out.println(catalog.getShip().byEmployee(kowalski).getName());
        System.out.println(catalog.getEmployee().get(1).getFirs tName());
*/
       // for(Ship s: catalog.getShip().getAll()){
         //   System.out.println(s.getName());
        //}

       // System.out.println(catalog.getShip().get(4).getName());

     //   System.out.println(catalog.getShip().get(2).getName()+" "+catalog.getShip().byRoute(1).getName());
    }
}
