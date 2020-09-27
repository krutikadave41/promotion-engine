package com.example.promotion;

import java.util.List;

import com.example.domain.SKU;

public interface PromotionType {

	Double calculatePromotion(List<SKU> skuList, double value);
	void setNextPromotionType(PromotionType promotionType);
	
}
