package ru.sniper.Quest.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.sniper.Quest.controller.HibernateUtil;
import ru.sniper.Quest.model.Result;
import ru.sniper.Quest.model.User;

import java.util.List;

public class UserDao {

    public User findById(int id) {
        return (User) HibernateUtil.getSessionFactory().openSession().get(User.class, id);
    }

    public void save(User user) {
        //В текущей конфигурации тут вылетает java.lang.NullPointerException. Для теста использую класс Main
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public void update(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }

    public Result findResultById(int id) {
        return (Result) HibernateUtil.getSessionFactory().openSession().get(Result.class, id);
    }

    public List<User> findAllUser() {
        List<User> users = (List<User>) HibernateUtil.getSessionFactory().openSession().createQuery("from User").list();
        return users;
    }
}
