package com.brad.blog.lsp.violation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BadRectangleTest {

	protected BadRectangle r;

	@BeforeEach
	void setupTest() {
		r = new BadRectangle(4, 2);
	}

	@Test
	void testAreaCalculation() {
		Assertions.assertEquals(8, r.area());
	}

	@Test
	void testChangeWidthDoesntChangeHeight() {
		r.changeWidth(8);
		Assertions.assertEquals(8, r.getWidth());

		// Confirm that the height is not changed
		Assertions.assertEquals(2, r.getHeight());
	}

	@Test
	void testChangeHeightDoesntChangeWidth() {
		r.changeHeight(6);
		Assertions.assertEquals(6, r.getHeight());

		// Confirm that the height is not changed
		Assertions.assertEquals(4, r.getWidth());
	}

}
