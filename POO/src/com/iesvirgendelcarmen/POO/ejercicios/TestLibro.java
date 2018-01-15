package com.iesvirgendelcarmen.POO.ejercicios;

import java.util.List;
import java.util.ArrayList;

public class TestLibro {

	public static void main(String[] args) {
		
		Libro libroQuijote = new Libro("Cervantes", 98537575, "Novel", 19.85);
		Libro libroCelestina = new Libro("F. Rojas", 778855, "Novel", 9.85);
			
		System.out.println(libroQuijote);
		
		List<Libro> bookList = new ArrayList<>();
		
		bookList.add(libroQuijote);
		bookList.add(libroCelestina);
	}

}
