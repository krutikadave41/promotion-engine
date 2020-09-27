package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.domain.Cart;
import com.example.domain.SKU;

@SpringBootTest
public class PromotionServiceImplTest {

	@Autowired
	PromotionServiceImpl promotionServiceImpl;
	
	@Test
	public void applyPromotion_Scenario1(){
		//Scenario 1: A=1, B=1, C=1
		List<SKU> skuList = new ArrayList<>();
		SKU a = new SKU('A', 1);		
		SKU b = new SKU('B', 1);
		SKU c = new SKU('C', 1);
		skuList.add(a);
		skuList.add(b);
		skuList.add(c);
		Double price = promotionServiceImpl.applyPromotion(skuList);
		Assertions.assertEquals(100, price);
	
	}
	
	@Test
	public void applyPromotion_Scenario2(){
		//Scenario 1: A=5, B=5, C=1
		List<SKU> skuList = new ArrayList<>();
		SKU a = new SKU('A', 5);		
		SKU b = new SKU('B', 5);
		SKU c = new SKU('C', 1);
		skuList.add(a);
		skuList.add(b);
		skuList.add(c);
		Double price = promotionServiceImpl.applyPromotion(skuList);
		Assertions.assertEquals(370, price);
	}
}
