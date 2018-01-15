package com.iesvirgendelcarmen.POO.ejercicios;

public class TestWord {

	public static void main(String[] args) {
		Word word1 = new Word("Esternocleidomastoideo");
		
		System.out.println(word1.toUpperCase());
		System.out.println(word1.toLowerCase());
		System.out.println(word1.wordLength());
		System.out.println(word1.replaceLetter('e', 'L'));
		System.out.println(word1.firstLetter());
		System.out.println(word1.lastLetter());

	}

}
