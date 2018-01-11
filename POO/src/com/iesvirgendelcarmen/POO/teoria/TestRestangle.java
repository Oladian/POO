package com.iesvirgendelcarmen.POO.teoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestRestangle {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		// Class variableName = new Class();
		Scanner sc =  new Scanner(System.in);
		System.out.printf("Alto: %d%nAncho: %d%nÁrea: %d%n",
				rectangle1.getLength(),
				rectangle1.getWidth(),
				rectangle1.getArea());
		
		
		System.out.println("Type width");
		int inputWidth = sc.nextInt();
		System.out.println("Type length");
		int inputLength = sc.nextInt();
		
		rectangle1.setLength(inputLength);
		
		rectangle1.setWidth(inputWidth);
		
		sc.close();
		System.out.println(rectangle1); //llamamos a toString()
		
		System.out.printf("Alto nuevo: %d%nAncho nuevo: %d%nÁrea nueva: %d%n",
				rectangle1.getLength(),
				rectangle1.getWidth(),
				rectangle1.getArea());
	
		// se crean dos nuevos objetos rectangle
		Rectangle rectangle2 = new Rectangle();
		Rectangle rectangle3 = new Rectangle();
		
		rectangle2.setLength(25);
		rectangle2.setWidth(30);
		
		rectangle3.setLength(65);
		rectangle3.setWidth(33);
		
		System.out.println(rectangle1);
		System.out.println(rectangle2);
		System.out.println(rectangle3);
		
		//creamos dos colecciones de rectangle (array y arraylist)
		//array
		//int[] coleccionEnteros = new int[5];
		
		Rectangle[] arrayRectangles = new Rectangle[3];
		
		arrayRectangles[0]=rectangle1;
		arrayRectangles[1]=rectangle2;
		arrayRectangles[2]=rectangle3;
		
		
		//<Rectangle> evita que se añadan objetos que no sean de tipo Rectangle
		ArrayList<Rectangle> rectangleList = new ArrayList<>();
		rectangleList.add(rectangle3);
		rectangleList.add(rectangle2);
		rectangleList.add(rectangle1);
		
		//Convierte la colección en cadenas
		System.out.println(Arrays.toString(arrayRectangles));
		
		System.out.println(rectangleList);
		System.out.printf("Average Area value is: %.2f%n",getAverageArea(arrayRectangles));
		System.out.printf("Average Perimeter value is: %.2f%n",getAveragePerimeter(rectangleList));
		//System.out.printf("Max Area value is: %.2f%n",getMaxArea(arrayRectangles));
		
		System.out.printf("Greater Rectangle: %s%n",getGreaterArea(rectangleList));
		
	}
		//metodo que pasamos una coleccion de objetos rectangle y devuelve el valor medio
		
	public static double getAverageArea(Rectangle[] arrayRectangles) {
	
		double sum=0;
		
		/*	for(int i = 0; i < arrayRectangles.length; i++) {
				sum+=arrayRectangles[i].getArea();
			}	*/

		for (Rectangle rectangle : arrayRectangles) {
			sum+=rectangle.getArea();
		}
		return sum/arrayRectangles.length;
	}
	
	//añadir la media de perimetros y la mayor area
	
	public static double getAveragePerimeter(ArrayList<Rectangle> rectangleList) {
		double sum=0;
		for (Rectangle rectangle : rectangleList) {
			sum+=rectangle.getPerimeter();
		}
		
		return sum/rectangleList.size();
	}
	
	/*public static double getMaxArea(Rectangle[] arrayRectangles) {
		double max=0;
		for (Rectangle rectangle : arrayRectangles) {
			if (rectangle.getArea()>max)
				max=rectangle.getArea();
		}
		return max;
	}*/
	
	public static Rectangle getGreaterArea(ArrayList<Rectangle> rectanglesList) {
		Rectangle greaterRectangle = rectanglesList.get(0);
		int greaterArea = rectanglesList.get(0).getArea();
			
		for (int i = 0; i < rectanglesList.size(); i++) {
			if (rectanglesList.get(i).getArea()>greaterArea) {
				greaterRectangle = rectanglesList.get(i);
				//greaterArea = rectanglesList.get(i).getArea();
			}
				
		}
		return greaterRectangle;
	}
}

