package com.brad.blog.lsp.solution;

public class GoodSquare implements IShape {

	private int sideLength;

	public int getSideLength() {
		return sideLength;
	}

	public GoodSquare(int aSideLength) {
		this.sideLength = aSideLength;
	}

	public void changeSide(int aNewSide) {
		this.sideLength = aNewSide;
	}

	@Override
	public int area() {
		return this.sideLength * this.sideLength;
	}
}
