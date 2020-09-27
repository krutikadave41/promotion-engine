package com.example.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.domain.SKU;
import com.example.promotion.NSKUItemsForFixedPrice;
import com.example.promotion.SKU1SKU2ForFixedPrice;
import com.example.service.PromotionService;

@Component
public class PromotionServiceImpl implements PromotionService{

	@Override
	public double applyPromotion(List<SKU> skuList) {
		NSKUItemsForFixedPrice nSKUItemsForFixedPricePromotion = new NSKUItemsForFixedPrice();
		SKU1SKU2ForFixedPrice sku1Sku2ForFixedPricePromotion = new SKU1SKU2ForFixedPrice();
		nSKUItemsForFixedPricePromotion.setNextPromotionType(sku1Sku2ForFixedPricePromotion);
		double price = nSKUItemsForFixedPricePromotion.calculatePromotion(skuList, Double.MIN_NORMAL);
		return price;
	}

}
