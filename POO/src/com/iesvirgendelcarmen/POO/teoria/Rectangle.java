package com.iesvirgendelcarmen.POO.teoria;

public class Rectangle {
	
	private int height=3;
	private int width=9;
	
	public int getLength() {
		return height;
	}

	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setLength(int height) {
		this.height = height;
	}
	
	public int getArea() {
		return (height+width)*2;
	}
	
}
