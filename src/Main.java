import DataBaseOfShips.*;
import repositories.IRepositoriesCatalog;
import repositories.impl.DummyRepositoriesCatalog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class Main {
    public static void main(String args[]){

    	User nowak = new User();
    	nowak.setLogin("knowak");
    	nowak.setPassword("qwertyyy");
    	
    	String user = "root";
    	String password	= "qwertyyy";
    	String url = "jdbc:mysql://localhost:3306/statki";
    	try {
    		Connection connection = DriverManager.getConnection(url, user, password);
    		/*
    		String createUserTable=
    				"CREATE TABLE users("
    				+ "id int AUTO_INCREMENT PRIMARY KEY,"
    				+ "login VARCHAR(20),"
    				+ "password VARCHAR(20)"
    				+ ")";
    		Statement stmt = connection.createStatement();
    		stmt.executeUpdate(createUserTable);
    		*/
    		
    		String CreateEmployeeTable=
    				"CREATE TABLE employees("
    				+ "id int AUTO_INCREMENT PRIMARY KEY,"
    				+ "firstName VARCHAR(20),"
    				+ "surName VARCHAR(20),"
    				+ "age VARCHAR(3),"
    				+ "city VARCHAR(30),"
    				+ "country VARCHAR(30),"
    				+ "street VARCHAR(40),"
    				+ "houseNumber VARCHAR(5),"
    				+ "localNumber VARCHAR(5),"
    				+ "actualShip VARCHAR(50)"
    				+ ")";
    		Statement stmt  = connection.createStatement();
    		stmt.executeUpdate(CreateEmployeeTable);
    		
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	
    	
    	
    }
}
/*
        Employee pracownik = new Employee();
        pracownik.setFirstName("Janek");
        pracownik.setSurName("Kowal");
        Employee kowalski = new Employee();

        kowalski.setSurName("Nowak");
        kowalski.setFirstName("Edward");
        kowalski.setId(2);

        Employee ggg = new Employee();
        ggg.setFirstName("Zbyszek");


        User extraGosc = new User();


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
        dookolaswiata.getAvailablePorts().add(londyn);
        dookolaswiata.getAvailablePorts().add(gda);
        gda.setName("Gdañsk");

        extraGosc.setUsername("ExtraGosc");
        extraGosc.setLogin("SuperKtos");
        extraGosc.setEmployee(pracownik);

        pracownik.setUser(extraGosc);

        kowalski.getShips().add(titanic);
        titanic.getEmployees().add(kowalski);

        nowak.setUser(admin);
        admin.setLogin("KapitanBomba");
        admin.setUsername("Kapitan");
        nowak.setId(10);

        catalog.getUser().add(extraGosc);

        System.out.println(catalog.getUser().byEmployee(pracownik).getUsername());







      //for(Ship r: catalog.getShip().byRoute(dookolaswiata)){
      //System.out.println(r.getName());
      //}

  //   for(Route r: catalog.getRoute().byHarbour(londyn)){
    // System.out.println(r.getName());
    // }

    // System.out.println(catalog.getUser().byEmployee(10).getLogin());
     //for(Harbour r: dookolaswiata.getAvailablePorts())
     //System.out.println(r.getName());
     //}

        System.out.println(catalog.getShip().byEmployee(kowalski).getName());

/*
        System.out.println(catalog.getShip().byRoute(dookolaswiata));

        for(Ship s: catalog.getShip().byRoute(dookolaswiata)){
            System.out.println(s.getName());
        }


    }
}
*/