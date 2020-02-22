package com.brad.blog.lsp.violation;

public class BadSquare extends BadRectangle {

	public BadSquare(int aSide) {
		super(aSide, aSide);
	}

	@Override
	public void changeWidth(int aNewSide) {
		this.width = aNewSide;
		this.height = aNewSide;
	}

	@Override
	public void changeHeight(int aNewSide) {
		this.width = aNewSide;
		this.height = aNewSide;
	}

}
