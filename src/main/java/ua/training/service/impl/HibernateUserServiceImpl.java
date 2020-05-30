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
    public void addUser(SimpleUser simpleUser) {
        this.hibernateUserDao.addUser(simpleUser);
    }

    @Override
    @Transactional
    public void updateUser(SimpleUser simpleUser) {
        this.hibernateUserDao.updateUser(simpleUser);
    }

    @Override
    @Transactional
    public void removeUser(int id) {
        this.hibernateUserDao.removeUser(id);
    }

    @Override
    @Transactional
    public SimpleUser getUserById(int id) {
        return this.hibernateUserDao.getUserById(id);
    }

    @Override
    @Transactional
    public List<SimpleUser> listUsers() {
        System.out.println("jpa listbooks " + simpleUserCrudRepository.findAll());
        return this.hibernateUserDao.listUsers();
    }
}
