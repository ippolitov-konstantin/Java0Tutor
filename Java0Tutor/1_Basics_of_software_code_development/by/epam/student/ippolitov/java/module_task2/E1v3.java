package by.epam.student.ippolitov.java.module_task2;

/* 3) Даны 3 точки A(x1,y1), B(x2,y2) и C(x3,y3). Определить будут ли они расположены на одной прямой. */
import java.util.Scanner;

public class E1v3 {
	public static void main(String args[]) {
		double x1, x2, x3, y1, y2, y3, z;
		x1 = 0;
		x2 = 0;
		x3 = 0;
		y1 = 0;
		y2 = 0;
		y3 = 0;

		Scanner ayn = new Scanner(System.in);
		System.out.println("Ввести x1: ");
		x1 = ayn.nextDouble();
		System.out.println("Ввести x2: ");
		x2 = ayn.nextDouble();
		System.out.println("Ввести x3: ");
		x3 = ayn.nextDouble();
		System.out.println("Ввести y1: ");
		y1 = ayn.nextDouble();
		System.out.println("Ввести y2: ");
		y2 = ayn.nextDouble();
		System.out.println("Ввести y3: ");
		y3 = ayn.nextDouble();

		if (((y3 - y1) / (y2 - y1)) == ((x3 - x1) / (x2 - x1))) {
			System.out.println("Точки лежат на одной прямой");
		} else {
			System.out.println("Точки не лежат на одной прямой");
		}

	}
}
