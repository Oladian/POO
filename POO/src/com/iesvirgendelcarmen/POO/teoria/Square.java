package com.iesvirgendelcarmen.POO.teoria;

public class Square {
	private int side;

	public Square() {
			this.side = 5;
	}
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	public Square(int side) {
		super();
		this.side = side;
	}
}
