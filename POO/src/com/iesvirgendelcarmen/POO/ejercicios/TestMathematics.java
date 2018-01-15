package com.iesvirgendelcarmen.POO.ejercicios;
import java.util.Scanner;

public class TestMathematics {
	public static void main(String[] args) {
		Mathematics mathematics1 = new Mathematics();
		
		System.out.println("Type a number");
		Scanner in = new Scanner(System.in);
		double number = in.nextDouble();
		in.close();
		
		
		mathematics1.setNumber(number);
		System.out.println("Square root: "+mathematics1.squareRoot());
		System.out.println("Cube root: "+mathematics1.cubeRoot());
		System.out.println("Round: "+mathematics1.roundNumber());
		System.out.println("Random class random: "+mathematics1.getRandomInterval());
		System.out.println("Math class random: "+mathematics1.getARandomNumberToRoundNumber());
	}
}
