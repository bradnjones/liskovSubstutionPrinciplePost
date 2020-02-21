package com.brad.blog.lsp.violation;

import org.junit.jupiter.api.BeforeEach;

class BadSquareTest extends BadRectangleTest {

	@BeforeEach
	void setupTest() {
		this.r = new BadSquare(4);
	}
}
