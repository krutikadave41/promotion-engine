package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.domain.SKU;

@Service
public interface PromotionService {

	double applyPromotion(List<SKU> list);
}
