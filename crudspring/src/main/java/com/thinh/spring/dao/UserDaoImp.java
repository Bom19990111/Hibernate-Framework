package com.thinh.spring.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.thinh.spring.entity.User;

@Repository
@Transactional
public class UserDaoImp implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<User> findAll() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		Root<User> root = cq.from(User.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public User findUserById(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		User user = currentSession.get(User.class, id);
		return user;
	}

	@Override
	public boolean checkLogin(User user) {
		boolean isUser = false;
		for (User u : findAll()) {
			if (u.getUserName().equals(user.getUserName()) && u.getPassWord().equals(user.getPassWord())) {
				isUser = true;
				return isUser;
			}
		}
		return isUser;
	}

	@Override
	public void register(User user) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(user);
	}

}
