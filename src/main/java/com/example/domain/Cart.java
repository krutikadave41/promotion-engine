package com.example.domain;

import java.util.List;

public class Cart {

	List<SKU> skuList;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(List<SKU> skuList) {
		super();
		this.skuList = skuList;
	}

	public List<SKU> getSkuList() {
		return skuList;
	}

	public void setSkuList(List<SKU> skuList) {
		this.skuList = skuList;
	}
	
	
}
