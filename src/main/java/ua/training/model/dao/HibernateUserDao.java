package ua.training.model.dao;


import ua.training.model.entity.SimpleUser;

import java.util.List;

public interface HibernateUserDao {

    public void addUser(SimpleUser simpleUser);

    public void updateUser(SimpleUser simpleUser);

    public void removeUser(int id);

    public SimpleUser getUserById(int id);

    public List<SimpleUser> listUsers();
}
