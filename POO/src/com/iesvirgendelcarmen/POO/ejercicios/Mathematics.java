package com.iesvirgendelcarmen.POO.ejercicios;
import java.lang.Math;

public class Mathematics {
	private double number;

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}
	
	public double squareRoot() {
		return Math.sqrt(getNumber());
	}
	
	public double cubeRoot() {
		return Math.cbrt(getNumber());
	}
	
	public int roundNumber() {
		return (int)Math.round(getNumber());
	}
	
	public int getRandomInterval(int roundNumber) {
		return (int)Math.random()*roundNumber;
	}
}
