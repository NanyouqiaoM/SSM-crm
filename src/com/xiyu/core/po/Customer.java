package com.xiyu.core.po;

import java.io.Serializable;
import java.util.Date;

//客户持久化类
public class Customer implements Serializable {
	private static final long seriaVersionUID = 1L;
	private Integer cust_id;
	private String cust_name;
	private Integer cust_user_id;
	private Integer cust_create_id;
	private String cust_source;
	private String cust_industry;
	private String cust_level;
	private String cust_linkman;
	private String cust_phone;
	private String cust_mobile;
	private String cust_zipcode;
	private String cust_address;
	private Date cust_createtime;
	private Integer start;
	private Integer rows;
	public Integer getCust_id() {
		return cust_id;
	}
	public void setCust_id(Integer custId) {
		cust_id = custId;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String custName) {
		cust_name = custName;
	}
	public Integer getCust_user_id() {
		return cust_user_id;
	}
	public void setCust_user_id(Integer custUserId) {
		cust_user_id = custUserId;
	}
	public Integer getCust_create_id() {
		return cust_create_id;
	}
	public void setCust_create_id(Integer custCreateId) {
		cust_create_id = custCreateId;
	}
	public String getCust_source() {
		return cust_source;
	}
	public void setCust_source(String custSource) {
		cust_source = custSource;
	}
	public String getCust_industry() {
		return cust_industry;
	}
	public void setCust_industry(String custIndustry) {
		cust_industry = custIndustry;
	}
	public String getCust_level() {
		return cust_level;
	}
	public void setCust_level(String custLevel) {
		cust_level = custLevel;
	}
	public String getCust() {
		return cust_linkman;
	}
	public void setCust_linkman(String cust_linkman) {
		this.cust_linkman = cust_linkman;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String custPhone) {
		cust_phone = custPhone;
	}
	public String getCust_mobile() {
		return cust_mobile;
	}
	public void setCust_mobile(String custMobile) {
		cust_mobile = custMobile;
	}
	public String getCust_zipcode() {
		return cust_zipcode;
	}
	public void setCust_zipcode(String custZipcode) {
		cust_zipcode = custZipcode;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String custAddress) {
		cust_address = custAddress;
	}
	public Date getCust_createtime() {
		return cust_createtime;
	}
	public void setCust_createtime(Date custCreatetime) {
		cust_createtime = custCreatetime;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public static long getSeriaversionuid() {
		return seriaVersionUID;
	}
	@Override
	public String toString() {
		return "Customer [cust_address=" + cust_address + ", cust_create_id="
				+ cust_create_id + ", cust_createtime=" + cust_createtime
				+ ", cust_id=" + cust_id + ", cust_industry=" + cust_industry
				+ ", cust_level=" + cust_level + ", cust_linkman="
				+ cust_linkman + ", cust_mobile=" + cust_mobile
				+ ", cust_name=" + cust_name + ", cust_phone=" + cust_phone
				+ ", cust_source=" + cust_source + ", cust_user_id="
				+ cust_user_id + ", cust_zipcode=" + cust_zipcode + ", rows="
				+ rows + ", start=" + start + "]";
	}
	
}
