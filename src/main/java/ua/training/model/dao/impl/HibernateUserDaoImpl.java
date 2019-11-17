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
    public void addUser(SimpleUser book) {
        Session session = this.sessionFactory.openSession();
        session.persist(book);
        logger.info("Book successfully saved. Book details: " + book);
    }

    @Override
    public void updateUser(SimpleUser book) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(book);
        logger.info("Book successfully update. Book details: " + book);
    }

    @Override
    public void removeUser(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User book = (User) session.load(User.class, id);

        if(book!=null){
            session.delete(book);
        }
        logger.info("Book successfully removed. Book details: " + book);
    }

    @Override
    public SimpleUser getUserById(int id) {
        Session session =this.sessionFactory.getCurrentSession();
        SimpleUser book = (SimpleUser) session.load(SimpleUser.class, new Integer(id));
        logger.info("Book successfully loaded. Book details: " + book);

        return book;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<SimpleUser> listUsers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<SimpleUser> simpleUsers = session.createNativeQuery("SELECT * FROM simpleusers", SimpleUser.class).list();

        return simpleUsers;
    }
}
