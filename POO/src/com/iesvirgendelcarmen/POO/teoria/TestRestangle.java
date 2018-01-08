package com.iesvirgendelcarmen.POO.teoria;

public class TestRestangle {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		// Clase nombre_variable = nueva Clase();
		System.out.printf("Alto: %d%n",rectangle.getLength());
		System.out.printf("Ancho: %d%n",rectangle.getWidth());
		System.out.printf("Área: %d%n",rectangle.getArea());
		
		rectangle.setLength(20);
		rectangle.setWidth(10);

		System.out.printf("Alto nuevo: %d%n",rectangle.getLength());
		System.out.printf("Ancho nuevo: %d%n",rectangle.getWidth());
		System.out.printf("Área nueva: %d%n",rectangle.getArea());
		
	}

}
