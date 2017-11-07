package com.newoasystem.oa.dao.Impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.newoasystem.oa.dao.LoginDao;
import com.newoasystem.oa.modle.Renyuandangan;
import com.newoasystem.oa.util.HibernateSessionFactory;

public class LoginDaoImpl implements LoginDao {

	public Renyuandangan checkLogin(String xingming, String mima) {//检验登录的用户名和密码是否一致
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		Renyuandangan ryda=null;
		try{
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from Renyuandangan where xingming=? and mima=?");
			query.setParameter(0, xingming);
			query.setParameter(1, mima);
			query.setMaxResults(1);
			ryda=(Renyuandangan)query.uniqueResult();
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
			}
			
		}
		return ryda;
	}

}
