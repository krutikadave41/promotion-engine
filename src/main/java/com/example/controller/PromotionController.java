package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Cart;
import com.example.service.PromotionService;

@RestController
@RequestMapping("/api")
public class PromotionController {

	@Autowired
	PromotionService promotionService;

	@RequestMapping(value = "/runPromotion", method = RequestMethod.POST)
	public Double runPromotion(@RequestBody Cart cart) {
		Double price = 0.0d;
		if (cart != null && !CollectionUtils.isEmpty(cart.getSkuList())) {
			price = promotionService.applyPromotion(cart.getSkuList());

		}
		return price;
	}
}
