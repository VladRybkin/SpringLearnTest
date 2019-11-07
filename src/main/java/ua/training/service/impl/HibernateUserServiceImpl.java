package ua.training.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.training.model.dao.HibernateUserDao;
import ua.training.model.entity.SimpleUser;
import ua.training.model.repository.SimpleUserCrudRepository;
import ua.training.service.HibernateUserService;

import java.util.List;

@Service
public class HibernateUserServiceImpl implements HibernateUserService {

    private HibernateUserDao hibernateUserDao;

    @Autowired
    SimpleUserCrudRepository simpleUserCrudRepository;

    public void setHibernateUserDao(HibernateUserDao hibernateUserDao) {
        this.hibernateUserDao = hibernateUserDao;
    }

    @Override
    @Transactional
    public void addBook(SimpleUser book) {
        this.hibernateUserDao.addBook(book);
    }

    @Override
    @Transactional
    public void updateBook(SimpleUser book) {
        this.hibernateUserDao.updateBook(book);
    }

    @Override
    @Transactional
    public void removeBook(int id) {
        this.hibernateUserDao.removeBook(id);
    }

    @Override
    @Transactional
    public SimpleUser getBookById(int id) {
        return this.hibernateUserDao.getBookById(id);
    }

    @Override
    @Transactional
    public List<SimpleUser> listBooks() {
        System.out.println("jpa listbooks "+ simpleUserCrudRepository.findAll());
        return this.hibernateUserDao.listBooks();
    }
}
