package ua.training.model.dao.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ua.training.model.dao.HibernateUserDao;
import ua.training.model.entity.SimpleUser;
import ua.training.model.entity.User;

import java.util.List;

@Repository
public class HibernateUserDaoImpl implements HibernateUserDao {

    private static final Logger logger = LoggerFactory.getLogger(HibernateUserDaoImpl.class);

    private SessionFactory sessionFactory;


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addUser(SimpleUser user) {
        Session session = this.sessionFactory.openSession();
        session.persist(user);
        logger.info("User successfully saved. User details: " + user);
    }

    @Override
    public void updateUser(SimpleUser user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(user);
        logger.info("User successfully update. User details: " + user);
    }

    @Override
    public void removeUser(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User) session.load(User.class, id);

        if (user != null) {
            session.delete(user);
        }
        logger.info("user successfully removed. user details: " + user);
    }

    @Override
    public SimpleUser getUserById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        SimpleUser user = (SimpleUser) session.load(SimpleUser.class, new Integer(id));
        logger.info("user successfully loaded. user details: " + user);

        return user;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<SimpleUser> listUsers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<SimpleUser> simpleUsers = session.createNativeQuery("SELECT * FROM simpleusers", SimpleUser.class).list();

        return simpleUsers;
    }
}
