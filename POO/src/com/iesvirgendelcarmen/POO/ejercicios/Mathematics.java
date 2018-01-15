package com.iesvirgendelcarmen.POO.ejercicios;
import static java.lang.Math.*; //NOS PERMITE UTILIZAR LOS MÉTODOS SIN USAR .Math PORQUE TIENE ASIGNADO EL ESPACIO DE NOMBRES
import java.util.Random;

public class Mathematics {
	private double number;

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}
	
	public double squareRoot() {
		return sqrt(getNumber());
	}
	
	public double cubeRoot() {
		return cbrt(abs(getNumber()));
	}
	
	public int roundNumber() {
		
		if(getNumber()<0) 
			return (int) round(abs(-getNumber()));
		else
			return (int) round(abs(getNumber()));
	}
	
	public int getARandomNumberToRoundNumber() {
		int number = roundNumber();
		int randomNumber = (int)(random()*(number+1));		
		
		return randomNumber; 
	}
	
	
	public int getRandomInterval() {
		Random random = new Random();
		return random.nextInt(roundNumber()+1);
	}
}
