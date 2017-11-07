package com.newoasystem.oa.modle;

/**
 * Rencaiku entity. @author MyEclipse Persistence Tools
 */

public class Rencaiku implements java.io.Serializable {

	// Fields

	private Integer recruiterId;
	private String xingming;
	private Boolean xingbie;
	private String wenhuachengdu;
	private String biyeyuanxiao;
	private Float bishifenshu;
	private String tuisongxiaozu;
	private Boolean shifoumianshi;
	private String jianli;
	private String zhuanye;
	private Boolean shifouyituisong;

	// Constructors

	/** default constructor */
	public Rencaiku() {
	}

	/** minimal constructor */
	public Rencaiku(Integer recruiterId) {
		this.recruiterId = recruiterId;
	}

	/** full constructor */
	public Rencaiku(Integer recruiterId, String xingming, Boolean xingbie,
			String wenhuachengdu, String biyeyuanxiao, Float bishifenshu,
			String tuisongxiaozu, Boolean shifoumianshi, String jianli,
			String zhuanye, Boolean shifouyituisong) {
		this.recruiterId = recruiterId;
		this.xingming = xingming;
		this.xingbie = xingbie;
		this.wenhuachengdu = wenhuachengdu;
		this.biyeyuanxiao = biyeyuanxiao;
		this.bishifenshu = bishifenshu;
		this.tuisongxiaozu = tuisongxiaozu;
		this.shifoumianshi = shifoumianshi;
		this.jianli = jianli;
		this.zhuanye = zhuanye;
		this.shifouyituisong = shifouyituisong;
	}

	// Property accessors

	public Integer getRecruiterId() {
		return this.recruiterId;
	}

	public void setRecruiterId(Integer recruiterId) {
		this.recruiterId = recruiterId;
	}

	public String getXingming() {
		return this.xingming;
	}

	public void setXingming(String xingming) {
		this.xingming = xingming;
	}

	public Boolean getXingbie() {
		return this.xingbie;
	}

	public void setXingbie(Boolean xingbie) {
		this.xingbie = xingbie;
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

	public Float getBishifenshu() {
		return this.bishifenshu;
	}

	public void setBishifenshu(Float bishifenshu) {
		this.bishifenshu = bishifenshu;
	}

	public String getTuisongxiaozu() {
		return this.tuisongxiaozu;
	}

	public void setTuisongxiaozu(String tuisongxiaozu) {
		this.tuisongxiaozu = tuisongxiaozu;
	}

	public Boolean getShifoumianshi() {
		return this.shifoumianshi;
	}

	public void setShifoumianshi(Boolean shifoumianshi) {
		this.shifoumianshi = shifoumianshi;
	}

	public String getJianli() {
		return this.jianli;
	}

	public void setJianli(String jianli) {
		this.jianli = jianli;
	}

	public String getZhuanye() {
		return this.zhuanye;
	}

	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}

	public Boolean getShifouyituisong() {
		return this.shifouyituisong;
	}

	public void setShifouyituisong(Boolean shifouyituisong) {
		this.shifouyituisong = shifouyituisong;
	}

}