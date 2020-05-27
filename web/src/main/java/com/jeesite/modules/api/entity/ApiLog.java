/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.api.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * api访问记录Entity
 * @author myj
 * @version 2020-05-27
 */
@Table(name="api_log", alias="a", columns={
		@Column(name="id", attrName="id", label="访问记录的id", isPK=true),
		@Column(name="api_code", attrName="apiCode", label="API的编号"),
		@Column(name="api_name", attrName="apiName", label="API的名称", queryType=QueryType.LIKE),
		@Column(name="response_code", attrName="responseCode", label="请求返回的状态码，例如 200 404 500"),
		@Column(name="in_date", attrName="inDate", label="访问进入的时间"),
		@Column(name="out_date", attrName="outDate", label="访问返回的时间"),
		@Column(name="take_time", attrName="takeTime", label="消耗的时长", comment="消耗的时长(毫秒)"),
		@Column(name="is_data_pull_status", attrName="isDataPullStatus", label="数据为主动获取 还是被动接收 0", comment="数据为主动获取 还是被动接收 0：主动拉取 1：被动接收"),
		@Column(name="datatype", attrName="datatype", label="请求的数据格式，例如xml、JSON"),
		@Column(name="request_data", attrName="requestData", label="请求的数据"),
		@Column(name="response_data", attrName="responseData", label="返回的数据"),
	}, orderBy="a.id DESC"
)
public class ApiLog extends DataEntity<ApiLog> {
	
	private static final long serialVersionUID = 1L;
	private String apiCode;		// API的编号
	private String apiName;		// API的名称
	private String responseCode;		// 请求返回的状态码，例如 200 404 500
	private Date inDate;		// 访问进入的时间
	private Date outDate;		// 访问返回的时间
	private String takeTime;		// 消耗的时长(毫秒)
	private Long isDataPullStatus;		// 数据为主动获取 还是被动接收 0：主动拉取 1：被动接收
	private String datatype;		// 请求的数据格式，例如xml、JSON
	private String requestData;		// 请求的数据
	private String responseData;		// 返回的数据
	
	public ApiLog() {
		this(null);
	}

	public ApiLog(String id){
		super(id);
	}
	
	@Length(min=0, max=100, message="API的编号长度不能超过 100 个字符")
	public String getApiCode() {
		return apiCode;
	}

	public void setApiCode(String apiCode) {
		this.apiCode = apiCode;
	}
	
	@Length(min=0, max=200, message="API的名称长度不能超过 200 个字符")
	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	
	@Length(min=0, max=50, message="请求返回的状态码，例如 200 404 500长度不能超过 50 个字符")
	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getInDate() {
		return inDate;
	}

	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getOutDate() {
		return outDate;
	}

	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}
	
	public String getTakeTime() {
		return takeTime;
	}

	public void setTakeTime(String takeTime) {
		this.takeTime = takeTime;
	}
	
	public Long getIsDataPullStatus() {
		return isDataPullStatus;
	}

	public void setIsDataPullStatus(Long isDataPullStatus) {
		this.isDataPullStatus = isDataPullStatus;
	}
	
	@Length(min=0, max=50, message="请求的数据格式，例如xml、JSON长度不能超过 50 个字符")
	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}
	
	@Length(min=0, max=8000, message="请求的数据长度不能超过 8000 个字符")
	public String getRequestData() {
		return requestData;
	}

	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}
	
	@Length(min=0, max=8000, message="返回的数据长度不能超过 8000 个字符")
	public String getResponseData() {
		return responseData;
	}

	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}
	
}