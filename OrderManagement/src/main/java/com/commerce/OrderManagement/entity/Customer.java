package com.commerce.OrderManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "CUSTOMER", schema = "KOLIVEN")
@Entity
public class Customer {
	
	private int cusId;
	private String cusName;
	private String cusAddress;
	private String CusCity;
	private String CusState;
	private String cusPincode;
	
	@Id
	@SequenceGenerator(name = "cus_gen", sequenceName = "CUSSEQ", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cus_gen" )
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	
	public String getCusName() {
		return cusName;
	}
	@Column(name = "CUS_NAME")
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusAddress() {
		return cusAddress;
	}
	@Column(name = "CUS_ADDRESS")
	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}
	public String getCusCity() {
		return CusCity;
	}
	@Column(name = "CUS_CITY")
	public void setCusCity(String cusCity) {
		CusCity = cusCity;
	}
	public String getCusState() {
		return CusState;
	}
	@Column(name = "CUS_STATE")
	public void setCusState(String cusState) {
		CusState = cusState;
	}
	public String getCusPincode() {
		return cusPincode;
	}
	@Column(name = "CUS_PINCODE")
	public void setCusPincode(String cusPincode) {
		this.cusPincode = cusPincode;
	}
	
	

}
