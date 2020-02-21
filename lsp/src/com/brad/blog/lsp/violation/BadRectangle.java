package com.brad.blog.lsp.violation;

public class BadRectangle {

	protected int width;
	protected int height;

	public BadRectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void changeWidth(int aNewWidth) {
		this.width = aNewWidth;
	}

	public void changeHeight(int aNewHeight) {
		this.height = aNewHeight;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int area() {
		return this.width * this.height;
	}

}
