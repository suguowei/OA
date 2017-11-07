package com.newoasystem.oa.modle;

import java.sql.Time;

/**
 * Biaoge entity. @author MyEclipse Persistence Tools
 */

public class Biaoge implements java.io.Serializable {

	// Fields

	private Integer biaogeId;
	private Integer yuangongId;
	private String wenjianming;
	private Time shangchuanshijian;
	private String wenjian;

	// Constructors

	/** default constructor */
	public Biaoge() {
	}

	/** minimal constructor */
	public Biaoge(Integer biaogeId) {
		this.biaogeId = biaogeId;
	}

	/** full constructor */
	public Biaoge(Integer biaogeId, Integer yuangongId, String wenjianming,
			Time shangchuanshijian, String wenjian) {
		this.biaogeId = biaogeId;
		this.yuangongId = yuangongId;
		this.wenjianming = wenjianming;
		this.shangchuanshijian = shangchuanshijian;
		this.wenjian = wenjian;
	}

	// Property accessors

	public Integer getBiaogeId() {
		return this.biaogeId;
	}

	public void setBiaogeId(Integer biaogeId) {
		this.biaogeId = biaogeId;
	}

	public Integer getYuangongId() {
		return this.yuangongId;
	}

	public void setYuangongId(Integer yuangongId) {
		this.yuangongId = yuangongId;
	}

	public String getWenjianming() {
		return this.wenjianming;
	}

	public void setWenjianming(String wenjianming) {
		this.wenjianming = wenjianming;
	}

	public Time getShangchuanshijian() {
		return this.shangchuanshijian;
	}

	public void setShangchuanshijian(Time shangchuanshijian) {
		this.shangchuanshijian = shangchuanshijian;
	}

	public String getWenjian() {
		return this.wenjian;
	}

	public void setWenjian(String wenjian) {
		this.wenjian = wenjian;
	}

}