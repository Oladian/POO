package com.iesvirgendelcarmen.POO.ejercicios;

public class TestLibro {

	public static void main(String[] args) {
		
		Libro libroQuijote = new Libro();
		
		libroQuijote.setAuthor("Cervantes");
		libroQuijote.setIsbn(998232);
		libroQuijote.setGenre("Novel");
		libroQuijote.setPrice(19.8);
		
		System.out.println(libroQuijote);
	}

}
