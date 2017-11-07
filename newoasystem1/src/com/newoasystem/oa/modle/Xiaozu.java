package com.newoasystem.oa.modle;



/**
 * Xiaozu entity. @author MyEclipse Persistence Tools
 */

public class Xiaozu implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer xiaozuId;
     private String zuming;
     private Integer zhuren;
     private Integer zuzhang;
     private String zhurenm;
     private String zuzhangm;
    // Constructors

    /** default constructor */
    public Xiaozu() {
    }

    
    /** full constructor */
    public Xiaozu(String zuming, Integer zhuren, Integer zuzhang,String zhurenm,String zuzhangm) {
        this.zuming = zuming;
        this.zhuren = zhuren;
        this.zuzhang = zuzhang;
        this.zhurenm=zhurenm;
        this.zuzhangm=zuzhangm;
    }

   
    // Property accessors

    public Integer getXiaozuId() {
        return this.xiaozuId;
    }
    
    public void setXiaozuId(Integer xiaozuId) {
        this.xiaozuId = xiaozuId;
    }

    public String getZuming() {
        return this.zuming;
    }
    
    public void setZuming(String zuming) {
        this.zuming = zuming;
    }

    public Integer getZhuren() {
        return this.zhuren;
    }
    
    public void setZhuren(Integer zhuren) {
        this.zhuren = zhuren;
    }

    public Integer getZuzhang() {
        return this.zuzhang;
    }
    
    public void setZuzhang(Integer zuzhang) {
        this.zuzhang = zuzhang;
    }
   public String getZuzhangm(){
	   return this.zuzhangm;
   } 
   public void setZuzhangm(String zuzhangm){
	this.zuzhangm=zuzhangm;
   }
   public String getZhurenm(){
	   return zhurenm;
   }
   public void setZhurenm(String zhurenm){
	   this.zhurenm=zhurenm;
   }





}