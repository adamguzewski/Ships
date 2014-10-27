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

        Employee ggg = new Employee();
        ggg.setFirstName("Zbyszek");



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
        dookolaswiata.addShips(liniowiec1);
        dookolaswiata.addShips(titanic);

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

        titanic.addEmployees(ggg);
        pracownik.setShip(titanic);
        titanic.addEmployees(kowalski);
        pracownik.setId(1);

        dookolaswiata.addShips(titanic);
        dookolaswiata.addShips(liniowiec1);

        titanic.getRoutes().add(dookolaswiata);
        liniowiec1.getRoutes().add(dookolaswiata);
        titanic.setRoute(dookolaswiata);
        titanic.getRoutes().add(dookolaswiata);
        liniowiec1.getRoutes().add(dookolaswiata);

        titanic.addRoute(dookolaswiata);
        liniowiec1.addRoute(dookolaswiata);


        System.out.println(titanic.getRoute().getName());

     //   List<Ship> dookolaroute = catalog.getShip().byRoute(dookolaswiata);


      //  System.out.println(catalog.getShip().byRoute(dookolaswiata).getName());


//        System.out.println(catalog.getRoute().byHarbour(londyn).getName());

     //   for(Employee e: catalog.getEmployee().ofShip(titanic)){
       //     System.out.println(e.getFirstName());
        //}
        for(Route r: catalog.getRoute().byShip(titanic)){
            System.out.println(r.getName());
        }



      /*  for(Ship s: catalog.getShip().byEmployee(nowak)){
            System.out.println(s.getName());
        }
/*
        System.out.println(catalog.getShip().byRoute(dookolaswiata));
*/
    }
}
