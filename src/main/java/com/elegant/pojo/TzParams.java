package com.elegant.pojo;

import java.util.Date;
import java.util.List;

/**
 * TzParams 创建人:冯小梁 时间：2017年7月4日-下午3:26:01
 * 
 * @version 1.0.0
 */
public class TzParams {
	// 主键
	private Integer id;
	// 用户名
	private String username;
	// 账号
	private String account;
	// 密码
	private String password;
	// 验证码
	private String code;
	// 关键词
	private String keyword;
	// 是否删除
	private Integer isDelete = 0;
	// 分页初始化第一条
	private Integer pageNo = 0;
	// 分页大小
	private Integer pageSize = 10;
	// 总数量
	private Integer totalCount = 0;
	// 排序
	private String order;
	// 年份
	private Integer year;
	// 月份
	private Integer month;
	// 天
	private Integer day;
	// 小时
	private Integer hour;
	// 日期
	private String date;
	// 角色ID
	private Integer roleId;
	// 工装号
	private String uuid;// 主键
	// check类的list
	private String model;

	private Integer status;

	private String batch;// 批次号

	private Date startTime;

	private Date endTime;

	public TzParams() {
		super();
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		// SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		// this.date = format.format(date);
		this.date = date;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

}
