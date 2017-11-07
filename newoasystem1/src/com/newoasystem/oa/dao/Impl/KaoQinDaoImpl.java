package com.newoasystem.oa.dao.Impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.newoasystem.oa.dao.KaoQinDao;
import com.newoasystem.oa.modle.Kaoqinxinxi;
import com.newoasystem.oa.util.HibernateSessionFactory;

public class KaoQinDaoImpl implements KaoQinDao {

	public boolean addKaoqin(Kaoqinxinxi kaoqinxinxi) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		boolean sign=false;
		try {
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			session.save(kaoqinxinxi);
			tx.commit();
			sign=true;
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("添加数据时发生错误！",e);
		}finally{
			session.close();
		}
		return sign;
	}

	public List<Kaoqinxinxi> selectKaoQin(Date date, int pagenow, int pagesize) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Kaoqinxinxi> l=null;
		try {
          session=HibernateSessionFactory.getSession();
          tx=session.beginTransaction();
         Query query=session.createQuery("from Kaoqinxinxi where shijian=?");
         query.setParameter(0, date);
         query.setFirstResult(pagenow);
         query.setMaxResults(pagesize*(pagenow-1));
         l=query.list();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("查询全部考勤信息时，系统内部出错！",e);
		}finally{
			session.close();
		}
		return l;
	}

	public int selectKaoQin(Date date) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		int m=0;try {
	          session=HibernateSessionFactory.getSession();
	          tx=session.beginTransaction();
	         Query query=session.createQuery("from Kaoqinxinxi where shijian=?");
	         query.setParameter(0, date);
	         m=query.list().size();
			} catch (Exception e) {
				// TODO: handle exception
				if(tx!=null)tx.rollback();
				throw new RuntimeException("查询全部考勤信息时，系统内部出错！",e);
			}finally{
				session.close();
			}
			return m;
	}

	public List selectKaoqinByXaiozuId(int zubie, Date date, int pagenow,
			int pagesize) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Kaoqinxinxi> l=null;
		try {
          session=HibernateSessionFactory.getSession();
          tx=session.beginTransaction();
         Query query=session.createSQLQuery("SELECT * FROM kaoqinxinxi AS k LEFT JOIN renyuandangan AS r ON r.zubie=? WHERE k.shijian=?");
         query.setParameter(0, date);
         query.setParameter(1, zubie);
         query.setFirstResult(pagenow);
         query.setMaxResults(pagesize*(pagenow-1));
         l=query.list();
         tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("通过小组查询全部考勤信息时，系统内部出错！",e);
		}finally{
			session.close();
		}
		return l;
	}

	public int selectKaoqinByXaiozuId(int zubie, Date date) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		int m=0;
		try {
			session=HibernateSessionFactory.getSession();
	          tx=session.beginTransaction();
	         Query query=session.createSQLQuery("SELECT * FROM kaoqinxinxi AS k LEFT JOIN renyuandangan AS r ON r.zubie=? WHERE k.shijian=?");
	         query.setParameter(0, date);
	         query.setParameter(1, zubie);
	         m=query.list().size();
	         tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("通过小组查询全部考勤信息时，系统内部出错！",e);
		}finally{
			session.close();
		}
		return m;
	}

	public boolean updateKaoQin(Kaoqinxinxi kaoqinxinxi) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		boolean sign=false;
		try {
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			session.update(kaoqinxinxi);
			tx.commit();
			sign=true;
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException(" 更新考勤信息时，系统内部出错！",e);
		}finally{
			session.close();
		}
		return sign;
	}

	public boolean deleteKaoQin(int kaoqinId) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		boolean sign=false;
		try {
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			Kaoqinxinxi kaoqin=(Kaoqinxinxi)session.get(Kaoqinxinxi.class, kaoqinId);
			session.delete(kaoqin);
			tx.commit();
			sign=true;
		} catch (Exception e) {
			if(tx!=null)tx.rollback();
			throw new RuntimeException("删除考勤信息时，系统内部出错！",e);
		}finally{
			session.close();
		}
		return sign;
	}

}
