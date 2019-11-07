package ua.training.model.dao;


import ua.training.model.entity.SimpleUser;
import ua.training.model.entity.User;

import java.util.List;

public interface UserDaoHib {
    public void addBook(SimpleUser book);

    public void updateBook(SimpleUser book);

    public void removeBook(int id);

    public SimpleUser getBookById(int id);

    public List<SimpleUser> listBooks();
}
