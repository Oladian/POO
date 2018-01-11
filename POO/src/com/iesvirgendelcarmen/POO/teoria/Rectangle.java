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
	

	public int getArea() {
		return height*width;
	}
	
	// Sobreescribe porque lo hereda del padre
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", area="+getArea()+", perimeter= "+getPerimeter()+"]";
	}

	public int getPerimeter() {
		return (height+width)*2;
	}
}
