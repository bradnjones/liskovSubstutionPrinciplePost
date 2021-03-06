package com.brad.blog.lsp.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GoodSquareTest {

	protected IShape shape;
	protected GoodSquare goodSquare;

	@BeforeEach
	void setupTest() {
		shape = new GoodSquare(4);
		goodSquare = (GoodSquare) shape;
	}

	@Test
	void testAreaCalculation() {
		Assertions.assertEquals(16, shape.area());
	}

	@Test
	void testChangeSideLength() {
		goodSquare.changeSide(2);
		Assertions.assertEquals(2, goodSquare.getSideLength());
	}

}
