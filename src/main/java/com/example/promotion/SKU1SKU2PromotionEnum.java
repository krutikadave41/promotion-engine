package com.example.promotion;

public enum SKU1SKU2PromotionEnum {

	C_D_30('C', 'D', 30);
	
	char skuId1;
	char skuId2;
	double price;
	
	SKU1SKU2PromotionEnum(char skuId1, char skuId2, double price){
		this.skuId1=skuId1;
		this.skuId2=skuId2;
		this.price=price;
		
	}
	
}
