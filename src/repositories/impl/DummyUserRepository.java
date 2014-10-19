package repositories.impl;

import DataBaseOfShips.Employee;
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
    public List<User> withEmployee(Employee employee) {
        return null;
    }

    @Override
    public List<User> withEmployee(String username) {
        return null;
    }

    @Override
    public List<User> withEmployee(int employeeId) {
        return null;
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
}
