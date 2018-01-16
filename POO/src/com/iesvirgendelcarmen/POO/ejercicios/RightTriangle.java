package com.iesvirgendelcarmen.POO.ejercicios;

public class RightTriangle {
	
	private double sideA;
	private double sideB;
	
	public RightTriangle(double sideA, double sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
	}

	public double getHypotenuse() {
		//return Math.sqrt((sideA*sideA)+(sideB*sideB));
		return Math.sqrt(Math.pow(sideA, 2)+Math.pow(sideB,2));
	}
	
	public double getArea() {
		return (sideA*sideB)/2.0;
	}
	
	public double getPerimeter() {
		return sideA+sideB+this.getHypotenuse();
	}
		
	@Override
	public String toString() {
		return "RightTriangle [sideA=" + sideA + ", sideB=" + sideB + ", Hypotenuse=" + (Math.round(getHypotenuse()*100))/100.0 + "]";
	}

}
