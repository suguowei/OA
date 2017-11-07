package com.newoasystem.oa.modle;

import java.util.Date;

/**
 * Renyuandangan entity. @author MyEclipse Persistence Tools
 */

public class Renyuandangan implements java.io.Serializable {

	// Fields

	private Integer yuangongId;
	private String xingming;
	private boolean xingbie;
	private Integer zubie;
	private Date chushengshijian;
	private Date ruzhishijian;
	private String zhengzhimianmao;
	private Date dangtuanshijian;
	private String wenhuachengdu;
	private String biyeyuanxiao;
	private String zhuanye;
	private String jiguan;
	private String benrenlianxifangshi;
	private String qinshulianxifangshi;
	private String xingzhi;
	private String quanxian;
	private String mima;

	// Constructors

	/** default constructor */
	public Renyuandangan() {
	}

	/** minimal constructor */
	public Renyuandangan(Integer yuangongId) {
		this.yuangongId = yuangongId;
	}

	/** full constructor */
	public Renyuandangan(Integer yuangongId, String xingming, boolean xingbie,
			Integer zubie, Date chushengshijian, Date ruzhishijian,
			String zhengzhimianmao, Date dangtuanshijian, String wenhuachengdu,
			String biyeyuanxiao, String zhuanye, String jiguan,
			String benrenlianxifangshi, String qinshulianxifangshi,
			String xingzhi, String quanxian, String mima) {
		this.yuangongId = yuangongId;
		this.xingming = xingming;
		this.xingbie = xingbie;
		this.zubie = zubie;
		this.chushengshijian = chushengshijian;
		this.ruzhishijian = ruzhishijian;
		this.zhengzhimianmao = zhengzhimianmao;
		this.dangtuanshijian = dangtuanshijian;
		this.wenhuachengdu = wenhuachengdu;
		this.biyeyuanxiao = biyeyuanxiao;
		this.zhuanye = zhuanye;
		this.jiguan = jiguan;
		this.benrenlianxifangshi = benrenlianxifangshi;
		this.qinshulianxifangshi = qinshulianxifangshi;
		this.xingzhi = xingzhi;
		this.quanxian = quanxian;
		this.mima = mima;
	}

	// Property accessors

	public Integer getYuangongId() {
		return this.yuangongId;
	}

	public void setYuangongId(Integer yuangongId) {
		this.yuangongId = yuangongId;
	}

	public String getXingming() {
		return this.xingming;
	}

	public void setXingming(String xingming) {
		this.xingming = xingming;
	}

	public boolean getXingbie() {
		return this.xingbie;
	}

	public void setXingbie(boolean xingbie) {
		this.xingbie = xingbie;
	}

	public Integer getZubie() {
		return this.zubie;
	}

	public void setZubie(Integer zubie) {
		this.zubie = zubie;
	}

	public Date getChushengshijian() {
		return this.chushengshijian;
	}

	public void setChushengshijian(Date chushengshijian) {
		this.chushengshijian = chushengshijian;
	}

	public Date getRuzhishijian() {
		return this.ruzhishijian;
	}

	public void setRuzhishijian(Date ruzhishijian) {
		this.ruzhishijian = ruzhishijian;
	}

	public String getZhengzhimianmao() {
		return this.zhengzhimianmao;
	}

	public void setZhengzhimianmao(String zhengzhimianmao) {
		this.zhengzhimianmao = zhengzhimianmao;
	}

	public Date getDangtuanshijian() {
		return this.dangtuanshijian;
	}

	public void setDangtuanshijian(Date dangtuanshijian) {
		this.dangtuanshijian = dangtuanshijian;
	}

	public String getWenhuachengdu() {
		return this.wenhuachengdu;
	}

	public void setWenhuachengdu(String wenhuachengdu) {
		this.wenhuachengdu = wenhuachengdu;
	}

	public String getBiyeyuanxiao() {
		return this.biyeyuanxiao;
	}

	public void setBiyeyuanxiao(String biyeyuanxiao) {
		this.biyeyuanxiao = biyeyuanxiao;
	}

	public String getZhuanye() {
		return this.zhuanye;
	}

	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}

	public String getJiguan() {
		return this.jiguan;
	}

	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}

	public String getBenrenlianxifangshi() {
		return this.benrenlianxifangshi;
	}

	public void setBenrenlianxifangshi(String benrenlianxifangshi) {
		this.benrenlianxifangshi = benrenlianxifangshi;
	}

	public String getQinshulianxifangshi() {
		return this.qinshulianxifangshi;
	}

	public void setQinshulianxifangshi(String qinshulianxifangshi) {
		this.qinshulianxifangshi = qinshulianxifangshi;
	}

	public String getXingzhi() {
		return this.xingzhi;
	}

	public void setXingzhi(String xingzhi) {
		this.xingzhi = xingzhi;
	}

	public String getQuanxian() {
		return this.quanxian;
	}

	public void setQuanxian(String quanxian) {
		this.quanxian = quanxian;
	}

	public String getMima() {
		return this.mima;
	}

	public void setMima(String mima) {
		this.mima = mima;
	}

}