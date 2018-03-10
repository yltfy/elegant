package com.elegant.pojo;

import java.math.BigDecimal;

/**
 * 店铺实体 Shop 创建人:冯小梁 时间：2018年02月08日 19:57:31 qq：1103206765
 * email：1103206765@qq.com
 * 
 * @version 1.0.0
 * 
 */
public class Shop implements java.io.Serializable {

	private Integer id;
	private String shopname;
	private String shopcode;
	private Integer status;
	private Integer isOpen;
	private String addtime;
	private String applicant;
	private String examineer;
	private String location;
	private String addr;
	private Integer business;
	private String img;
	private Integer type;
	private String lng;
	private String lat;
	private Integer managerId;
	private Integer agentsId;
	private Integer selfSupply;
	private BigDecimal rfidCost;
	private Integer isHosted;

	public Shop() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getShopcode() {
		return shopcode;
	}

	public void setShopcode(String shopcode) {
		this.shopcode = shopcode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Integer isOpen) {
		this.isOpen = isOpen;
	}

	public String getAddtime() {
		return addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getApplicant() {
		return applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public String getExamineer() {
		return examineer;
	}

	public void setExamineer(String examineer) {
		this.examineer = examineer;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Integer getBusiness() {
		return business;
	}

	public void setBusiness(Integer business) {
		this.business = business;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getAgentsId() {
		return agentsId;
	}

	public void setAgentsId(Integer agentsId) {
		this.agentsId = agentsId;
	}

	public Integer getSelfSupply() {
		return selfSupply;
	}

	public void setSelfSupply(Integer selfSupply) {
		this.selfSupply = selfSupply;
	}

	public BigDecimal getRfidCost() {
		return rfidCost;
	}

	public void setRfidCost(BigDecimal rfidCost) {
		this.rfidCost = rfidCost;
	}

	public Integer getIsHosted() {
		return isHosted;
	}

	public void setIsHosted(Integer isHosted) {
		this.isHosted = isHosted;
	}

}
