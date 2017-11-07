package com.newoasystem.oa.dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.newoasystem.oa.dao.RenyuandanganDao;
import com.newoasystem.oa.modle.Renyuandangan;
import com.newoasystem.oa.util.HibernateSessionFactory;

public class RenyuandanganDaoImpl implements RenyuandanganDao {

	public boolean addRenyuandangan(Renyuandangan renyuandangan) {//添加员工信息
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		boolean sign=false;
		try{
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			if((Integer)session.save(renyuandangan)>0){
				sign=true;
			}
			tx.commit();
			
		}catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("添加数据时发生错误！",e); 
		}finally{
			
			session.close();
		}
		return sign;
	}

	public boolean deleteRenyuandangan(int yuangongId) {//删除员工信息
		// TODO Auto-generated method stub
		return false;
	}

	public List<Renyuandangan> selectByXingming(String xingming,int pagesize,int pagenow) {//根据员工姓名查询员工
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Renyuandangan> l=null;
		try{
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from Renyuandangan where xingming like: xingming");
			query.setString("xingming", "%" + xingming + "%");
			query.setFirstResult(pagesize*(pagenow-1));
			query.setMaxResults(pagesize);
			l=query.list();
			tx.commit();
			
		}catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("查询数据时发生错误！",e); 
		}finally{
			
			session.close();
		}
		return l;
	}

	public Renyuandangan selectByYuangongId(int yuangongId) {//根据员工Id号查询员工
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		Renyuandangan r=null;
		try {
			session =HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from Renyuandangan where yuangongId = ?");
			query.setParameter(0, yuangongId);
			query.setMaxResults(1);
			r=(Renyuandangan)query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("查询数据时发生错误！",e); 
		}finally{
			
			session.close();
		}
		return r;
	}

	public boolean updateRenyuandangan(Renyuandangan renyuandangan) {//修改员工信息
		// TODO Auto-generated method stub
		 Session session=null;
		 Transaction tx=null;
		 boolean sign=false;
		 try {
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			session.update(renyuandangan);
			tx.commit();
			sign=true;
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			sign=false;
			throw new RuntimeException("查询数据时发生错误！",e); 
		}finally{
			session.close();
		}
		return sign;
	}

	public List<Renyuandangan> selectByZuBie(int xiaozuId,int pagesize,int pagenow) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Renyuandangan> l=null;
		try{
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from Renyuandangan where XiaozuId = ?");
			query.setParameter(0, xiaozuId);
			query.setFirstResult(pagesize*(pagenow-1));
			query.setMaxResults(pagesize);
			l=query.list();
			tx.commit();
			
		}catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("查询数据时发生错误！",e); 
		}finally{
			
			session.close();
		}
		return l;
	}

	public int selectByXingming(String xingming) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		int m=0;
		try{
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from Renyuandangan where xingming like: xingming");
			query.setString("xingming", "%" + xingming + "%");
			m=query.list().size();
			tx.commit();
			
		}catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("查询数据时发生错误！",e); 
		}finally{
			
			session.close();
		}
		
		return m;
	}

	public int selectByZuBie(int xiaozuId) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		int m=0;
		try{
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from Renyuandangan where XiaozuId = ?");
			query.setParameter(0, xiaozuId);
			m=query.list().size();
			tx.commit();
			
		}catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("查询数据时发生错误！",e); 
		}finally{
			
			session.close();
		}
		return m;
	}

	public List selectAllYuangong(int pagesize, int pagenow) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Renyuandangan> l=null;
		try{
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from Renyuandangan ");
			
			query.setFirstResult(pagesize*(pagenow-1));
			query.setMaxResults(pagesize);
			l=query.list();
			tx.commit();
			
		}catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("查询数据时发生错误！",e); 
		}finally{
			
			session.close();
		}
		return l;
	}

	public int selectAllYuangong() {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		int m=0;
		try{
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from Renyuandangan ");
			m=query.list().size();
			tx.commit();
			
		}catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("查询数据时发生错误！",e); 
		}finally{
			
			session.close();
		}
		return m;
	
	}

	public void updateYuanqongQx(int yuangongId,String quanxian) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try{
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			Renyuandangan r=(Renyuandangan)session.get(Renyuandangan.class, yuangongId);
			r.setQuanxian(quanxian);
		    session.update(r);
			tx.commit();
			
		}catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)tx.rollback();
			throw new RuntimeException("查询数据时发生错误！",e); 
		}finally{
			
			session.close();
		}
	}

}
