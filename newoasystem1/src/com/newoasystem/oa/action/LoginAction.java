package com.newoasystem.oa.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.newoasystem.oa.dao.LoginDao;
import com.newoasystem.oa.dao.Impl.LoginDaoImpl;
import com.newoasystem.oa.modle.*;

public class LoginAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Renyuandangan renyuandangan;
    private String message;
	public LoginAction() {
		// TODO Auto-generated constructor stub
	}
	
	public String execute()throws Exception{
		
		LoginDao logindao=new LoginDaoImpl();
		Renyuandangan yg =logindao.checkLogin(renyuandangan.getXingming(), renyuandangan.getMima());
		if(yg!=null){
			Map<String, Object>session=ActionContext.getContext().getSession();
			session.put("login", yg);//登陆成功，则把登录信息保存在Session中
			return SUCCESS;
		}else{
  			this.setMessage("用户名和密码不匹配！");//登录失败，登录也显示失败信息
			return ERROR;
		}
		
	}
	public void validate(){
		if(renyuandangan.getXingming()==null||renyuandangan.getXingming().equals("")){
			
			this.addFieldError("Xingming","用户名不能为空！");
		}else if(renyuandangan.getMima()==null||renyuandangan.getMima().equals("")){
			this.addFieldError("Mima","密码不能为空");
			
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
}
