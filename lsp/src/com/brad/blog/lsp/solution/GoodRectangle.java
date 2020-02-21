package com.brad.blog.lsp.solution;

public class GoodRectangle implements IShape {

	private int width;
	private int height;

	public GoodRectangle(int aWidth, int aHeight) {
		this.width = aWidth;
		this.height = aHeight;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void changeWidth(int aNewWidth) {
		this.width = aNewWidth;
	}

	public void changeHeight(int aNewHeight) {
		this.height = aNewHeight;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return this.width * this.height;
	}

}
