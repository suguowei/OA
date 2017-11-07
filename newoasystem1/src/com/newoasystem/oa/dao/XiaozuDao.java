package com.newoasystem.oa.dao;

import java.util.List;

import com.newoasystem.oa.modle.Zubie;

public interface XiaozuDao {
	public boolean addXiaozu(Zubie zubie);//添加小组
	public Zubie selectByXiaozuId(int xiaozuId);
	public List<Zubie>selectAllXiaozu();//查询所有的小组
	public boolean deleteXiaozu(int xiaozuId);//删除小组
    public boolean updateXiaozu(Zubie zubie);//更新小组信息 
}
