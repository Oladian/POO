package com.iesvirgendelcarmen.POO.ejercicios;
import  javax.swing.JOptionPane;

public class TestRightTriangle {
	public static void main(String[] args) {

		double input1 = Double.parseDouble(JOptionPane.showInputDialog("Type side A 1"));
		double input2 = Double.parseDouble(JOptionPane.showInputDialog("Type side B 1"));

		RightTriangle triangle1 = new RightTriangle(input1, input2);
		
		JOptionPane.showMessageDialog(null,"Hypotenuse: "+triangle1.getHypotenuse());
		JOptionPane.showMessageDialog(null,"Area: "+triangle1.getArea());
		JOptionPane.showMessageDialog(null,"Perimeter: "+triangle1.getPerimeter());
		System.out.println(triangle1);
	}
}
