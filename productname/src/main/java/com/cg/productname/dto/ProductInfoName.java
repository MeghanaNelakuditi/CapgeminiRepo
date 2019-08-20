package com.cg.productname.dto;

public class ProductInfoName {

	
	private Integer proId;
	private String prodName;
	public ProductInfoName(Integer proId, String prodName) {
		super();
		this.proId = proId;
		this.prodName = prodName;
	}
	public ProductInfoName() {
		super();
	}
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	@Override
	public String toString() {
		return "ProductInfoName [proId=" + proId + ", prodName=" + prodName + "]";
	}
	
	
}
