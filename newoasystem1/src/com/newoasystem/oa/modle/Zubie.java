package com.newoasystem.oa.modle;



/**
 * Zubie entity. @author MyEclipse Persistence Tools
 */

public class Zubie  implements java.io.Serializable {


    // Fields    

     private Integer xiaozuId;
     private String zuming;
     private Integer zhuren;
     private Integer zuzhang;


    // Constructors

    /** default constructor */
    public Zubie() {
    }

    
    /** full constructor */
    public Zubie(String zuming, Integer zhuren, Integer zuzhang) {
        this.zuming = zuming;
        this.zhuren = zhuren;
        this.zuzhang = zuzhang;
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
   








}