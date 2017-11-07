package com.newoasystem.oa.modle;

import java.util.Date;

/**
 * Jixiao entity. @author MyEclipse Persistence Tools
 */

public class Jixiao implements java.io.Serializable {

	// Fields

	private Integer jixiaoId;
	private Integer yuangongId;
	private Integer zuzhangpingfen;
	private Integer jixiaojiangli;
	private Integer jixiaochacuo;
	private Boolean zhurenpizhun;
	private Date pingfenshijian;

	// Constructors

	/** default constructor */
	public Jixiao() {
	}

	/** minimal constructor */
	public Jixiao(Integer jixiaoId) {
		this.jixiaoId = jixiaoId;
	}

	/** full constructor */
	public Jixiao(Integer jixiaoId, Integer yuangongId, Integer zuzhangpingfen,
			Integer jixiaojiangli, Integer jixiaochacuo, Boolean zhurenpizhun,
			Date pingfenshijian) {
		this.jixiaoId = jixiaoId;
		this.yuangongId = yuangongId;
		this.zuzhangpingfen = zuzhangpingfen;
		this.jixiaojiangli = jixiaojiangli;
		this.jixiaochacuo = jixiaochacuo;
		this.zhurenpizhun = zhurenpizhun;
		this.pingfenshijian = pingfenshijian;
	}

	// Property accessors

	public Integer getJixiaoId() {
		return this.jixiaoId;
	}

	public void setJixiaoId(Integer jixiaoId) {
		this.jixiaoId = jixiaoId;
	}

	public Integer getYuangongId() {
		return this.yuangongId;
	}

	public void setYuangongId(Integer yuangongId) {
		this.yuangongId = yuangongId;
	}

	public Integer getZuzhangpingfen() {
		return this.zuzhangpingfen;
	}

	public void setZuzhangpingfen(Integer zuzhangpingfen) {
		this.zuzhangpingfen = zuzhangpingfen;
	}

	public Integer getJixiaojiangli() {
		return this.jixiaojiangli;
	}

	public void setJixiaojiangli(Integer jixiaojiangli) {
		this.jixiaojiangli = jixiaojiangli;
	}

	public Integer getJixiaochacuo() {
		return this.jixiaochacuo;
	}

	public void setJixiaochacuo(Integer jixiaochacuo) {
		this.jixiaochacuo = jixiaochacuo;
	}

	public Boolean getZhurenpizhun() {
		return this.zhurenpizhun;
	}

	public void setZhurenpizhun(Boolean zhurenpizhun) {
		this.zhurenpizhun = zhurenpizhun;
	}

	public Date getPingfenshijian() {
		return this.pingfenshijian;
	}

	public void setPingfenshijian(Date pingfenshijian) {
		this.pingfenshijian = pingfenshijian;
	}

}