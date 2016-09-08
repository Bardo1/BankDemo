package com.bankdemo.dao.impl;

import com.bankdemo.dao.UserDAO;
import com.bankdemo.model.user.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Ilyas.Kuanyshbekov on 07.09.2016.
 */
@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public void updateUser(User user) {
        em.merge(user);
    }

    @Override
    public User getUser(int id) {
        return em.find(User.class, id);
    }

    @Override
    public void deleteUser(int id) {
        em.remove(getUser(id));
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getUsers() {
        return (List<User>) em.createQuery("").getResultList();
    }
}