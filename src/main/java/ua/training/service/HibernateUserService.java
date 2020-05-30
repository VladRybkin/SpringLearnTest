package ua.training.service;


import ua.training.model.entity.SimpleUser;

import java.util.List;

public interface HibernateUserService {

    public void addUser(SimpleUser book);

    public void updateUser(SimpleUser simpleUser);

    public void removeUser(int id);

    public SimpleUser getUserById(int id);

    public List<SimpleUser> listUsers();
}
