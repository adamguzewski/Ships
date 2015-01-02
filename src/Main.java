import DataBaseOfShips.*;
import repositories.IEmployeeRepository;
import repositories.IHarbourRepository;
import repositories.IRepositoriesCatalog;
import repositories.IRouteRepository;
import repositories.IShipRepository;
import repositories.IUserRepository;
import repositories.impl.DummyRepositoriesCatalog;
import repositories.impl.EmployeeBuilder;
import repositories.impl.EmployeeRepository;
import repositories.impl.HarbourBuilder;
import repositories.impl.HarbourRepository;
import repositories.impl.ShipBuilder;
import repositories.impl.ShipRepository;
import unitOfWork.*;
import repositories.impl.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String args[]){

    	
    	Employee kowalski = new Employee();
    	kowalski.setFirstName("Jan");
    	kowalski.setSurName("Kowalski");
    	kowalski.setActualShip("Titanic");
    	
    	User nowak = new User();
    	nowak.setLogin("knowak");
    	nowak.setPassword("qwertyyy");
    	
    	Ship titanic = new Ship();
    	titanic.setName("Titanic");
    	titanic.setMaxSpeed("65");
    	titanic.setSize("600");
    	
    	Ship queenMary2 = new Ship();
    	queenMary2.setName("Queen Mary 2");
    	queenMary2.setMaxSpeed("89");
    	queenMary2.setSize("998");
    	
    	Harbour gda = new Harbour();
    	gda.setName("Gdansk");
    	gda.setPlace("Gdansk");
    	gda.setNumberOfEmployees("500");
    	
    	Route dluga = new Route();
    	dluga.setName("Dluga");
    	dluga.setLenght("526");
    	dluga.setTimeOfCrossing("410");
    	dluga.setPrice(680);
    	
    	
    	String user = "root";
    	String password	= "qwertyyy";
    	String url = "jdbc:mysql://localhost:3306/statki";
    	try {
    		Connection connection = DriverManager.getConnection(url, user, password);
    		
    		UnitOfWork uow = new UnitOfWork(connection);
    		
    /*		String createUserTable=
    				"CREATE TABLE users("
    				+ "id int AUTO_INCREMENT PRIMARY KEY,"
    				+ "login VARCHAR(20),"
    				+ "password VARCHAR(20)"
    				+ ")";
    		
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
    				
    		
    		String CreateRouteTable=
    				"CREATE TABLE routes("
    	    				+ "id int AUTO_INCREMENT PRIMARY KEY,"
    	    				+ "name VARCHAR(20),"
    	    				+ "lenght VARCHAR(20),"
    	    				+ "timeOfCrossing VARCHAR(20),"
    	    				+ "price VARCHAR(15)"
    	    				+ ")";
    		
    		String CreateHarbourTable=
    				"CREATE TABLE harbours("
    	    				+ "id int AUTO_INCREMENT PRIMARY KEY,"
    	    				+ "name VARCHAR(20),"
    	    				+ "place VARCHAR(20),"
    	    				+ "numberOfEmployees VARCHAR(20)"
    	    				+ ")";
    		
    		String CreateShipTable=
    				"CREATE TABLE ships("
    	    				+ "id int AUTO_INCREMENT PRIMARY KEY,"
    	    				+ "name VARCHAR(20),"
    	    				+ "maxSpeed VARCHAR(20),"
    	    				+ "size VARCHAR(20)"
    	    				+ ")";
    		
    		Statement stmt  = connection.createStatement();
    		stmt.executeUpdate(CreateEmployeeTable);
    		stmt.executeUpdate(CreateHarbourTable);
    		stmt.executeUpdate(CreateRouteTable);
    		stmt.executeUpdate(CreateShipTable);
    		stmt.executeUpdate(createUserTable);
    	*/	

    		IEmployeeRepository employees = new EmployeeRepository(connection, new EmployeeBuilder(), uow);
    		IHarbourRepository harbours = new HarbourRepository(connection, new HarbourBuilder(), uow);
    		IRouteRepository routes = new RouteRepository(connection, new RouteBuilder(), uow);
    		IShipRepository ships = new ShipRepository(connection, new ShipBuilder(), uow);
    		//IUserRepository users = new UserRepository(connection, new UserBuilder(), uow);
    	
    		
    		//inserty
    		employees.add(kowalski);
    		harbours.add(gda);
    		routes.add(dluga);
    		ships.add(queenMary2);
    		ships.add(titanic);
    		
    		uow.commit();
    		
    		//update'y
    		Ship shi = new Ship();
    		shi = ships.get(2);
    		shi.setName("QUEEN MARY 2");
    		ships.update(shi);

    		uow.commit();
    		
    		List<Ship> shipsFromDb = new ArrayList<Ship>();
    		shipsFromDb = ships.getAll();
    		
    		for(Ship s: shipsFromDb){
    			System.out.println(s.getName()+ " " +s.getMaxSpeed());
    		}
    		System.out.println();
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