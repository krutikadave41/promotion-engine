package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.domain.Cart;
import com.example.domain.SKU;
import com.example.service.PromotionService;

@SpringBootTest
public class PromotionControllerTest {

	@Autowired
	PromotionController promotionController;
	
	@Autowired
	PromotionService promotionService;
	
	@BeforeEach
	void setup(){
		

	}
	@Test
	public void runPromotion_Scenario1(){
		//Scenario 1: A=1, B=1, C=1
		Cart cart = new Cart();
		List<SKU> skuList = new ArrayList<>();
		SKU a = new SKU('A', 1);		
		SKU b = new SKU('B', 1);
		SKU c = new SKU('C', 1);
		skuList.add(a);
		skuList.add(b);
		skuList.add(c);
		cart.setSkuList(skuList);
		Double price = promotionController.runPromotion(cart);
		Assertions.assertEquals(100, price);
	
	}
	
	@Test
	public void runPromotion_Scenario2(){
		//Scenario 1: A=5, B=5, C=1
		Cart cart = new Cart();
		List<SKU> skuList = new ArrayList<>();
		SKU a = new SKU('A', 5);		
		SKU b = new SKU('B', 5);
		SKU c = new SKU('C', 1);
		skuList.add(a);
		skuList.add(b);
		skuList.add(c);
		cart.setSkuList(skuList);
		Double price = promotionController.runPromotion(cart);
		Assertions.assertEquals(370, price);
	}
}
