package ru.stqa.pft.sandbox;

public class First {

	public static void main(String[] args) {
		hello("world");
		double len = 5;
		System.out.println("Ploshchad' kvadrata so storonoy " + len + " = " + area(len));

		double a = 4;
		double b = 6;
		System.out.println(("Ploshchad' treugol'nika " + a + " and " + b + " = " + area (a,b)));
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area (double l)	{
		return l * l;
	}

	public static double area (double a, double b){
		return a * b;
	}
}



