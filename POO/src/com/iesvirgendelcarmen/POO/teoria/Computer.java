package com.iesvirgendelcarmen.POO.teoria;

public class Computer {
	private int code;
	private String brand;
	private String color;
	private boolean owner;
	
	public Computer() {}
	
	public Computer(int code, String brand, String color, boolean owner) {
		super();
		this.code = code;
		this.brand = brand;
		this.color = color;
		this.owner = owner;
	}


	public Computer(int code, String brand, boolean owner) {
		super();
		this.code = code;
		this.brand = brand;
		this.color = "Black";
		this.owner = owner;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the owner
	 */
	public boolean isOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(boolean owner) {
		this.owner = owner;
	}
}
