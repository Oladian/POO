package com.iesvirgendelcarmen.POO.ejercicios;

public class Word {

	private String word;
	
	public Word(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}
	
	public String toUpperCase() {
		return word.toUpperCase();
	}
	

	public String toLowerCase() {
		return word.toLowerCase();
	}
	
	
	public int wordLength() {
		return word.length();
	}
	
	public String replaceLetter(char o, char u) {
		return word.replace(o, u);
	}
	
	public String firstLetter() {
		return word.substring(0);
	}
	
	public String lastLetter() {
		return word.toUpperCase().substring(word.length()-1);
	}

	@Override
	public String toString() {
		return "Word [word=" + word + "]";
	}
}
