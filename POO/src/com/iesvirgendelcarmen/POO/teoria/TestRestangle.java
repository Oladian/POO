package com.iesvirgendelcarmen.POO.teoria;
import java.lang.reflect.Array;
import java.util.ArrayList;
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
		
		int inputWidth = sc.nextInt();
		int inputLength = sc.nextInt();
		
		System.out.println("Type length");
		rectangle1.setLength(inputLength);
		
		System.out.println("Type width");
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
		
		ArrayList<Rectangle> rectangleList = new ArrayList<>();
		rectangleList.add(rectangle3);
		rectangleList.add(rectangle2);
		rectangleList.add(rectangle1);
		
		
		System.out.println(rectangleList);
		System.out.printf("Average Area value is: %.2f%n",getAverageArea(arrayRectangles));
	}
		//metodo que pasamos una coleccion de objetos rectangle y devuelve el valor medio
		
	public static double getAverageArea(Rectangle[] arrayRectangles) {
		double sum=0;
		for (Rectangle rectangle : arrayRectangles) {
			sum+=rectangle.getArea();
		}
		return sum/arrayRectangles.length;
	}
}

