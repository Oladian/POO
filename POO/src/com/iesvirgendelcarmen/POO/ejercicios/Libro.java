package com.iesvirgendelcarmen.POO.ejercicios;

public class Libro {

	private String author;
	private int isbn;
	private String genre;
	private double price;
	
	public Libro(String author, int isbn, String genre, double price) {
		this.author = author;
		this.isbn = isbn;
		this.genre = genre;
		this.price = price;
	}

	public Libro() {} //constructor por defecto, ya NO lo crea java porque ya existe
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Libro [author=" + author + ", isbn=" + isbn + ", genre=" + genre + ", price=" + price + "]";
	}
	
}
