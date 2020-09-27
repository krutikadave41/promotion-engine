package com.example.promotion;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.domain.SKU;

@Component
public class NSKUItemsForFixedPrice implements PromotionType{

	private PromotionType nextPromotionType;
	
	@Override
	public Double calculatePromotion(List<SKU> skuList, double value) {
		double price = value;
		for(SKU sku: skuList) {
			if(sku.getId().equals('A')) {
				//apply 3 A = 130 promotion
				int quantity = sku.getQuantity();
				while(quantity>=NSKUItemsPromotionEnum.A_3_130.quantity) {
					price += NSKUItemsPromotionEnum.A_3_130.price;
					quantity = quantity - NSKUItemsPromotionEnum.A_3_130.quantity;
				}
				while(quantity>=1) {	
					price += DefaultUnitPriceEnum.A.price;
					quantity--;
				}
			}
			if(sku.getId().equals('B')) {
				//apply 2 B = 45 promotion
				int quantity = sku.getQuantity();
				while(quantity>=NSKUItemsPromotionEnum.B_2_45.quantity) {
					price += NSKUItemsPromotionEnum.B_2_45.price;
					quantity = quantity - NSKUItemsPromotionEnum.B_2_45.quantity;
				}
				while(quantity>=1) {	
					price += DefaultUnitPriceEnum.B.price;
					quantity--;
				}
			}
		}
		if (nextPromotionType != null) {
			return nextPromotionType.calculatePromotion(skuList, price);
		} 
		return price;
		
	}

	@Override
	public void setNextPromotionType(PromotionType promotionType) {
		this.nextPromotionType = promotionType;
		
	}

}
