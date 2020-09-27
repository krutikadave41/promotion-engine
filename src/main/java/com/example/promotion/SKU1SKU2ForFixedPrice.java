package com.example.promotion;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.domain.SKU;

@Component
public class SKU1SKU2ForFixedPrice implements PromotionType {

	private PromotionType nextPromotionType;

	@Override
	public Double calculatePromotion(List<SKU> skuList, double value) {
		double price = value;
		Map<Character, Integer> skuIdMap = skuList.stream().collect(Collectors.toMap(SKU::getId, SKU::getQuantity));
		int dQuantity = 0;
		int cQuantity = 0;
		if (skuIdMap.containsKey('C') && skuIdMap.containsKey('D')) {
			cQuantity = skuIdMap.get('C');
			dQuantity = skuIdMap.get('D');
			while (cQuantity > 1 && dQuantity > 1) {
				price += SKU1SKU2PromotionEnum.C_D_30.price;
				cQuantity--;
				dQuantity--;
			}
		}
		if (skuIdMap.containsKey('C')) {
			cQuantity = skuIdMap.get('C');
			while (cQuantity >= 1) {
				price += DefaultUnitPriceEnum.C.price;
				cQuantity--;
			}
		}
		if (skuIdMap.containsKey('D')) {
			dQuantity = skuIdMap.get('D');
			while (dQuantity >= 1) {
				price += DefaultUnitPriceEnum.D.price;
				dQuantity--;
			}
		}
		if (nextPromotionType != null) {
			nextPromotionType.calculatePromotion(skuList, price);
		}
		return price;
	}

	@Override
	public void setNextPromotionType(PromotionType promotionType) {
		this.nextPromotionType = promotionType;

	}

}
