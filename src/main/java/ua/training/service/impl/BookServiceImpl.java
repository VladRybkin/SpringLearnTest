package ua.training.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.training.model.dao.UserDaoHib;
import ua.training.model.entity.SimpleUser;
import ua.training.model.entity.User;
import ua.training.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private UserDaoHib userDaoHib;

    public void setUserDaoHib(UserDaoHib userDaoHib) {
        this.userDaoHib = userDaoHib;
    }

    @Override
    @Transactional
    public void addBook(SimpleUser book) {
        this.userDaoHib.addBook(book);
    }

    @Override
    @Transactional
    public void updateBook(SimpleUser book) {
        this.userDaoHib.updateBook(book);
    }

    @Override
    @Transactional
    public void removeBook(int id) {
        this.userDaoHib.removeBook(id);
    }

    @Override
    @Transactional
    public SimpleUser getBookById(int id) {
        return this.userDaoHib.getBookById(id);
    }

    @Override
    @Transactional
    public List<SimpleUser> listBooks() {
        return this.userDaoHib.listBooks();
    }
}
