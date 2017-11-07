package com.newoasystem.oa.modle;

import java.sql.Time;

/**
 * Zichanshenqingdan entity. @author MyEclipse Persistence Tools
 */

public class Zichanshenqingdan implements java.io.Serializable {

	// Fields

	private Integer shenqingdanId;
	private Integer yuangongId;
	private String shebeiming;
	private Boolean chukuqingkuang;
	private Boolean rukuqingkuang;
	private Boolean zhurenshenpi;
	private Boolean zuzhangshenpi;
	private Time shenqingshijian;
	private Time huanhuishijian;

	// Constructors

	/** default constructor */
	public Zichanshenqingdan() {
	}

	/** minimal constructor */
	public Zichanshenqingdan(Integer shenqingdanId) {
		this.shenqingdanId = shenqingdanId;
	}

	/** full constructor */
	public Zichanshenqingdan(Integer shenqingdanId, Integer yuangongId,
			String shebeiming, Boolean chukuqingkuang, Boolean rukuqingkuang,
			Boolean zhurenshenpi, Boolean zuzhangshenpi, Time shenqingshijian,
			Time huanhuishijian) {
		this.shenqingdanId = shenqingdanId;
		this.yuangongId = yuangongId;
		this.shebeiming = shebeiming;
		this.chukuqingkuang = chukuqingkuang;
		this.rukuqingkuang = rukuqingkuang;
		this.zhurenshenpi = zhurenshenpi;
		this.zuzhangshenpi = zuzhangshenpi;
		this.shenqingshijian = shenqingshijian;
		this.huanhuishijian = huanhuishijian;
	}

	// Property accessors

	public Integer getShenqingdanId() {
		return this.shenqingdanId;
	}

	public void setShenqingdanId(Integer shenqingdanId) {
		this.shenqingdanId = shenqingdanId;
	}

	public Integer getYuangongId() {
		return this.yuangongId;
	}

	public void setYuangongId(Integer yuangongId) {
		this.yuangongId = yuangongId;
	}

	public String getShebeiming() {
		return this.shebeiming;
	}

	public void setShebeiming(String shebeiming) {
		this.shebeiming = shebeiming;
	}

	public Boolean getChukuqingkuang() {
		return this.chukuqingkuang;
	}

	public void setChukuqingkuang(Boolean chukuqingkuang) {
		this.chukuqingkuang = chukuqingkuang;
	}

	public Boolean getRukuqingkuang() {
		return this.rukuqingkuang;
	}

	public void setRukuqingkuang(Boolean rukuqingkuang) {
		this.rukuqingkuang = rukuqingkuang;
	}

	public Boolean getZhurenshenpi() {
		return this.zhurenshenpi;
	}

	public void setZhurenshenpi(Boolean zhurenshenpi) {
		this.zhurenshenpi = zhurenshenpi;
	}

	public Boolean getZuzhangshenpi() {
		return this.zuzhangshenpi;
	}

	public void setZuzhangshenpi(Boolean zuzhangshenpi) {
		this.zuzhangshenpi = zuzhangshenpi;
	}

	public Time getShenqingshijian() {
		return this.shenqingshijian;
	}

	public void setShenqingshijian(Time shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}

	public Time getHuanhuishijian() {
		return this.huanhuishijian;
	}

	public void setHuanhuishijian(Time huanhuishijian) {
		this.huanhuishijian = huanhuishijian;
	}

}