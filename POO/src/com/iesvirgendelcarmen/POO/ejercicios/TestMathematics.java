package com.iesvirgendelcarmen.POO.ejercicios;

public class TestMathematics {
	public static void main(String[] args) {
		Mathematics mathematics1 = new Mathematics();
		mathematics1.setNumber(3.1457289);
		System.out.println(mathematics1.squareRoot());
		System.out.println(mathematics1.cubeRoot());
		System.out.println(mathematics1.roundNumber());
		System.out.println(mathematics1.getRandomInterval(3));

	}
}
