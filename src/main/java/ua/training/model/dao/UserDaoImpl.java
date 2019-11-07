package ua.training.model.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ua.training.model.entity.SimpleUser;
import ua.training.model.entity.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDaoHib {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    private SessionFactory sessionFactory;


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addBook(SimpleUser book) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(book);
        logger.info("Book successfully saved. Book details: " + book);
    }

    @Override
    public void updateBook(SimpleUser book) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(book);
        logger.info("Book successfully update. Book details: " + book);
    }

    @Override
    public void removeBook(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User book = (User) session.load(User.class, id);

        if(book!=null){
            session.delete(book);
        }
        logger.info("Book successfully removed. Book details: " + book);
    }

    @Override
    public SimpleUser getBookById(int id) {
        Session session =this.sessionFactory.getCurrentSession();
        SimpleUser book = (SimpleUser) session.load(SimpleUser.class, new Integer(id));
        logger.info("Book successfully loaded. Book details: " + book);

        return book;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<SimpleUser> listBooks() {
        Session session = this.sessionFactory.getCurrentSession();
        List<SimpleUser> bookList = session.createQuery("from users").list();

        for(SimpleUser book: bookList){
            logger.info("Book list: " + book);
        }

        return bookList;
    }
}
