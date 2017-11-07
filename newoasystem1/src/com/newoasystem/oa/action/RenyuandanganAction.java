package com.newoasystem.oa.action;

import java.util.List;
import java.util.Map;
import com.newoasystem.oa.dao.RenyuandanganDao;
import com.newoasystem.oa.dao.XiaozuDao;
import com.newoasystem.oa.dao.Impl.RenyuandanganDaoImpl;
import com.newoasystem.oa.dao.Impl.XiaozuDaoImpl;
import com.newoasystem.oa.modle.Renyuandangan;
import com.newoasystem.oa.modle.Zubie;
import com.newoasystem.oa.util.Pager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RenyuandanganAction extends ActionSupport{
	 private Renyuandangan renyuandangan;
	 private String message;
	 private int xiaozxuId;   
	 private int pageNow=1;
	 private int pageSize=4;
	 private int yuangongId;
	public String addRenyuangdangan()throws Exception{//添加员工信息
		RenyuandanganDao rydadao=new RenyuandanganDaoImpl();
		if(rydadao.selectByYuangongId(renyuandangan.getYuangongId())!=null){//判断员工是否已存在
			this.setMessage("该员工已存在");
			return SUCCESS;	
		}
		Renyuandangan ryda=new Renyuandangan();
		ryda.setBenrenlianxifangshi(renyuandangan.getBenrenlianxifangshi());
		ryda.setBiyeyuanxiao(renyuandangan.getBiyeyuanxiao());
		ryda.setChushengshijian(renyuandangan.getChushengshijian());
		ryda.setDangtuanshijian(renyuandangan.getDangtuanshijian());
		ryda.setJiguan(renyuandangan.getJiguan());
		ryda.setMima(renyuandangan.getMima());
		ryda.setQinshulianxifangshi(renyuandangan.getQinshulianxifangshi());
		ryda.setQuanxian(renyuandangan.getQuanxian());
		ryda.setRuzhishijian(renyuandangan.getRuzhishijian());
		ryda.setWenhuachengdu(renyuandangan.getWenhuachengdu());
		ryda.setXingbie(renyuandangan.getXingbie());
		ryda.setXingming(renyuandangan.getXingming());
		ryda.setXingzhi(renyuandangan.getXingzhi());
		ryda.setYuangongId(renyuandangan.getYuangongId());
		ryda.setZhengzhimianmao(renyuandangan.getZhengzhimianmao());
		ryda.setZhuanye(renyuandangan.getZhuanye());
		ryda.setZubie(renyuandangan.getZubie());
		if(rydadao.addRenyuandangan(ryda)){
			this.setMessage("添加成功！");
			return SUCCESS;
		}else{
			this.setMessage("添加失败");
			return SUCCESS;
		}
		
		
	}
	public String selectByZubieId()throws Exception{//根据员工组别查询员工信息
		RenyuandanganDao rydadao=new RenyuandanganDaoImpl();
		List<Renyuandangan> l=rydadao.selectByZuBie(this.getXiaozuId(),this.getPageSize(),this.getPageNow());//实现分页效果
		if(l!=null){
			Map request=(Map)ActionContext.getContext().get("request");
			Pager page=new Pager(this.getPageNow(),rydadao.selectByZuBie(this.getXiaozuId()));
			request.put("page",page);
			request.put("yglist", l);
			return SUCCESS;
		}else{
			this.setMessage("该小组还没有添加员工");
			return SUCCESS;
		}
	}
	public String selectByXingming()throws Exception{//根据员工的姓名进行模糊搜索
		RenyuandanganDao rydadao=new RenyuandanganDaoImpl();
		List<Renyuandangan> l=rydadao.selectByXingming(renyuandangan.getXingming(), this.getPageSize(),this.getPageNow());//实现分页效果
		if(l!=null){
			Map request=(Map)ActionContext.getContext().get("request");
			Pager page=new Pager(this.pageNow,rydadao.selectByXingming(renyuandangan.getXingming()));
			request.put("page",page);
			request.put("ygbyxxlist", l);
			return SUCCESS;
		}else{
			this.setMessage("没有搜到相关的人");
			return SUCCESS;
		}
	}
	public String updateYuanGongxinxi()throws Exception{//修改员工信息
		RenyuandanganDao rydadao=new RenyuandanganDaoImpl();
		Renyuandangan ryda=new Renyuandangan();
		ryda.setBenrenlianxifangshi(renyuandangan.getBenrenlianxifangshi());
		ryda.setBiyeyuanxiao(renyuandangan.getBiyeyuanxiao());
		ryda.setChushengshijian(renyuandangan.getChushengshijian());
		ryda.setDangtuanshijian(renyuandangan.getDangtuanshijian());
		ryda.setJiguan(renyuandangan.getJiguan());
		ryda.setMima(renyuandangan.getMima());
		ryda.setQinshulianxifangshi(renyuandangan.getQinshulianxifangshi());
		ryda.setQuanxian(renyuandangan.getQuanxian());
		ryda.setRuzhishijian(renyuandangan.getRuzhishijian());
		ryda.setWenhuachengdu(renyuandangan.getWenhuachengdu());
		ryda.setXingbie(renyuandangan.getXingbie());
		ryda.setXingming(renyuandangan.getXingming());
		ryda.setXingzhi(renyuandangan.getXingzhi());
		ryda.setYuangongId(renyuandangan.getYuangongId());
		ryda.setZhengzhimianmao(renyuandangan.getZhengzhimianmao());
		ryda.setZhuanye(renyuandangan.getZhuanye());
		ryda.setZubie(renyuandangan.getZubie());
		if(rydadao.updateRenyuandangan(ryda)){
			this.setMessage("修改成功！");
			return SUCCESS;
		}else{
			this.setMessage("修改失败");
			return SUCCESS;
		}
		
	}
	public String selectAllYuangong()throws Exception{//查询所有员工信息
		RenyuandanganDao rydadao=new RenyuandanganDaoImpl();
		XiaozuDao xiaozudao=new XiaozuDaoImpl();
		List<Renyuandangan> l=rydadao.selectAllYuangong(this.getPageSize(), this.getPageNow());
		List<Zubie>zbl=xiaozudao.selectAllXiaozu();
		if(l!=null){
			Map request=(Map)ActionContext.getContext().get("request");
			Pager page=new Pager(this.pageNow,rydadao.selectAllYuangong());
			request.put("page",page);
			request.put("allygbyxxlist", l);
			request.put("xiaozulist", zbl);
			return SUCCESS;		
		}else{
			this.setMessage("暂时没有添加人员信息");
			return SUCCESS;
		}
	}
	public String selectByYuangongId()throws Exception{
		RenyuandanganDao rydadao=new RenyuandanganDaoImpl();
		XiaozuDao xiaozudao=new XiaozuDaoImpl();
		List<Zubie>zbl=xiaozudao.selectAllXiaozu();
		Renyuandangan ry=rydadao.selectByYuangongId(this.getYuangongId());
		if(ry!=null){
			Map request=(Map)ActionContext.getContext().get("request");
			request.put("ygxx", ry);
			request.put("xiaozulist", zbl);
			return SUCCESS;		
		}else{
			this.setMessage("系统出问题！");
			return SUCCESS;
		}
	}
	 public Renyuandangan getRenyuandangan(){
	 	   return renyuandangan;
	 }
	 public void setRenyuandangan(Renyuandangan renyuandangan){
	 	   this.renyuandangan=renyuandangan;
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
		public void setYuangongId(int yuangongId){
			
			this.yuangongId=yuangongId;
		}
		public int getYuangongId(){
			return yuangongId;
		}
}
