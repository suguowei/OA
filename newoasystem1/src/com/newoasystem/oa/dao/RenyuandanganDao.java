package com.newoasystem.oa.dao;

import java.util.List;

import com.newoasystem.oa.modle.Renyuandangan;

public interface RenyuandanganDao {
public boolean addRenyuandangan(Renyuandangan renyuandangan);//添加人员档案信息
public Renyuandangan selectByYuangongId(int yuangongId);//通过员工ID号查询员工
public List<Renyuandangan> selectByXingming(String xingming,int pagesize,int pagenow);//通过姓名来查询员工来模糊查询
public boolean deleteRenyuandangan(int yuangongId);//删除员工信息
public boolean updateRenyuandangan(Renyuandangan renyuandangan);//修改员工信息
public List<Renyuandangan>selectByZuBie(int xiaozuId,int pagesize, int pagenow);//通过小组ID查询员工信息
public int selectByZuBie(int xiaozuId);//查询该小组有多少人
public int selectByXingming(String xingming);//统计模糊查询出来的总和
public List<Renyuandangan> selectAllYuangong(int pagesize,int pagenow);//查询所有员工的信息
public int selectAllYuangong();//查询所有员工的总和
public void updateYuanqongQx(int yuangongId,String quanxian);
}
