package com.example.promotion;

public enum DefaultUnitPriceEnum {
	A('A', 50),
	B('B', 30),
	C('C', 20),
	D('D', 15);
	
	char skuId;
	double price;
	
	DefaultUnitPriceEnum(char skuId, double price){
		this.skuId=skuId;
		this.price=price;
		
	}
	
}
