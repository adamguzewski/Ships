package repositories.impl;

import DataBaseOfShips.Employee;
import DataBaseOfShips.Ship;
import DataBaseOfShips.User;
import repositories.IUserRepository;

import java.util.List;

public class DummyUserRepository implements IUserRepository{

    private DummyDb db;

    public DummyUserRepository(DummyDb db){
        super();
        this.db = db;
    }

    @Override
    public void add(User entity) {
        db.users.add(entity);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User entity) {
        db.users.remove(entity);
    }

    @Override
    public User get(int id) {
        for(User i: db.users){
            if(i.getId()==id)
                return i;
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return db.users;
    }


    @Override
    public User byEmployee(Employee employee) {
        return byEmployee(employee.getId());
    }

    @Override
    public User byEmployee(int employeeId) {
        for(Employee e: db.employees){
            if(e.getId()==employeeId){
                return e.getUser();
            }
        }
        return new User();
    }
}
