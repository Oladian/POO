package com.iesvirgendelcarmen.POO.ejercicios;

public class RightTriangle {
	
	private double sideA;
	private double sideB;
	
	public RightTriangle(double sideA, double sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
	}

	public double getHypotenuse() {
		return Math.sqrt((sideA*sideA)-(sideB*sideB));
	}
	
	public double getArea() {
		return (sideA*sideB)/2;
	}
	
	public double getPerimeter() {
		return sideA+sideB+getHypotenuse();
	}
	
	public double getSideA() {
		return sideA;
	}



	public void setSideA(double sideA) {
		this.sideA = sideA;
	}



	public double getSideB() {
		return sideB;
	}



	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

}
