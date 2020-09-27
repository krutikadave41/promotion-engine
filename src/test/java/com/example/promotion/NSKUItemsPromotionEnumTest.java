package com.example.promotion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NSKUItemsPromotionEnumTest {
	
	@Test
	public void test1() {
		Assertions.assertEquals('A', NSKUItemsPromotionEnum.A_3_130.skuId);
	}
}
