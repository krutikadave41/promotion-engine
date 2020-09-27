package com.example.promotion;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.domain.SKU;

@SpringBootTest
public class NSKUItemsForFixedPriceTest {

	@Autowired
	NSKUItemsForFixedPrice nSKUItemsForFixedPrice;
	
	@Test
	public void test_calculatePromotion() {
		List<SKU> skuList = new ArrayList<>();
		SKU a = new SKU('A', 1);		
		SKU b = new SKU('B', 1);
		SKU c = new SKU('C', 1);
		skuList.add(a);
		skuList.add(b);
		skuList.add(c);
		Double value = 0.0d;
		SKU1SKU2ForFixedPrice sku1Sku2ForFixedPricePromotion = new SKU1SKU2ForFixedPrice();
		nSKUItemsForFixedPrice.setNextPromotionType(sku1Sku2ForFixedPricePromotion);
		Assertions.assertEquals(100, nSKUItemsForFixedPrice.calculatePromotion(skuList, value));
	}
}
