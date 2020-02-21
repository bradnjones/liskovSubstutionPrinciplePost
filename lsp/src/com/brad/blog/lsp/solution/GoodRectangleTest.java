package com.brad.blog.lsp.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GoodRectangleTest {

	protected IShape shape;
	protected GoodRectangle goodRectangle;

	@BeforeEach
	void setupTest() {
		shape = new GoodRectangle(4, 2);
		goodRectangle = new GoodRectangle(4, 2);
	}

	@Test
	void testAreaCalculation() {
		Assertions.assertEquals(8, shape.area());
	}

	@Test
	void testChangeWidthDoesntChangeHeight() {
		goodRectangle.changeWidth(8);
		Assertions.assertEquals(8, goodRectangle.getWidth());

		// Confirm that the height is not changed
		Assertions.assertEquals(2, goodRectangle.getHeight());
	}

	@Test
	void testChangeHeightDoesntChangeWidth() {
		goodRectangle.changeHeight(6);
		Assertions.assertEquals(6, goodRectangle.getHeight());

		// Confirm that the height is not changed
		Assertions.assertEquals(4, goodRectangle.getWidth());
	}

}
