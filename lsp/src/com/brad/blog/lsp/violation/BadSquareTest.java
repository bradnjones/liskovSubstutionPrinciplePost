package com.brad.blog.lsp.violation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BadSquareTest extends BadRectangleTest {

	@BeforeEach
	void setupTest() {
		this.r = new BadSquare(4);
	}

	@Test
	void testConstructor() {
		Assertions.assertEquals(4, this.r.getWidth());
		Assertions.assertEquals(4, this.r.getHeight());
	}
}
