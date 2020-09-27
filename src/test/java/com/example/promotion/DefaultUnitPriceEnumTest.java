package com.example.promotion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DefaultUnitPriceEnumTest {
	
	@Test
	public void test1() {
		Assertions.assertEquals('A', DefaultUnitPriceEnum.A.skuId);
	}
	
	@Test
	public void test2() {
		Assertions.assertEquals('B', DefaultUnitPriceEnum.B.skuId);
	}
}
