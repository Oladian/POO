package com.iesvirgendelcarmen.POO.ejercicios;

public class TestCar {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.addFuel(5);
		Car car2 = new Car();
		car2.addFuel(2);
		System.out.println(car1);
		
		System.out.printf("Coche 1 puede recorrer: %.2f%n",car1.getPosibleKms());
		System.out.printf("Coche 2 puede recorrer: %.2f%n",car2.getPosibleKms());
		
		// Parte más allá del ejercicio
		
		Car car3 = new Car();
		car3.setComsumption(5);
		car3.setDeposit(10);
		System.out.printf("Coche 3 puede recorrer: %.2f%n",car3.getPosibleKms());
	}
}
