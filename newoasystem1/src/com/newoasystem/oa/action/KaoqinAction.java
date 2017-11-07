package com.newoasystem.oa.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.newoasystem.oa.dao.KaoQinDao;
import com.newoasystem.oa.dao.Impl.KaoQinDaoImpl;
import com.newoasystem.oa.modle.Kaoqinxinxi;
import com.newoasystem.oa.util.Pager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class KaoqinAction extends ActionSupport{
 private Kaoqinxinxi kaoqinxinxi;
 private String message;
 private int xiaozxuId;  
 private Date shijian;
 private int kaoqinId;
 private int pageNow=1;
 private int pageSize=4;
 public String addKaoQin()throws Exception{//添加考勤信息
	 KaoQinDao kaoqindao=new KaoQinDaoImpl();
	 Kaoqinxinxi kqxx=new Kaoqinxinxi();
	 kqxx.setBingjia(kaoqinxinxi.getBingjia());
	 kqxx.setChidao(kaoqinxinxi.getChidao());
	 kqxx.setDaoxiu(kaoqinxinxi.getDaoxiu());
	 kqxx.setHunjia(kaoqinxinxi.getHunjia());
	 kqxx.setKuanggong(kaoqinxinxi.getKuanggong());
	 kqxx.setNianjia(kaoqinxinxi.getNianjia());
	 kqxx.setQita(kaoqinxinxi.getQita());
	 kqxx.setQuanqin(kaoqinxinxi.getQuanqin());
	 kqxx.setSangjia(kaoqinxinxi.getSangjia());
	 kqxx.setShijia(kaoqinxinxi.getSangjia());
	 kqxx.setShijian(kaoqinxinxi.getShijian());
	 kqxx.setWaiqin(kaoqinxinxi.getWaiqin());
	 if(kaoqindao.addKaoqin(kqxx)){
		 this.setMessage("添加成功！");
	 }else{
		 this.setMessage("添加失败!");
	 }
	 return SUCCESS;
 }
 public String selectAllKaoQin()throws Exception{//查询当月的所有考勤信息
	 KaoQinDao kaoqindao=new KaoQinDaoImpl();
	 List l=kaoqindao.selectKaoQin(this.getShijian(), this.getPageNow(),this.getPageSize());
	 if(l!=null){
		 Map request=(Map)ActionContext.getContext().get("request");
		 Pager page=new Pager(this.getPageNow(), kaoqindao.selectKaoQin(this.getShijian()));
		 request.put("kaoqinlist", l);
		 request.put("page", page);
		 
	 }else{
		 this.setMessage("暂无当月的考勤信息！");
	 }
	 return SUCCESS;
 }
 public String selectKaoQinByXiaoZu()throws Exception{//分小组查询考勤信息
	 KaoQinDao kaoqindao=new KaoQinDaoImpl();
	 List l=kaoqindao.selectKaoqinByXaiozuId(this.getXiaozuId(),this.getShijian(),this.getPageNow(),this.getPageSize());
	 if(l!=null){
		 Map request=(Map)ActionContext.getContext().get("request");
		 Pager page=new Pager(this.getPageNow(),kaoqindao.selectKaoqinByXaiozuId(this.getXiaozuId(),this.getShijian()));
         request.put("kaoqinbyxiaolist", l);
         request.put("page", page);
	 }else{
		 this.setMessage("暂无该小组的当月的考勤信息");
		 
	 }
	 return SUCCESS; 
 }
public String updateKaoQin()throws Exception{//修改考勤信息
	 KaoQinDao kaoqindao=new KaoQinDaoImpl();
	 Kaoqinxinxi kqxx=new Kaoqinxinxi();
	 kqxx.setBingjia(kaoqinxinxi.getBingjia());
	 kqxx.setChidao(kaoqinxinxi.getChidao());
	 kqxx.setDaoxiu(kaoqinxinxi.getDaoxiu());
	 kqxx.setHunjia(kaoqinxinxi.getHunjia());
	 kqxx.setKuanggong(kaoqinxinxi.getKuanggong());
	 kqxx.setNianjia(kaoqinxinxi.getNianjia());
	 kqxx.setQita(kaoqinxinxi.getQita());
	 kqxx.setQuanqin(kaoqinxinxi.getQuanqin());
	 kqxx.setSangjia(kaoqinxinxi.getSangjia());
	 kqxx.setShijia(kaoqinxinxi.getSangjia());
	 kqxx.setShijian(kaoqinxinxi.getShijian());
	 kqxx.setWaiqin(kaoqinxinxi.getWaiqin());
	 if(kaoqindao.updateKaoQin(kqxx)){
		 this.setMessage("修改成功！");
	 }else{
		 this.setMessage("修改失败！");
	 }
	 return SUCCESS;
} 
public String deleteKaoQin()throws Exception{
	 KaoQinDao kaoqindao=new KaoQinDaoImpl();
	 if(kaoqindao.deleteKaoQin(this.getKaoqinId())){
		 this.setMessage("删除成功！");
	 }else{
		 this.setMessage("删除失败！");
	 }
	return SUCCESS;
}
 public String getMessage(){
	   return message;
}
public void setMessage(String message){
	   this.message=message;
}
public void setXiaozuId(int xiaozuId){
	 this.xiaozxuId=xiaozuId;
}
public int getXiaozuId(){
	 
	 return xiaozxuId;
}
public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public void setShijian(Date shijian){
		this.shijian=shijian;
	}
	public Date getShijian(){
		return shijian;
	}
	public void setKaoqinId(int kaoqinId){
		this.kaoqinId=kaoqinId;
	}
	public int getKaoqinId(){
		return kaoqinId;
	}
}
