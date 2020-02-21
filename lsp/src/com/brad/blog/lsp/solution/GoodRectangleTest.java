package com.brad.blog.lsp.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GoodRectangleTest {

	protected IShape shape;
	protected GoodRectangle goodRectangle;

	@BeforeEach
	void setupTest() {
		shape = new GoodRectangle(4, 2);
		goodRectangle = new GoodRectangle(4, 2);
	}

	@Tag("IShape area calculation polymorphism")
	@Test
	void testArea() {
		Assertions.assertEquals(8, shape.area());
	}

	@Test
	void testConstructor() {
		Assertions.assertEquals(4, goodRectangle.getWidth());
		Assertions.assertEquals(2, goodRectangle.getHeight());
	}

	@Test
	void testChangeWidth() {
		goodRectangle.changeWidth(8);
		Assertions.assertEquals(8, goodRectangle.getWidth());
	}

	@Test
	void testChangeHeight() {
		goodRectangle.changeHeight(8);
		Assertions.assertEquals(8, goodRectangle.getHeight());
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
