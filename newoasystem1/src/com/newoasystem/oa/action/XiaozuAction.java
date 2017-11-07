package com.newoasystem.oa.action;

import java.util.List;
import java.util.Map;

import com.newoasystem.oa.dao.RenyuandanganDao;
import com.newoasystem.oa.dao.XiaozuDao;
import com.newoasystem.oa.dao.Impl.RenyuandanganDaoImpl;
import com.newoasystem.oa.dao.Impl.XiaozuDaoImpl;
import com.newoasystem.oa.modle.Zubie;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class XiaozuAction extends ActionSupport {
	private Zubie zubie;
	private String message;
	private int xiaozxuId;  
public String addXiaozu()throws Exception{//添加小组
	RenyuandanganDao rydadao=new RenyuandanganDaoImpl();
	XiaozuDao xiaozudao=new XiaozuDaoImpl();
	Zubie zb=new Zubie();
	if(zubie.getZhuren()!=null){
		zb.setZhuren(zubie.getZhuren());
		rydadao.updateYuanqongQx(zubie.getZhuren(), "zhuren");//同时添加员工的权限为主任
	}
	zb.setZuming(zubie.getZuming());
	if(zubie.getZuzhang()!=null){
		zb.setZuzhang(zubie.getZuzhang());
		rydadao.updateYuanqongQx(zubie.getZuzhang(), "zuzhang");//同时添加员工的权限为组长
	}
	if(xiaozudao.addXiaozu(zb)){
		this.setMessage("添加成功！");
		return SUCCESS;
	}else{
		this.setMessage("添加失败");
		return SUCCESS;
	}
}
public String selectByXiaozuId()throws Exception{//根据小组Id查询小组
	XiaozuDao xiaozudao=new XiaozuDaoImpl();
	Zubie zb=xiaozudao.selectByXiaozuId(this.getXiaozuId());
	if(zb!=null){
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("xiaozu", zb);
	}else{
		this.setMessage("不存在该小组");
	}
	return SUCCESS;
}
public String selectAllXiaozu()throws Exception{//查询所有的小组信息
	XiaozuDao xiaozudao=new XiaozuDaoImpl();
	List l=xiaozudao.selectAllXiaozu();
	if(l!=null){
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("xiaozulist", l);
	}else{
		this.setMessage("系统还没有添加小组");
		
	}
	return SUCCESS;
}
public String updateXiaozu()throws Exception{//更新小组信息
	XiaozuDao xiaozudao=new XiaozuDaoImpl();
	RenyuandanganDao rydadao=new RenyuandanganDaoImpl();
	Zubie zb=new Zubie();
	 
	if(zubie.getZhuren()!=null){
		zb.setZhuren(zubie.getZhuren());
		rydadao.updateYuanqongQx(zubie.getZhuren(), "zhuren");//更新员工的权限为主任
	}
	zb.setZuming(zubie.getZuming());
	if(zubie.getZuzhang()!=null){
		zb.setZuzhang(zubie.getZuzhang());
		rydadao.updateYuanqongQx(zubie.getZuzhang(), "zuzhang");//更新员工的权限为组长
	}
	if(xiaozudao.updateXiaozu(zb)){
		this.setMessage("更新成功");	
	}else{
		this.setMessage("跟新失败");
	}
	return SUCCESS;
}
public String deleteXiaozu()throws Exception{
	XiaozuDao xiaozudao=new XiaozuDaoImpl();
	if(xiaozudao.deleteXiaozu(this.getXiaozuId())){
		this.setMessage("删除成功");
	}else{
		this.setMessage("删除失败");
	}
	return SUCCESS;
}
public String getMessage(){
	   return message;
}
public void setMessage(String message){
	   this.message=message;
}
public void setZubie(Zubie zubie){
	this.zubie=zubie;
}
public Zubie getZubie(){
	return zubie;
}
public void setXiaozuId(int xiaozuId){
	 this.xiaozxuId=xiaozuId;
}
public int getXiaozuId(){
	 
	 return xiaozxuId;
}
}
