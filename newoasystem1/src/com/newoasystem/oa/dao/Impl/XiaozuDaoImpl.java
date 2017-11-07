package com.newoasystem.oa.dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.ResultTransformer;
import org.hibernate.transform.Transformers;

import com.mysql.jdbc.EscapeTokenizer;
import com.newoasystem.oa.dao.XiaozuDao;
import com.newoasystem.oa.modle.Xiaozu;
import com.newoasystem.oa.modle.Zubie;
import com.newoasystem.oa.util.HibernateSessionFactory;

public class XiaozuDaoImpl implements XiaozuDao {

	public boolean addXiaozu(Zubie zubie) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		boolean sign=false;
		try {
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			session.save(zubie);
			tx.commit();
			sign=true;
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("添加小组时失败！",e); 
		}finally{
			session.close();
		}
		return sign;
	}

	public boolean deleteXiaozu(int xiaozuId) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		boolean sign=false;
		Zubie zb=null;//定义一个小组变量
		try {
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			zb=(Zubie)session.get(Zubie.class, xiaozuId);
			session.delete(zb);
			tx.commit();
			sign=true;
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("添加小组时失败！",e); 
		}finally{
			
			session.close();
		}
		return sign;
		
	}

	public List<Zubie> selectAllXiaozu() {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List l=null;
		try {
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
		    String hql="SELECT z.xiaozuId AS xiaozuId, z.zuming AS zuming, z.zuzhang AS zuzhang, z.zhuren AS zhuren, r1.xingming AS zhurenm, r2.xingming AS zuzhangm FROM Zubie AS z LEFT JOIN Renyuandangan AS r1 ON r1.yuangongId = z.zhuren LEFT JOIN Renyuandangan AS r2 ON r2.yuangongId = z.zuzhang";
			Query query=session.createSQLQuery(hql);
			query.setResultTransformer(Transformers.aliasToBean(Xiaozu.class));
			l=query.list();
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("查询失败！",e); 
		}
		return l;
	}

	public Zubie selectByXiaozuId(int xiaozuId) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		
		Zubie zb=null;//定义一个小组变量
		try {
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from Zubie");
			query.setMaxResults(1);
			zb=(Zubie)query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("查询失败！",e); 
		}finally{
			session.close();
		}
		return zb;
	}

	public boolean updateXiaozu(Zubie zubie) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		boolean sign=false;
		try {
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
		    session.update(zubie);
			tx.commit();
			sign=true;
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("查询失败！",e); 
		}finally{
			session.close();
		}
		return sign;
	}

}
