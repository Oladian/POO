package com.iesvirgendelcarmen.POO.ejercicios;

import java.util.Scanner;

public class TestQuadraticEquation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce a, b, c");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();
		
		QuadraticEquation eq1 = new QuadraticEquation(a, b, c);
		
		if (eq1.isResolvable()) {
			
			for (int i=0; i<eq1.getSolutions().size();i++)
			System.out.println("Solución x"+(i+1)+" = "+eq1.getSolutions().get(i));
			
			for (Double d : eq1.getSolutions()) { //con foreach
				System.out.println("Solución "+d);
			}
			
		} else {
			System.out.println("No solution");
		}
	}
}
