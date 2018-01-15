package com.iesvirgendelcarmen.POO.ejercicios;

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void getQuadraticEcuationResult () {
		double squareRoot = Math.sqrt(b*b-(4*(a*c)));

		System.out.println((-b+squareRoot)/(2*a));
		System.out.println((-b-squareRoot)/2*a);
	}

	@Override
	public String toString() {
		return "QuadraticEquation [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
}
