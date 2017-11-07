package com.newoasystem.oa.modle;

/**
 * Zichan entity. @author MyEclipse Persistence Tools
 */

public class Zichan implements java.io.Serializable {

	// Fields

	private Integer zichanId;
	private String zichanming;
	private Integer shuliang;
	private Integer kucun;

	// Constructors

	/** default constructor */
	public Zichan() {
	}

	/** minimal constructor */
	public Zichan(Integer zichanId) {
		this.zichanId = zichanId;
	}

	/** full constructor */
	public Zichan(Integer zichanId, String zichanming, Integer shuliang,
			Integer kucun) {
		this.zichanId = zichanId;
		this.zichanming = zichanming;
		this.shuliang = shuliang;
		this.kucun = kucun;
	}

	// Property accessors

	public Integer getZichanId() {
		return this.zichanId;
	}

	public void setZichanId(Integer zichanId) {
		this.zichanId = zichanId;
	}

	public String getZichanming() {
		return this.zichanming;
	}

	public void setZichanming(String zichanming) {
		this.zichanming = zichanming;
	}

	public Integer getShuliang() {
		return this.shuliang;
	}

	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}

	public Integer getKucun() {
		return this.kucun;
	}

	public void setKucun(Integer kucun) {
		this.kucun = kucun;
	}

}