package ru.stqa.pft.sandbox;

public class First {

	public static void main(String[] args) {
		hello("world");

		Square s = new Square(5);
		System.out.println("Ploshchad' kvadrata so storonoy " + s.l + " = " + area(s));

		Rectangle r = new Rectangle(4, 6);
		System.out.println(("Ploshchad' treugol'nika " + r.a + " and " + r.b + " = " + area (r)));
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area (Square s)	{
		return s.l * s.l;
	}

	public static double area (Rectangle r){
		return r.a * r.b;
	}
}



