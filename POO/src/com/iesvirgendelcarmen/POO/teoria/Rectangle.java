package com.iesvirgendelcarmen.POO.teoria;

public class Rectangle {
	//atributos o variables de instancia
	private int height=3;
	private int width=9;
	
	//getters y setters
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
	
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}

	public int getArea() {
		return height*width;
	}
	
}
