package com.example.promotion;

public enum NSKUItemsPromotionEnum {

	A_3_130('A', 3, 130),
	B_2_45('B', 2, 45);
	
	char skuId;
    int quantity;
	double price;
	
	NSKUItemsPromotionEnum(char skuId, int quantity, double price){
		this.skuId=skuId;
		this.quantity=quantity;
		this.price=price;
		
	}
	
	
}
