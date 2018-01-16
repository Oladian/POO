package com.iesvirgendelcarmen.POO.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public String toString() {
		return "QuadraticEquation [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	private double getDiscriminate() {
		return Math.sqrt(b*b-4*a*c);
	}
	
	public boolean isResolvable() {
		return !Double.isNaN(this.getDiscriminate());
	}
	
	/*public void getQuadraticEcuationResult () {
		System.out.println((-b+this.getDiscriminate())/(2*a));
		System.out.println((-b-this.getDiscriminate())/2*a);
	}*/

	public List<Double> getSolutions(){ //Hay que hacerlo con List
		List<Double> solutionList = new ArrayList<>();
		if (this.getDiscriminate()==0) {
			solutionList.add(-b/(2*a));
		} else {
			solutionList.add(-b+this.getDiscriminate()/(2*a));
			solutionList.add(-b-this.getDiscriminate()/(2*a));
		}
		return solutionList;
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
