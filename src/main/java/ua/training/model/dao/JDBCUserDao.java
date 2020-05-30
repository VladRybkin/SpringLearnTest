package ua.training.model.dao;

import ua.training.model.entity.SimpleUser;

import java.util.List;

public interface JDBCUserDao {

    void insertUser(int id, String name);

    List<SimpleUser> getUsers();
}
