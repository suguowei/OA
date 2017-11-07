package com.newoasystem.oa.modle;

import java.util.Date;

/**
 * Kaoqinxinxi entity. @author MyEclipse Persistence Tools
 */

public class Kaoqinxinxi implements java.io.Serializable {

	// Fields

	private Integer kaoqingxinxiId;
	private Integer yuangongId;
	private Float shijia;
	private Float bingjia;
	private Float kuanggong;
	private Float chidao;
	private Float hunjia;
	private Float nianjia;
	private Float sangjia;
	private Float daoxiu;
	private Float waiqin;
	private Float qita;
	private Float quanqin;
	private Date shijian;

	// Constructors

	/** default constructor */
	public Kaoqinxinxi() {
	}

	/** minimal constructor */
	public Kaoqinxinxi(Integer kaoqingxinxiId) {
		this.kaoqingxinxiId = kaoqingxinxiId;
	}

	/** full constructor */
	public Kaoqinxinxi(Integer kaoqingxinxiId, Integer yuangongId,
			Float shijia, Float bingjia, Float kuanggong, Float chidao,
			Float hunjia, Float nianjia, Float sangjia, Float daoxiu,
			Float waiqin, Float qita, Float quanqin, Date shijian) {
		this.kaoqingxinxiId = kaoqingxinxiId;
		this.yuangongId = yuangongId;
		this.shijia = shijia;
		this.bingjia = bingjia;
		this.kuanggong = kuanggong;
		this.chidao = chidao;
		this.hunjia = hunjia;
		this.nianjia = nianjia;
		this.sangjia = sangjia;
		this.daoxiu = daoxiu;
		this.waiqin = waiqin;
		this.qita = qita;
		this.quanqin = quanqin;
		this.shijian = shijian;
	}

	// Property accessors

	public Integer getKaoqingxinxiId() {
		return this.kaoqingxinxiId;
	}

	public void setKaoqingxinxiId(Integer kaoqingxinxiId) {
		this.kaoqingxinxiId = kaoqingxinxiId;
	}

	public Integer getYuangongId() {
		return this.yuangongId;
	}

	public void setYuangongId(Integer yuangongId) {
		this.yuangongId = yuangongId;
	}

	public Float getShijia() {
		return this.shijia;
	}

	public void setShijia(Float shijia) {
		this.shijia = shijia;
	}

	public Float getBingjia() {
		return this.bingjia;
	}

	public void setBingjia(Float bingjia) {
		this.bingjia = bingjia;
	}

	public Float getKuanggong() {
		return this.kuanggong;
	}

	public void setKuanggong(Float kuanggong) {
		this.kuanggong = kuanggong;
	}

	public Float getChidao() {
		return this.chidao;
	}

	public void setChidao(Float chidao) {
		this.chidao = chidao;
	}

	public Float getHunjia() {
		return this.hunjia;
	}

	public void setHunjia(Float hunjia) {
		this.hunjia = hunjia;
	}

	public Float getNianjia() {
		return this.nianjia;
	}

	public void setNianjia(Float nianjia) {
		this.nianjia = nianjia;
	}

	public Float getSangjia() {
		return this.sangjia;
	}

	public void setSangjia(Float sangjia) {
		this.sangjia = sangjia;
	}

	public Float getDaoxiu() {
		return this.daoxiu;
	}

	public void setDaoxiu(Float daoxiu) {
		this.daoxiu = daoxiu;
	}

	public Float getWaiqin() {
		return this.waiqin;
	}

	public void setWaiqin(Float waiqin) {
		this.waiqin = waiqin;
	}

	public Float getQita() {
		return this.qita;
	}

	public void setQita(Float qita) {
		this.qita = qita;
	}

	public Float getQuanqin() {
		return this.quanqin;
	}

	public void setQuanqin(Float quanqin) {
		this.quanqin = quanqin;
	}

	public Date getShijian() {
		return this.shijian;
	}

	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}

}