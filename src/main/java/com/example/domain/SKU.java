package com.example.domain;

public class SKU {

	private Character id;
	private int quantity;
	
	
	public SKU() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public SKU(Character id, int quantity) {
		super();
		this.id = id;
		this.quantity = quantity;
	}


	public Character getId() {
		return id;
	}
	public void setId(Character id) {
		this.id = id;
	}
	
	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
