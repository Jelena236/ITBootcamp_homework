package calc;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		System.out.println("Welcome! You are about to use Calculator to calculate areas of geometric shapes. You can calculate areas of square, circle and rectangle.");
		String shape;

		do {
			System.out.println("To start calculating, type in the name of the shape. If you want the program to end, type in 'stop': ");

			Scanner sc = new Scanner(System.in);
			shape = sc.next();

			switch (shape.toLowerCase()) {
			case "square":
				calcSquare();
				break;
			case "rectangle":
				calcRectangle();
				break;
			case "circle":
				calcCircle();
				break;
			case "stop":
				System.out.println("Program ends!");
				return;
			}

		} while (!shape.equals("stop"));
	}

	public static void calcCircle() {
		System.out.println("Type in the length of a radius:");
		Scanner sc = new Scanner(System.in);
		double r;
		r = sc.nextDouble();
		if (r <= 0) {
			System.out.println("Incorrect entry!");
			return;
		}
		System.out.println("The calculated area of a circle is: " + aCircle(r));
		
	}

	public static void calcRectangle() {
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.println("Type in the length a rectalnge:");
		a = sc.nextDouble();
		System.out.println("Type in the width of a rectangle");
		b = sc.nextDouble();
		if (a <= 0 || b <= 0) {
			System.out.println("Incorrect entry!");
			return;
		}
		System.out.println("The calculated area of a rectangle is: " + aRectangle(a, b));

	}

	public static void calcSquare() {
		Scanner sc = new Scanner(System.in);
		double a;
		System.out.println("Type in the length of a square side: ");
		a = sc.nextDouble();
		if (a <= 0) {
			System.out.println("Incorrect entry!");
			return;
		}
		System.out.println("The calculated area of a square is: " + aSquare(a));

	}

	public static double aCircle(double r) {
		return r * r * 3.14;
	}

	public static double aSquare(double a) {
		return a * a;
	}

	public static double aRectangle(double a, double b) {
		return a * b;
	}

}
