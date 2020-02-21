package com.brad.blog.lsp.violation;

public class BadSquare extends BadRectangle {

	public BadSquare(int aSide) {
		super(aSide, aSide);
	}

	@Override
	public void changeWidth(int aNewWidth) {
		this.width = aNewWidth;
		this.height = aNewWidth;
	}

	@Override
	public void changeHeight(int aNewHeight) {
		this.width = aNewHeight;
		this.height = aNewHeight;
	}

	@Override
	public int area() {
		return this.width * this.height;
	}

}
