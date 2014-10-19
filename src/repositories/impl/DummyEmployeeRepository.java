package repositories.impl;

import DataBaseOfShips.Employee;
import DataBaseOfShips.Ship;
import DataBaseOfShips.User;
import repositories.IEmployeeRepository;

import java.util.List;

public class DummyEmployeeRepository implements IEmployeeRepository{

    private DummyDb db;

    public DummyEmployeeRepository(DummyDb db){
        super();
        this.db = db;
    }


    @Override
    public List<Employee> ofUser(User user) {
        return null;
    }

    @Override
    public List<Employee> ofUser(int userId) {
        return null;
    }

    @Override
    public List<Employee> ofUser(String age) {
        return null;
    }

    @Override
    public List<Employee> ofShip(Ship ship) {
        return null;
    }

    @Override
    public List<Employee> ofShip(int shipId) {
        return null;
    }

    @Override
    public void add(Employee entity) {
        db.employees.add(entity);
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(Employee entity) {
        db.employees.remove(entity);
    }

    @Override
    public Employee get(int id) {
        for(Employee i: db.employees){
            if(i.getId()==id)
                return i;
        }
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return db.employees;
    }
}
