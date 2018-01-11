package com.iesvirgendelcarmen.POO.ejercicios;

public class Car {
	private double deposit=5;
	private double comsumption=7;

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public double getComsumption() {
		return comsumption;
	}
	
	public void setComsumption(int comsumption) {
		this.comsumption = comsumption;
	}
	
	public void addFuel (double fuel) {
		deposit+=fuel;
	}
	
	public double getPosibleKms () {
		return 100.0/comsumption*deposit;
	}

	@Override
	public String toString() {
		return "Car [deposit=" + deposit + ", and comsumption=" + comsumption + "]";
	}	
}
